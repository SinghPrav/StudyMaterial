package java8.Diamond;

public class D  extends C{
    int i =5;
    public static void main(String[] args) {
        C d = new D();
        d.testOver();
        System.out.println("***********Member of D  "+ d.i);
    }

    public static void testStatic(){
        System.out.println("***********Chile Static D");
    }
   @Override
    public  void testOver(){
        System.out.println("***********testOver  D");
    }
}
