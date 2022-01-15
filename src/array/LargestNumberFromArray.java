package array;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class LargestNumberFromArray {
    public static void main(String[] args) {
        ArrayList<String> arr;
        arr = new ArrayList<>();

        // output should be 6054854654
        arr.add("54");
        arr.add("546");
        arr.add("548");
        arr.add("60");

        printLargestNumber(arr);
    }

    private static void printLargestNumber(ArrayList<String> arr) {


        Collections.sort(arr, ( o1,  o2)-> {
                String x = o1 + o2;
                String y = o2 + o1;
                return x.compareTo(y) > 0 ? -1 : 1 ;
            });
        arr.stream().forEach(System.out::println);

    }
}
