//package ast;
//
//
//public class RandomNumber extends Value {
//    private final int lowerBound;
//
//    private final int upperBound;
//
//    public RandomNumber(int lowerBound, int upperBound) {
//        this.lowerBound = lowerBound;
//        this.upperBound = upperBound;
//    }
//
//    public int getValue() {
//        return (int) (Math.random() * (upperBound - lowerBound + 1) + lowerBound);
//    }
//
//    public int getLowerBound() {
//        return lowerBound;
//    }
//
//    public int getUpperBound() {
//        return upperBound;
//    }
//
//    @Override
//    public <C, T> T accept(C context, EducationalTerminalBotVisitor<C, T> v) {
//        return v.visit(context, this);
//    }
//}
