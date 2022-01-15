package java8.Diamond;

public interface B {
    default void check(){
        System.out.println("I am from B");
    }

    static void notOver(){

    }
}
