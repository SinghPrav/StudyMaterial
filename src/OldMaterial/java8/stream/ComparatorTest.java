package OldMaterial.java8.stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static java.util.stream.Collectors.maxBy;
import static java.util.stream.Collectors.summingInt;

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
        List<Address> addressList = new ArrayList<>();
        Address address = new Address();
        address.setCity("Delhi");
        address.setName("South x");
        Address address1 = new Address();
        address1.setCity("Gurgaon");
        address1.setName("Sector4");
        addressList.add(address);
        addressList.add(address1);
        customeList.add(new Employee(1,"First","flast",10000,101, addressList));
        customeList.add(new Employee(2,"Second","slast",30000,102, addressList));
        customeList.add(new Employee(3,"Third","tlast",40000,103, addressList));
        customeList.add(new Employee(4,"Fourth","folast",50000,104, addressList));
        customeList.add(new Employee(5,"Fifth","fiflast",60000,105, addressList));
        List<Employee> sortcustomeList = customeList.stream().sorted((o1, o2)-> o2.getId()- o1.getId()).collect(Collectors.toList());
        System.out.println(sortcustomeList);

        List<String> sor = sortcustomeList.stream().map(Employee::getLastName).collect(Collectors.toList());
        sor.stream().forEach(i->System.out.println(i));
        System.out.println("Name list:-----"+ sor);
        tryNewExample();
    }

   static void tryNewExample(){

       Integer[] intArray = {1, 2, 3, 4, 5};

       List<Integer> list = Arrays.asList(intArray);

       Integer sum = list.stream().collect(summingInt(i-> i+1));

       System.out.println(sum);

       Integer max = list.stream().collect(maxBy(Integer::compare)).get();
       System.out.println(max);
    }





}
