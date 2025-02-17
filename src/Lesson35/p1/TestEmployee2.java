package Lesson35.p1;

import java.util.ArrayList;
import java.util.function.Predicate;

public class TestEmployee2 {

    void printEmployee(Employee employee) {
        System.out.println("Имя: " + employee.getName() + ", Отдел: " + employee.getDepartment() + ", + З/п " + employee.getSalary());
    }

    void filtraciaRabotnikov(ArrayList <Employee> employees, Predicate<Employee> predicate) {
        employees.forEach(s -> {
            if (predicate.test(s)) System.out.println(s);
        });
    }

    void filtraciaRabotnikov2(ArrayList <Employee> employees, Predicate<Employee> predicate) {
        for (Employee e : employees){
            if (predicate.test(e)) {
                printEmployee(e);
            }
        }

    }

}
