package ast;

public class Amount extends Value {
    private final Integer value;
    private final String variableName;

    public Amount(int value) {
        this.value = value;
        this.variableName = null;
    }
    public Amount(String variableName) {
        this.value = null;
        this.variableName = variableName;
    }

    /**
     * Returns the amount value
     * @return the amount value or null if not defined
     */
    public Integer getValue() {
        return value;
    }

    /**
     * Returns the variable name
     * @return the variable name or null if not defined
     */
    public String getVariableName() {
        return variableName;
    }

    @Override
    public <C, T> T accept(C context, EducationalTerminalBotVisitor<C, T> v) {
        return v.visit(context, this);
    }
}
