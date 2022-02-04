package java8.basic;

import java.util.HashMap;

public class MapTest {
    public static void main(String[] args) {
        A a= new A(2);
        HashMap<A, Integer> map = new HashMap<>();
        for(int i=0;i<5;i++) {
            map.put(a, 1);
        }
        System.out.println("Size-> "+map.size());
    }
}
