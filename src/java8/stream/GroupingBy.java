package java8.stream;

import java8.Diamond.C;

import java.util.*;
import java.util.function.BinaryOperator;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class GroupingBy {
    public static void main(String[] args) {
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
        customeList.add(new Employee(1,"First","flast",10000,101,addressList));
        customeList.add(new Employee(2,"Second","slast",30000,102, addressList));
        customeList.add(new Employee(3,"Third","tlast",40000,103, addressList));
        customeList.add(new Employee(6,"Extra","tlast",70000,103, addressList));
        customeList.add(new Employee(4,"Fourth","folast",50000,104, addressList));
        customeList.add(new Employee(5,"Fifth","fiflast",60000,105, addressList));
        //Print employees base on Dept
        Map<Integer,List<Employee>> emplBasedOnDept =   customeList.stream().collect(Collectors.groupingBy(Employee::getDepId,Collectors.toList()));
        emplBasedOnDept.entrySet().forEach(System.out::println);

        Map<Integer, Long> coutnOfEmpInDpt = customeList.stream().collect(Collectors.groupingBy(Employee::getDepId, Collectors.counting()));
        coutnOfEmpInDpt.entrySet().forEach(System.out::println);

        Long filterList = customeList.stream().filter(e-> e.getSalary()> 40000).count();
        System.out.println("Count :"+filterList);

        Optional<Integer> nthSal = customeList.stream().map(Employee::getSalary).sorted(Comparator.reverseOrder()).skip(2).findFirst();
        System.out.println(nthSal);

        Optional<Employee> optionalEmployee = customeList.stream().max(Comparator.comparing(Employee::getSalary));
        System.out.println("***********Only name*******");
        optionalEmployee.stream().map(Employee::getFirstName).forEach(System.out::println);
        System.out.println("***********After only *******");
        System.out.println(optionalEmployee);

        Map<Integer, Optional<Employee>> maxSalaryByDepid = customeList.stream().collect(Collectors.groupingBy(Employee::getDepId,
                Collectors.reducing( BinaryOperator.maxBy(Comparator.comparing(Employee::getSalary)))));
        Map<Integer, Optional<Employee>> minSalaryByDepid = customeList.stream().collect(Collectors.groupingBy(Employee::getDepId,Collectors.minBy(Comparator.comparing(Employee::getSalary))));
        System.out.println("*********** MAX  Start *******");
        maxSalaryByDepid.entrySet().forEach(System.out::println);
        System.out.println("*********** MAX  End *******");
        System.out.println("*********** MIN  Start *******");
        minSalaryByDepid.entrySet().forEach(System.out::println);
        System.out.println("***********MIN End  *******");

        System.out.println("***********Final check only *******");
        Stream.of(maxSalaryByDepid).forEach(System.out::println);


        Set<Employee> emp = customeList.stream().map(e->e).collect(Collectors.toSet());

        System.out.println("***********Normal*******");
        emp.forEach(i-> System.out.println(i));

       Set<List<Address>> empAdd = customeList.stream().map(e->e.getAddressList()).collect(Collectors.toSet());
        System.out.println("*********Map*********");
        empAdd.forEach(i-> System.out.println(i));

        Set<Address> flate = customeList.stream().flatMap(e->e.getAddressList().stream()).collect(Collectors.toSet());
        System.out.println("*********Flatmap*********");
        flate.forEach(i-> System.out.println(i));





    }
}
