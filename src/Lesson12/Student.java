package Lesson12;

import java.util.Objects;

public class Student {
    String nameStudent;
    int course;

    public Student(String nameStudent, int course) {
        this.nameStudent = nameStudent;
        this.course = course;
    }

    static void equalStudent (Student student1, Student student2) {
        if (student1.nameStudent.equals(student2.nameStudent)) {
            System.out.println("Студенты равны");
        } else {
            System.out.println("Студенты не равны");
        }
    }

        static void equalStudent3 (Student student1, Student student2){
        if (student1.nameStudent.equals(student2.nameStudent) && student2.course == student1.course ) {
            System.out.println("Студенты равны");
        } else {
            System.out.println("Студенты не равны");
        }
    }

    static void equalStudent2 (Student student1, Student student2){
        if (student1.nameStudent.equals(student2.nameStudent)) {
            if (student1.course == student2.course){
                System.out.println("Имя и курс одинковые");
            } else {
                System.out.println("Имя одинаковые курс нет");
            }
        }else {
            System.out.println("не одинковые совсем");
        }
    }


}
