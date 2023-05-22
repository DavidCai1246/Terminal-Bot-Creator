package ast.givenfunctions;

import ast.CustomOrGivenFunction;
import ast.EducationalTerminalBotVisitor;
import ast.GivenFunction;
import ast.PrintMessage;

import java.util.List;

public class Print extends GivenFunction {
    private final List<PrintMessage> messages;

    private final boolean requiresUserInput;

    public Print(CustomOrGivenFunction nextFunction, List<PrintMessage> messages, boolean requiresUserInput) {
        super(nextFunction);

        this.messages = messages;
        this.requiresUserInput = requiresUserInput;
    }

    public List<PrintMessage> getMessages() {
        return messages;
    }

    public boolean getRequiresUserInput() {
        return requiresUserInput;
    }

    @Override
    public <C, T> T accept(C context, EducationalTerminalBotVisitor<C, T> v) {
        return v.visit(context,this);
    }
}
