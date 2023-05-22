package ast;

public class PrintMessage_Text extends PrintMessage {
    private final String text;

    public PrintMessage_Text(String text) {
        this.text = text;
    }

    public String getText() {
        return text;
    }

    @Override
    public <C, T> T accept(C context, EducationalTerminalBotVisitor<C, T> v) {
        return null;
    }
}
