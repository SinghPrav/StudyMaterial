package designpatterns.strutural.composite;

public class Manager implements Employee{
    private String name;
    private String empId;
    private String position;

    public Manager(String name, String empId, String position) {
        this.name = name;
        this.empId = empId;
        this.position = position;
    }


    @Override
    public void showEmployeeDetails() {
        System.out.println(empId+"-----"+name);
    }
}
