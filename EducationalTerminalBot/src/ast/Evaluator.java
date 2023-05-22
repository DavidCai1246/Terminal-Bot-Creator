
package ast;

import ast.givenfunctions.*;

import java.util.*;

public class Evaluator implements EducationalTerminalBotVisitor<StringBuilder,Integer> {

    private final Map<String, Amount> symbolTable = new HashMap<>();
    private final Map<String, GivenFunction> functionTable = new HashMap<>();
    private Scanner scanner;

    @Override
    public Integer visit(StringBuilder errors, Program p, String command, Scanner scanner) {
        this.scanner = scanner;

        for (CustomFunction customFunction : p.getCustomFunctions()) {
            customFunction.accept(errors,this);
            if(errors.length() != 0) {
                break;
            }
        }

        for(Command c: p.getCommands()) {
            if(c.getName().equals(command)) {
                c.accept(errors, this);
            }
            if(errors.length() != 0) {
                break;
            }
        }

        return null;
    }

    @Override
    public Integer visit(StringBuilder errors, Amount amount) {
        return amount.getValue();
    }

    @Override
    public Integer visit(StringBuilder errors, Command command) {
        CustomOrGivenFunction function = command.getFunction();
        function.accept(errors, this);
        return null;
    }

    @Override
    public Integer visit(StringBuilder errors, CustomFunction customFunction) {
        functionTable.put(customFunction.getName(), customFunction.getGivenFunction());
        return null;
    }

    @Override
    public Integer visit(StringBuilder errors, CustomOrGivenFunction customOrGivenFunction) {
        return null;
    }

    @Override
    public Integer visit(StringBuilder errors, GivenFunction givenFunction) {
//        if (givenFunction.getNextFunction() != null) {
//            givenFunction.getNextFunction().accept(errors, this);
//        }
        return null;
    }

//    @Override
//    public Integer visit(StringBuilder errors, RandomNumber randomNumber) {
//        return randomNumber.getValue();
//    }

    @Override
    public Integer visit(StringBuilder errors, UseCustom useCustom) {
        GivenFunction stored = functionTable.get(useCustom.getFunctionName());
        stored.accept(errors, this);
        return null;
    }

    @Override
    public Integer visit(StringBuilder errors, Decrease decrease) {
        if(!symbolTable.containsKey(decrease.getVariableName().getText())) {
            errors.append("Can't operate on variable that has not been set");
        }
        int newSum = symbolTable.get(decrease.getVariableName().getText()).getValue() - decrease.getAmount().getValue();
        Amount newAmount = new Amount(newSum);

        symbolTable.put(decrease.getVariableName().getText(), newAmount);
        runNextFunction(errors,decrease);
        return null;
    }

    @Override
    public Integer visit(StringBuilder errors, GenerateRandomNumber generateRandomNumber) {
        int lowerBound = generateRandomNumber.getLowerBound();
        int upperBound = generateRandomNumber.getUpperBound();

        if(lowerBound > upperBound) {
            errors.append("Upper bound is lower than lower bound");
        }

        Amount amount = new Amount((int) (Math.random() * (upperBound - lowerBound + 1) + lowerBound));
        symbolTable.put(generateRandomNumber.getName().getText(),amount);
        runNextFunction(errors,generateRandomNumber);
        return null;
    }

    @Override
    public Integer visit(StringBuilder errors, IfStatement ifStatement) {
        int targetValue;
        if(ifStatement.getAmount().getValue() == null){
            targetValue = symbolTable.get(ifStatement.getAmount().getVariableName()).getValue();
        }else{
            targetValue = ifStatement.getAmount().getValue();
        }

        if(symbolTable.get(ifStatement.getVariableName().getText()).getValue().equals(targetValue)) {
            ifStatement.getFunctionIfTrue().accept(errors, this);
        }
        else {
            ifStatement.getFunctionIfFalse().accept(errors, this);
        }
        runNextFunction(errors,ifStatement);
        return null;
    }

    @Override
    public Integer visit(StringBuilder errors, Increase increase) {
        if(!symbolTable.containsKey(increase.getVariableName().getText())) {
            errors.append("Can't operate on variable that has not been set");
        }
        int newSum = symbolTable.get(increase.getVariableName().getText()).getValue() + increase.getAmount().getValue();
        Amount newAmount = new Amount(newSum);

        symbolTable.put(increase.getVariableName().getText(), newAmount);
        runNextFunction(errors,increase);
        return null;
    }

    @Override
    public Integer visit(StringBuilder errors, Loop loop) {
        while(!symbolTable.get(loop.getVariableName()).getValue().equals(loop.getAmount().getValue())) {
            loop.getFunction().accept(errors, this);
        }
        runNextFunction(errors,loop);
        return null;
    }

    @Override
    public Integer visit(StringBuilder errors, Print print) {
        StringBuilder outputString = new StringBuilder();
        for(PrintMessage message: print.getMessages()) {
                if(message instanceof PrintMessage_Text) {
                    outputString.append(((PrintMessage_Text) message).getText());
                }
                else if (message instanceof PrintMessage_Variable) {
                    Amount value = symbolTable.get(((PrintMessage_Variable) message).getVariableName());
                    if(value.getValue() != null) {
                        outputString.append(value.getValue());
                    }
                    else if (value.getVariableName() != null) {
                        outputString.append(value.getVariableName());
                    }
                    else {
                        errors.append("Could not find variable");
                    }
                }
        }

        System.out.println(outputString);


        if(print.getRequiresUserInput()) {
            String userInput = scanner.nextLine();
            if (isNumeric(userInput)){
                symbolTable.put("userInput", new Amount(Integer.parseInt(userInput)));
            }else{
                symbolTable.put("userInput", new Amount(userInput));
            }
        }
        runNextFunction(errors, print);
        return null;
    }



    @Override
    public Integer visit(StringBuilder errors, SetVariable setVariable) {
        symbolTable.put(setVariable.getVariableName().getText(), setVariable.getAmount());
        runNextFunction(errors,setVariable);
        return null;
    }

    @Override
    public Integer visit(StringBuilder context, Name name) {
        return null;
    }

    private void runNextFunction(StringBuilder errors, GivenFunction givenFunction) {
        if (givenFunction.getNextFunction() != null) {
            givenFunction.getNextFunction().accept(errors, this);
        }
    }

    // with help from https://stackabuse.com/java-check-if-string-is-a-number/. Still wrote this code on my own, but used the website as guideline
    public static boolean isNumeric(String string) {
        if(string == null || string.equals("")) {
            return false;
        }
        try {
            int intValue = Integer.parseInt(string);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }
}