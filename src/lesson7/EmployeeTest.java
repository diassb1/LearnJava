package lesson7;

import Lesson7_1.Employee;

public class EmployeeTest {
    public static void main(String[] args) {
        Lesson7_1.Employee employee = new Lesson7_1.Employee(1, 150, "Lesson7_EmployeeTest");

        employee.showSalary();
        employee.showSurname();
    }
}
