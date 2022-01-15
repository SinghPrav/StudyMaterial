package java8.stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FindDuplicate {
    public static void main(String[] args) {
        List<String> cars = new ArrayList<>(
                List.of(
                        "Mercedes",
                        "Toyota",
                        "Nissan",
                        "Volkswagen",
                        "Ford",
                        "Maclaren",
                        "Mercedes",
                        "Nissan",
                        "Ford"
                )
        );

        List<String> distinctCars = cars.stream().distinct().collect(Collectors.toList());
        distinctCars.forEach(System.out::println);


System.out.println("***************************************");


        List<String> stringList = Arrays.asList("John", "Martin", "Mary", "Steve");

        stringList.stream()
                .map(s -> s.toUpperCase())
                .forEach(System.out::println);



    }
}
