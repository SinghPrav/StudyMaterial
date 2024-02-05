package Prepration.DesignPatterns.StructuralDesignPattern.CompositeDesignPattern.Calculator;

public class CalculatorClient {

        /* 2X(1+7)
                X
             2    +
                 1   7
         */


    public static void main(String[] args) {
        IArithmeticExpression two = new Number(2);
        IArithmeticExpression one = new Number(1);
        IArithmeticExpression seven = new Number(7);

        Expression addExpression = new Expression(one, seven, Operation.ADD);
        Expression mulExpression = new Expression(two, addExpression, Operation.MUL);
        System.out.println("Output:: "+ mulExpression.evaluate());
    }
}
