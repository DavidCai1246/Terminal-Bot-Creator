package ast.givenfunctions;

import ast.Amount;
import ast.CustomOrGivenFunction;
import ast.EducationalTerminalBotVisitor;
import ast.GivenFunction;

public class Loop extends GivenFunction {
    private final CustomOrGivenFunction function;

    private final String variableName;

    private final Amount amount;

    public Loop(CustomOrGivenFunction nextFunction, CustomOrGivenFunction function, String variableName, Amount amount) {
        super(nextFunction);

        this.function = function;
        this.variableName = variableName;
        this.amount = amount;
    }

    public CustomOrGivenFunction getFunction() {
        return function;
    }

    public String getVariableName() {
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
