package ast;

import org.antlr.v4.runtime.tree.TerminalNode;
import parser.BotParser;

public abstract class GivenFunction extends CustomOrGivenFunction {
    private final CustomOrGivenFunction nextFunction;

    public GivenFunction(CustomOrGivenFunction nextFunction) {
        this.nextFunction = nextFunction;
    }

    /**
     * Returns the next function to call
     * @return the next function or null if no functions left
     */
    public CustomOrGivenFunction getNextFunction() {
        return nextFunction;
    }

//    @Override
//    public <C, T> T accept(C context, EducationalTerminalBotVisitor<C, T> v) {
//        return v.visit(context,this);
//    }
}
