package ast;

import java.util.List;

public class Program extends Node {
    private final List<CustomFunction> customFunctions;

    private final List<Command> commands;

    public Program(List<CustomFunction> customFunctions, List<Command> commands) {
        this.customFunctions = customFunctions;
        this.commands = commands;
    }

    public List<CustomFunction> getCustomFunctions() {
        return customFunctions;
    }

    public List<Command> getCommands() {
        return commands;
    }

    @Override
    public <C, T> T accept(C context, EducationalTerminalBotVisitor<C, T> v) {
        //return v.visit(context, this);
        return null;
    }
}
