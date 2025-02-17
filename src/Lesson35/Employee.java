package Lesson35;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

public class Employee {
    private String name;
    private String department;
    private int salary;

    public Employee() {
    }

    public String getName() {
        return name;
    }

    public String getDepartment() {
        return department;
    }

    public int getSalary() {
        return salary;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", department='" + department + '\'' +
                ", salary=" + salary +
                '}';
    }
}


class TestEmployee {

    static void printEmployee(Employee employee) {
        System.out.println("Имя: " + employee.getName() + ", Отдел: " + employee.getDepartment() + ", З/п: " + employee.getSalary());
    }

    static void filtrasiyaRabotnicov(ArrayList<Employee> arrayList, Predicate<Employee> predicate) {
        arrayList.forEach(s -> {
            if (predicate.test(s)) {
                System.out.println(s);
            }
        });
    }

    static void filtrasiyaRabotnicov2(ArrayList<Employee> arrayList, Predicate<Employee> predicate) {
        for (Employee s : arrayList) {
            if (predicate.test(s)) {
                printEmployee(s);
            }
        }
    }

    public static void main(String[] args) {
        Employee employee1 = new Employee();
        employee1.setName("Диас");
        employee1.setDepartment("Программист");
        employee1.setSalary(350);

        Employee employee2 = new Employee();
        employee2.setName("Олег");
        employee2.setDepartment("снабдение");
        employee2.setSalary(250);

        Employee employee3 = new Employee();
        employee3.setName("Мария");
        employee3.setDepartment("IT");
        employee3.setSalary(500);

        Employee employee4 = new Employee();
        employee4.setName("Igor");
        employee4.setDepartment("IT");
        employee4.setSalary(150);

        ArrayList<Employee> arrayList = new ArrayList<>();
        arrayList.add(employee1);
        arrayList.add(employee2);
        arrayList.add(employee3);
        arrayList.add(employee4);


        // filtrasiyaRabotnicov(arrayList, s -> s.getSalary() > 200);
        filtrasiyaRabotnicov2(arrayList, s -> s.getDepartment().equalsIgnoreCase("it"));

        System.out.println("--------------------------------------------");
        filtrasiyaRabotnicov2(arrayList, s -> s.getName().startsWith("О") && s.getSalary() < 450);

        System.out.println("--------------------------------------------");
        filtrasiyaRabotnicov2(arrayList, s -> s.getName().startsWith("I") && s.getDepartment().startsWith("I"));


        //printEmployee(employee);
    }


}
