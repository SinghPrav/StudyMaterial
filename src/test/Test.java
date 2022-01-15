package test;

public class Test implements ISecond, ICustome{
    public static void main(String[] args) {
    ISecond iSecond = new Test();
    ICustome iCustome = new Test();
    System.out.println("------Isecond"+iSecond.test(1,3));
        System.out.println("------Icustome"+iCustome.test(1,6));
    }

    @Override
    public int test(int a, int b) {
        return a+b;
    }
}
