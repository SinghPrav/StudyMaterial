package OldMaterial.java8.basic;

public class B extends  A {
    public int common=20;
    B(){
        System.out.println("I am in B");
    }
    B(int i){
      //  super(i);
        System.out.println("I am in B :"+i);
    }
    @Override
    public void overrideThisMethod(){
        System.out.println("overrideThisMethod of B : "+common);
    }

    public void overrideThisMethodSecond(){
        System.out.println("overrideThisMethodSecond of B");
    }

}
