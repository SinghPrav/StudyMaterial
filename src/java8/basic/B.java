package java8.basic;

public class B extends  A{
    B(){
        System.out.println("I am in B");
    }
    B(int i){
        System.out.println("I am in B :"+i);
    }
    @Override
    public void overrideThisMethod(){
        System.out.println("overrideThisMethod of B");
    }

    public void overrideThisMethodSecond(){
        System.out.println("overrideThisMethodSecond of B");
    }

}
