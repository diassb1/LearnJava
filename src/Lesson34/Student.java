package Lesson34;

import java.util.ArrayList;

public class Student {
    public Student(String name, String sex, int age, int course, double avgGrade) {
        this.name = name;
        this.sex = sex;
        this.age = age;
        this.course = course;
        this.avgGrade = avgGrade;
    }

    String name;
    String sex;
    int age;
    int course;
    double avgGrade;


    static void StudentInfo(Student student) {
        System.out.println("Имя студента: " + student.name + " Пол: " + student.sex + " возраст" + student.age + " курс: " + student.course + " оценка: " + student.avgGrade );
    }

    static void studentInfo2(ArrayList<Student> as, StudentChecks sc){
        for (Student s : as){
            if (sc.studentCheck(s)) Student.StudentInfo(s);
        }
    }

}

class FindStudentOverAge implements StudentChecks {
    @Override
    public boolean studentCheck(Student student) {
        return student.age > 20;
    }
}

class FindStudentUnderAge implements StudentChecks {
    @Override
    public boolean studentCheck(Student student) {
        return student.age < 23;
    }
}
