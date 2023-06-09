package ast;

import java.util.Objects;

public class Name extends Node {
    private final String text;

    public Name(String text) {
        this.text = text;
    }

    public String getText() {
        return text;
    }

    @Override
    public String toString() {
        return getText();
    }

    @Override
    public <C,T> T accept(C context, EducationalTerminalBotVisitor<C,T> v) {
        return v.visit(context, this);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || !(o instanceof Name)) return false;

        Name name = (Name) o;

        return Objects.equals(text, name.text);
    }

    @Override
    public int hashCode() {
        return text != null ? text.hashCode() : 0;
    }
}