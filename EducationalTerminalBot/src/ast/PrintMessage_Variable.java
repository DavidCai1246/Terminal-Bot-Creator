package ast;

public class PrintMessage_Variable extends PrintMessage {
    private final String variableName;

    public PrintMessage_Variable(String variableName) {
        this.variableName = variableName;
    }

    public String getVariableName() {
        return variableName;
    }

    @Override
    public <C, T> T accept(C context, EducationalTerminalBotVisitor<C, T> v) {
        return null;
    }
}
