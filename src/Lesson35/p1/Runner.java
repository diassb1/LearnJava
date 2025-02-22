package Lesson35.p1;

import java.util.ArrayList;

public class Runner {
    public static void main(String[] args) {
        TestEmployee2 testEmployee2 = new TestEmployee2();
        Employee employee1 = new Employee();

        employee1.setName("Диас");
        employee1.setDepartment("IT");
        employee1.setSalary(500);

        Employee employee2 = new Employee();
        employee2.setName("Егор");
        employee2.setDepartment("Прогер");
        employee2.setSalary(350);

        Employee employee3 = new Employee();
        employee3.setName("Павел");
        employee3.setDepartment("Павел");
        employee3.setSalary(200);

        ArrayList<Employee> arrayList = new ArrayList<>();

        arrayList.add(employee1);
        arrayList.add(employee2);
        arrayList.add(employee3);

        arrayList.forEach(s -> testEmployee2.printEmployee(s));
        System.out.println("----------------------------------------------");

        testEmployee2.filtraciaRabotnikov(arrayList, s -> s.getDepartment().equalsIgnoreCase("it") && s.getSalary() > 200);
        System.out.println("----------------------------------------------");

        testEmployee2.filtraciaRabotnikov(arrayList, (Employee s) -> s.getName().startsWith("Е") && s.getSalary() < 450);
        System.out.println("----------------------------------------------");

        testEmployee2.filtraciaRabotnikov(arrayList, (Employee s) -> s.getName().equalsIgnoreCase(s.getDepartment()));
        System.out.println("----------------------------------------------");



    }

}
