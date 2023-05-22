package ast;

public class UseCustom extends CustomOrGivenFunction {
    private final String functionName;

    public UseCustom(String functionName) {
        this.functionName = functionName;
    }

    public String getFunctionName() {
        return functionName;
    }

    @Override
    public <C, T> T accept(C context, EducationalTerminalBotVisitor<C, T> v) {
        return v.visit(context,this);
    }
}
