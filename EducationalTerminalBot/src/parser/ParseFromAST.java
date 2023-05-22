package parser;

import ast.*;
import ast.givenfunctions.*;

import java.util.ArrayList;
import java.util.List;

public class ParseFromAST extends BotParserBaseVisitor<Node> {
    @Override
    public Program visitProgram(BotParser.ProgramContext ctx) {
        List<CustomFunction> customFunctions = new ArrayList<>();
        for (BotParser.CustomFunctionContext c : ctx.customFunction()) {
            customFunctions.add((CustomFunction) c.accept(this));
        }

        List<Command> commands = new ArrayList<>();
        for (BotParser.CommandContext c : ctx.command()) {
            commands.add((Command) c.accept(this));
        }

        return new Program(customFunctions, commands);
    }

    @Override
    public CustomFunction visitCustomFunction(BotParser.CustomFunctionContext ctx) {
        return new CustomFunction(ctx.functionName().getText(), (GivenFunction) ctx.givenFunction().accept(this));
    }

    @Override
    public Command visitCommand(BotParser.CommandContext ctx) {
        return new Command(ctx.commandName().getText(), (CustomOrGivenFunction) ctx.customOrGivenFunction().accept(this));
    }

    @Override
    public CustomOrGivenFunction visitCustomOrGivenFunction(BotParser.CustomOrGivenFunctionContext ctx) {
        if (ctx.useCustom() != null) {
            return new UseCustom(ctx.useCustom().functionName().getText());
        } else {
            return (CustomOrGivenFunction) ctx.givenFunction().accept(this);
        }
    }

    @Override
    public Node visitGivenFunction(BotParser.GivenFunctionContext ctx) {
        // We chain these to prevent the visitor from force visiting all child nodes
//        if (ctx.storeToken() != null) {
//            return ctx.storeToken().accept(this);
//        } else if (ctx.ifStatement() != null) {
        if (ctx.ifStatement() != null) {
            return ctx.ifStatement().accept(this);
        } else if (ctx.increase() != null) {
            return ctx.increase().accept(this);
        } else if (ctx.decrease() != null) {
            return ctx.decrease().accept(this);
        } else if (ctx.setVariable() != null) {
            return ctx.setVariable().accept(this);
        } else if (ctx.loop() != null) {
            return ctx.loop().accept(this);
        } else if (ctx.print() != null) {
            return ctx.print().accept(this);
        }else if(ctx.randomNumber() != null){
            return ctx.randomNumber().accept(this);
        }
        return null;
    }
//        @Override
//    public Node visitGivenFunction(BotParser.GivenFunctionContext ctx) {
//        // We chain these to prevent the visitor from force visiting all child nodes
//        return new GivenFunction((CustomOrGivenFunction) ctx.customOrGivenFunction().accept(this), (CustomOrGivenFunction) ctx.NEXT());
//    }

    // TODO: need to get number from context
//    @Override
//    public Node visitStoreToken(BotParser.StoreTokenContext ctx) {
//        return new StoreToken(
//                getNextFunction((BotParser.GivenFunctionContext) ctx.parent),
//                ctx.variableName().getText(),
//                ctx.NUMBER()
//        );
//    }

    @Override
    public IfStatement visitIfStatement(BotParser.IfStatementContext ctx) {
        CustomOrGivenFunction functionIfTrue = ctx.nestedCustomOrGivenFunction(0) != null ? (CustomOrGivenFunction) ctx.nestedCustomOrGivenFunction(0).customOrGivenFunction().accept(this) : null;
        CustomOrGivenFunction functionIfFalse = ctx.nestedCustomOrGivenFunction(1) != null ? (CustomOrGivenFunction) ctx.nestedCustomOrGivenFunction(1).customOrGivenFunction().accept(this) : null;

        return new IfStatement(
                getNextFunction((BotParser.GivenFunctionContext) ctx.parent),
                new Name(ctx.variableName().getText()),
                (Amount) ctx.amount().accept(this),
                functionIfTrue,
                functionIfFalse
        );
    }

    @Override
    public Amount visitAmount(BotParser.AmountContext ctx) {
        if (ctx.NUMBER() != null) {
            return new Amount(Integer.parseInt(ctx.NUMBER().getText()));
        } else {
            return new Amount(ctx.variableName().getText());
        }
    }

    @Override
    public Node visitRandomNumber(BotParser.RandomNumberContext ctx) {
//        return new RandomNumber(Integer.parseInt(ctx.NUMBER(0).getText()), Integer.parseInt(ctx.NUMBER(1).getText()));
        return new GenerateRandomNumber(getNextFunction((BotParser.GivenFunctionContext) ctx.parent),
                Integer.parseInt(ctx.NUMBER(0).getText()),
                Integer.parseInt(ctx.NUMBER(1).getText()),
                new Name(ctx.variableName().getText())
                );
    }

    @Override
    public Increase visitIncrease(BotParser.IncreaseContext ctx) {
        return new Increase(
                getNextFunction((BotParser.GivenFunctionContext) ctx.parent),
                new Name(ctx.expression().variableName().getText()),
                (Amount) ctx.expression().amount().accept(this)
        );
    }

    @Override
    public Node visitDecrease(BotParser.DecreaseContext ctx) {
        return new Decrease(
                getNextFunction((BotParser.GivenFunctionContext) ctx.parent),
                new Name(ctx.expression().variableName().getText()),
                (Amount) ctx.expression().amount().accept(this)
        );
    }

    @Override
    public Node visitSetVariable(BotParser.SetVariableContext ctx) {
        return new SetVariable(
                getNextFunction((BotParser.GivenFunctionContext) ctx.parent),
                new Name(ctx.variableName().getText()),
                (Amount) ctx.amount().accept(this)
        );
    }

    @Override
    public Node visitLoop(BotParser.LoopContext ctx) {
        return new Loop(
                getNextFunction((BotParser.GivenFunctionContext) ctx.parent),
                (CustomOrGivenFunction) ctx.nestedCustomOrGivenFunction().customOrGivenFunction().accept(this),
                ctx.condition().variableName().getText(),
                (Amount) ctx.condition().amount().accept(this)
        );
    }



    @Override
    public Print visitPrint(BotParser.PrintContext ctx) {
        List<PrintMessage> messages = new ArrayList<>();
        for (BotParser.MsgContext msg : ctx.msg()) {
            messages.add((PrintMessage) msg.accept(this));
        }

        return new Print(
                getNextFunction((BotParser.GivenFunctionContext) ctx.parent),
                messages,
                ctx.HAS_USER_INPUT() != null
        );
    }

    @Override
    public PrintMessage visitMsg(BotParser.MsgContext ctx) {
        if (ctx.callVar() != null) {
            return new PrintMessage_Variable(ctx.callVar().variableName().getText());
        } else {
            return new PrintMessage_Text(ctx.TEXT().getText());
        }
    }

    private CustomOrGivenFunction getNextFunction(BotParser.GivenFunctionContext givenFunctionContext) {
        if (givenFunctionContext.customOrGivenFunction() == null) {
            return null;
        }

        return (CustomOrGivenFunction) givenFunctionContext.customOrGivenFunction().accept(this);
    }
}