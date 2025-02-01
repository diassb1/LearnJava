package Lesson7_1;

public class EmployeeTest {
    public static void main(String[] args) {
        Employee employee = new Employee(1, 20,"Nekke");
        Employee employee1 = new Employee(2, "Meele");

        employee.showID();
        employee.showSalary();
        employee.showSurname();
    }
}
