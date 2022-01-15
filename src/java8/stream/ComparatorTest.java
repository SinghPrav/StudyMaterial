package java8.stream;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class ComparatorTest {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("First");
        list.add("Second");;
        list.add("Third");;
        list.add("Fourth");;
        list.add("Fifth");;
        list.add("Sixth");;

        List<String> sorted = list.stream().sorted(Comparator.naturalOrder()).collect(Collectors.toList());
        System.out.println(sorted);
        List<String> sorttest = list.stream().sorted((o1, o2) -> o1.compareTo(o2) ).collect(Collectors.toList());
        System.out.println(sorttest);

        List<Employee> customeList = new ArrayList<>();
        customeList.add(new Employee(1,"First","flast"));
        customeList.add(new Employee(2,"Second","slast"));
        customeList.add(new Employee(3,"Third","tlast"));
        customeList.add(new Employee(4,"Fourth","folast"));
        customeList.add(new Employee(5,"Fifth","fiflast"));
        List<Employee> sortcustomeList = customeList.stream().sorted((o1, o2)-> o2.getId()- o1.getId()).collect(Collectors.toList());
        System.out.println(sortcustomeList);
    }
}
