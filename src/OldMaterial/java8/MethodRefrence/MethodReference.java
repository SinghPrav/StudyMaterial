package OldMaterial.java8.MethodRefrence;

import java.util.HashMap;

public class MethodReference {
    public static void main(String[] args) {
        ArithmeticOperations arithemeticOperations = (a,b)->{ int sum = a+b;
            System.out.println(a+"----In lembda----"+b);
        return sum;};

        arithemeticOperations.performOps(4,5);

        ArithmeticOperations arithmeticOperation1 = MethodReference::performOps;
       int sum = arithmeticOperation1.performOps(5,6);
       System.out.println("Out"+sum);

       MethodReference methodReference = new MethodReference();
       ArithmeticOperations arithmeticOperation2 = methodReference::performMultOps;
       int mul = arithmeticOperation2.performOps(6,6);
       System.out.println("Mul"+mul);

       DummyPojoInterface dummyPojoInterface = (num, name)-> new DummyPojo(num, name);
       DummyPojo dummyPojo = dummyPojoInterface.performDummy(101, "test");
        System.out.println("----DummyPojo----"+dummyPojo);

        DummyPojoInterface dummyPojoInterface1 = DummyPojo::new;
        DummyPojo dummyPojo1 = dummyPojoInterface1.performDummy(102, "newtest");
        System.out.println("----New dummy refe----"+dummyPojo1);


        HashMap<DummyPojo, String> map= new HashMap<>();
        DummyPojo dummyPojo2 = new DummyPojo(1, "Prave");

        map.put(dummyPojo2,"Praveen" );

        System.out.println("*************"+map.values());
        dummyPojo2.setName("Pavan");

        System.out.println("*******2******"+map.values());
    }

   static int performOps(int i, int j){
        System.out.println(i+"----In Stattic ref----"+j);
        return i+j;
   }
     int performMultOps(int i, int j){
        System.out.println(i+"----In obj ref----"+j);
        return i*j;
    }


}
