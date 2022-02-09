package java8.basic;

import java.util.ArrayList;
import java.util.List;

public class C {
    public static void main(String[] args) {

        B b = new B();
        b.overrideThisMethod();
        System.out.println("****************");
       // B b1 = new B(4);
      //  b1.overrideThisMethodSecond();

        System.out.println("******A reference check**********");
        A a = new B();
        a.overrideThisMethod();

    }
}
