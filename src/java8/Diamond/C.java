package java8.Diamond;

public class C implements A, B{
    int i= 1;
    public static void main(String[] args) throws CloneNotSupportedException {
        C a = new C();
        C t = (C)a.clone();

    }
    @Override
    public void check() {
        B.super.check();
    }

    public static void testStatic(){
        System.out.println("***********Parent Static C");
    }
    public  void testOver(){
        System.out.println("***********testOver C");
    }
}
