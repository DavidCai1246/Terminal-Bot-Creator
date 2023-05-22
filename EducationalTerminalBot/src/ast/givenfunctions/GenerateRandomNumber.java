package ast.givenfunctions;

import ast.CustomOrGivenFunction;
import ast.EducationalTerminalBotVisitor;
import ast.GivenFunction;
import ast.Name;

public class GenerateRandomNumber extends GivenFunction {

    public Name name;
    private int number1;
    private int number2;

    public GenerateRandomNumber(CustomOrGivenFunction nextFunction, int number1, int number2, Name name) {
        super(nextFunction);
        this.number1 = number1;
        this.number2 = number2;
        this.name = name;
    }
    public int getLowerBound() {
        return number1;
    }

    public int getUpperBound() {
        return number2;
    }

    public Name getName(){return name;}

    @Override
    public <C, T> T accept(C context, EducationalTerminalBotVisitor<C, T> v) {
        return v.visit(context,this);
    }
}
