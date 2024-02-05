package OldMaterial.java8.Diamond;

public class D  extends C{
    int i =5;
    public static void main(String[] args) {
        D d = new D();
        d.testCheck(3);
    }

    public static void testStatic(){
        System.out.println("***********Chile Static D");
    }

   @Override
    public  void testOver(){
        System.out.println("***********testOver  D");
    }


}
