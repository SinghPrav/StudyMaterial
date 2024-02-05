package OldMaterial.java8.basic;

public class C {
    public static void main(String[] args) {

        B b = new B();
        b.overrideThisMethod();
        System.out.println("**********common******"+b.common);

        B b1 = new B(4);
        b1.overrideThisMethodSecond();

        System.out.println("******B reference B's object check**********"+b1.common);

        A a = new B();
        a.overrideThisMethod();

        System.out.println("******A reference and B's Objectcheck for common**********"+a.common);

        A a1 = new A();
        a1.overrideThisMethod();
        System.out.println("******A reference and A's Objectcheck**********"+a1.common);

    }
}
