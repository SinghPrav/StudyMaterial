package OldMaterial.java8.stream;

import java.util.*;
import java.util.function.BinaryOperator;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static java.util.stream.Collectors.maxBy;

public class GroupingBy {
    static List<Employee> customeList = new ArrayList<>();
    static List<Address> addressList = new ArrayList<>();

    public static void main(String[] args) {

        Address address = new Address();
        address.setCity("Delhi");
        address.setName("South x");
        Address address1 = new Address();
        address1.setCity("Gurgaon");
        address1.setName("Sector4");
        addressList.add(address);
        addressList.add(address1);
        customeList.add(new Employee(1, "First", "flast", 10000, 101, addressList));
        customeList.add(new Employee(2, "Second", "slast", 30000, 102, addressList));
        customeList.add(new Employee(3, "Third", "tlast", 40000, 103, addressList));
        customeList.add(new Employee(6, "Extra", "tlast", 70000, 103, addressList));
        customeList.add(new Employee(4, "Fourth", "folast", 50000, 104, addressList));
        customeList.add(new Employee(5, "Fifth", "fiflast", 60000, 105, addressList));
        try {
            //Print employees base on Dept

            Map<Integer, List<Employee>> emplBasedOnDept = customeList.stream().collect(Collectors.groupingBy(Employee::getDepId, Collectors.toList()));

            emplBasedOnDept.entrySet().forEach(System.out::println);

            //Use filter method
            Long filterList = customeList.stream().filter(e -> e.getSalary() > 40000).count();
            System.out.println("Filter Count :" + filterList);


            //Sort in reverse order

            Optional<Integer> nthSal = customeList.stream().map(Employee::getSalary).sorted(Comparator.reverseOrder()).skip(2).findFirst();
            int nthSalOutput = nthSal.orElse(0);
            System.out.println("Nth salary output::: ->  " + nthSalOutput);

            Optional<Employee> optionalEmployee = customeList.stream().max(Comparator.comparing(Employee::getSalary));
            System.out.println("***********Only name*******");
            optionalEmployee.stream().map(Employee::getFirstName).forEach(System.out::println);
            System.out.println("***********After only *******");
            System.out.println(optionalEmployee);

            Map<Integer, Optional<Employee>> maxSalaryByDepid = customeList.stream().collect(Collectors.groupingBy(Employee::getDepId,
                    Collectors.reducing(BinaryOperator.maxBy(Comparator.comparing(Employee::getSalary)))));

            Map<Integer, Optional<Employee>> minSalaryByDepid = customeList.stream().collect(Collectors.groupingBy(Employee::getDepId,
                    Collectors.minBy(Comparator.comparing(Employee::getSalary))));

            System.out.println("*********** MAX  Start *******");
            maxSalaryByDepid.entrySet().forEach(System.out::println);

            System.out.println("*********** MAX  End *******");

            System.out.println("*********** MIN  Start *******");
            minSalaryByDepid.entrySet().forEach(System.out::println);
            System.out.println("***********MIN End  *******");

            System.out.println("***********Final check only *******");
            Stream.of(maxSalaryByDepid).forEach(System.out::println);


            Set<Employee> emp = customeList.stream().map(e -> e).collect(Collectors.toSet());

            System.out.println("***********Normal*******");
            emp.forEach(i -> System.out.println(i));

            Set<List<Address>> empAdd = customeList.stream().map(e -> e.getAddressList()).collect(Collectors.toSet());
            System.out.println("*********Map*********");
            empAdd.forEach(i -> System.out.println(i));

            Set<Address> flate = customeList.stream().flatMap(e -> e.getAddressList().stream()).collect(Collectors.toSet());
            System.out.println("*********Flatmap*********");
            flate.forEach(i -> System.out.println(i));

            Stream<Integer> stream
                    = Stream.of(2, 3, 2, 4, 5, 6, 7, 8, 9, 10);

            // apply takeWhile to take all the numbers
            // matches passed predicate
            List<Integer> list
                    = stream.takeWhile(number -> {
                        if (number % 2 == 0) {
                            return true;
                        }
                        return false;
                    })
                    .collect(Collectors.toList());

            List<Integer> list1
                    = stream.dropWhile(number -> {
                        if (number % 2 == 0) {
                            return true;
                        }
                        return false;
                    })
                    .collect(Collectors.toList());

            // print list
            System.out.println(list);
            System.out.println(list1);
        } catch (Exception e) {

        }

        tryNewExample();
    }

    static void tryNewExample() {
        Optional<Integer> nthSal = customeList.stream().map(Employee::getSalary).sorted(Comparator.reverseOrder()).skip(2).findFirst();
        int nthSalOutput = nthSal.orElse(0);
        System.out.println("Nth salary output::: ->  " + nthSalOutput);

        customeList.stream()
                .max(Comparator.comparing(Employee::getSalary))
                .stream().map(i -> i.getSalary()).forEach(it -> {
                    System.out.println("Final Max salary:::: -> " + it);
                });

    }
}
