package OldData.OldMaterial.java8.basic;

public class A {
   public int common=10;
    A(){
        System.out.println("I am in A");
    }
    A(int i){
        System.out.println("I am in A with value:"+i);
    }
    public void overrideThisMethod(){
        testThisMethod();
        System.out.println("overrideThisMethod of A");
    }

    public void testThisMethod(){
        System.out.println("testThisMethod of A");
    }
}
