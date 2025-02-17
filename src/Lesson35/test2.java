package Lesson35;

import java.util.ArrayList;
import java.util.Objects;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

 class Employee2 {
    String name;
    String department;
    int salary;

    public Employee2() {}

     @Override
     public String toString() {
         return "Employee2{" +
                 "name='" + name + '\'' +
                 ", department='" + department + '\'' +
                 ", salary=" + salary +
                 '}';
     }
 }


class TestEmployee1 {

    static void printEmployee(Employee2 employee) {
        System.out.println("Имя: " + employee.name + ", Отдел: " + employee.department + ", З/п: " + employee.salary );
    }

    static void filtrasiyaRabotnicov(ArrayList<Employee2> arrayList, Predicate <Employee2> predicate){
        for (Employee2 employee : arrayList){
            if (predicate.test(employee))
            System.out.println(employee.toString());
        }

    }

    public static void main(String[] args) {
        Employee2 employee1 = new Employee2();
        employee1.name = ("Диас");
        employee1.department = ("Программист");
        employee1.salary = 350;

        Employee2 employee2 = new Employee2();
        employee2.name = ("Олег");
        employee2.department = ("снабдение");
        employee2.salary = 250;

        ArrayList<Employee2> arrayList = new ArrayList<>();
        arrayList.add(employee1);
        arrayList.add(employee2);


       TestEmployee1.filtrasiyaRabotnicov(arrayList, s -> s.salary > 200 );


        //printEmployee(employee);
    }







}
