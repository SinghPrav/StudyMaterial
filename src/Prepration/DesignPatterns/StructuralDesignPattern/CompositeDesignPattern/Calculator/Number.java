package Prepration.DesignPatterns.StructuralDesignPattern.CompositeDesignPattern.Calculator;

public class Number implements IArithmeticExpression{
    int number;

    public Number(int number) {
        this.number = number;
    }

    @Override
    public int evaluate() {
        System.out.println("Number is:: "+ number);
        return number;
    }
}
