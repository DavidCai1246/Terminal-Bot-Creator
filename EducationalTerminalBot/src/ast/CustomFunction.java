package ast;

public class CustomFunction extends Node {
    private final String name;

    private final GivenFunction givenFunction;

    public CustomFunction(String name, GivenFunction givenFunction) {
        this.name = name;
        this.givenFunction = givenFunction;
    }

    public String getName() {
        return name;
    }

    public GivenFunction getGivenFunction() {
        return givenFunction;
    }

    @Override
    public <C, T> T accept(C context, EducationalTerminalBotVisitor<C, T> v) {
        return v.visit(context, this);
    }
}
