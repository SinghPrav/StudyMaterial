package OldData.OldMaterial.java8.Diamond;

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

    public  void testStat(){
        System.out.println("***********Parent Static C");
    }

    public  void testOver(){
        testStat();
        System.out.println("***********testOver C");
    }

    public  void testCheck(int i){
        testStat();
        System.out.println("***********testOver with value C");
    }
}
