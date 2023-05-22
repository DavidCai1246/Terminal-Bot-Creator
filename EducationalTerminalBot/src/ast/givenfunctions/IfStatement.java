package ast.givenfunctions;

import ast.*;

public class IfStatement extends GivenFunction {
    private final Name variableName;

    private final Amount amount;

    private final CustomOrGivenFunction functionIfTrue;

    private final CustomOrGivenFunction functionIfFalse;

    public IfStatement(CustomOrGivenFunction nextFunction,
                       Name variableName,
                       Amount amount,
                       CustomOrGivenFunction functionIfTrue,
                       CustomOrGivenFunction functionIfFalse) {
        super(nextFunction);

        this.variableName = variableName;
        this.amount = amount;
        this.functionIfTrue = functionIfTrue;
        this.functionIfFalse = functionIfFalse;
    }

    public Name getVariableName() {
        return this.variableName;
    }

    public Amount getAmount() {
        return this.amount;
    }

    public CustomOrGivenFunction getFunctionIfTrue() {
        return functionIfTrue;
    }

    public CustomOrGivenFunction getFunctionIfFalse() {
        return functionIfFalse;
    }

    @Override
    public <C, T> T accept(C context, EducationalTerminalBotVisitor<C, T> v) {
        return v.visit(context, this);
    }
}
