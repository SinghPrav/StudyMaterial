package OldData.OldMaterial.java8.stream;

import java.util.stream.IntStream;

public class IntStreamDemo {
    public static void main(String[] args) {
        IntStream.range(1,5)
                .mapToObj(i-> i%3 == 0? (i%5==0 ? "If true 5%": "If false 5%") : (i%5==0 ? "else true" : i+"Else false"))
                .forEach(i->{
                        System.out.println(i);
                });

        IntStream.range(1,5)
                .mapToObj(i-> i%3 == 0? "Yes":"No")
                .forEach(i->{
                    System.out.println(i);
                });

    }
}
