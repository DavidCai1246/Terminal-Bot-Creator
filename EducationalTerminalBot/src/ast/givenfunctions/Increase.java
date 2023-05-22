package ast.givenfunctions;

import ast.*;

public class Increase extends GivenFunction {
    private final Name variableName;

    private final Amount amount;

    public Increase(CustomOrGivenFunction nextFunction, Name variableName, Amount amount) {
        super(nextFunction);

        this.variableName = variableName;
        this.amount = amount;
    }

    public Name getVariableName() {
        return variableName;
    }

    public Amount getAmount() {
        return amount;
    }

    @Override
    public <C, T> T accept(C context, EducationalTerminalBotVisitor<C, T> v) {
        return v.visit(context, this);
    }
}
