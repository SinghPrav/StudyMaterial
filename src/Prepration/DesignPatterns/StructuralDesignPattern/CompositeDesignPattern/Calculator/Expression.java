package Prepration.DesignPatterns.StructuralDesignPattern.CompositeDesignPattern.Calculator;

public class Expression implements IArithmeticExpression{
    IArithmeticExpression leftExp;
    IArithmeticExpression rightExp;
    Operation operation;

    public Expression(IArithmeticExpression leftExp, IArithmeticExpression rightExp, Operation operation) {
        this.leftExp = leftExp;
        this.rightExp = rightExp;
        this.operation = operation;
    }

    @Override
    public int evaluate() {
        int value = 0;
        switch (operation){
            case ADD:
                value = leftExp.evaluate() + rightExp.evaluate();
                break;
            case SUB:
                value = leftExp.evaluate() - rightExp.evaluate();
                break;
            case DIV:
                break;
            case MUL:
                value = leftExp.evaluate() * rightExp.evaluate();
                break;
        }

        System.out.println("Expression value is :" + value);
        return value;

    }
}
