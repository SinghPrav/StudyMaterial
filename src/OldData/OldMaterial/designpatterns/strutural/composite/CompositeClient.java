package OldData.OldMaterial.designpatterns.strutural.composite;

public class CompositeClient {
    public static void main(String[] args) {
        Developer developer = new Developer("First", "101", "Developer");
        Developer developer1 = new Developer("Second", "102", "sr Developer");

        CompanyDirectory engDirectory = new CompanyDirectory();
        engDirectory.addEmployee(developer);
        engDirectory.addEmployee(developer1);

        Manager manager = new Manager("third", "103", "Asst Manager");
        Manager manager1 = new Manager("fourth", "104", "product Manager");
        CompanyDirectory proDirectory = new CompanyDirectory();
        proDirectory.addEmployee(manager);
        proDirectory.addEmployee(manager1);

        CompanyDirectory directory = new CompanyDirectory();
        directory.addEmployee(engDirectory);
        directory.addEmployee(proDirectory);
        directory.showEmployeeDetails();

    }
}
