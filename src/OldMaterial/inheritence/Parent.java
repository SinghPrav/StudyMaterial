package OldMaterial.inheritence;

public class Parent {
    int i=10;
    public static void main(String[] args) {
        Parent pp= new Child();
        pp.show();
        System.out.println("Metod--> "+pp.i);
    }
    public void show(){
        System.out.println("Parent metod");
    }
}
 class Child extends Parent {
     int i=20;
    public void show(){
        System.out.println("child metod");
    }
}
