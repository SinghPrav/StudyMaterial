package OldData.OldMaterial.test;

public class Employee {
    String name;
    int salary;
    int depId;

    public Employee(String name, int salary, int depId) {
        this.name = name;
        this.salary = salary;
        this.depId = depId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public int getDepId() {
        return depId;
    }

    public void setDepId(int depId) {
        this.depId = depId;
    }
}
