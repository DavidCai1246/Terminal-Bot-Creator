package ast;

public class Command extends Node {
    private final String name;

    private final CustomOrGivenFunction function;

    public Command(String name, CustomOrGivenFunction function) {
        this.name = name;
        this.function = function;
    }

    public String getName() {
        return name;
    }

    public CustomOrGivenFunction getFunction() {
        return function;
    }

    @Override
    public <C, T> T accept(C context, EducationalTerminalBotVisitor<C, T> v) {
        return v.visit(context,this);
    }
}
