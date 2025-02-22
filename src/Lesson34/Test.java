package Lesson34;

import java.util.ArrayList;
import java.util.Arrays;

public class Test {
    public static void main(String[] args) {
        ArrayList<Student> list = new ArrayList<>();
        Student student = new Student("Иван,", "m,", 22, 3, 8.3 );
        Student student3 = new Student("Николай,", "m,", 28, 2, 6.4 );
        Student student2 = new Student("Маша,", "f,", 23, 3, 9.1 );
        Student student4 = new Student("Елена,", "f,", 19, 1, 8.9 );
        Student student5 = new Student("Петр,", "m,", 35, 4, 7 );


        list.add(student);
        list.add(student2);
        list.add(student3);
        list.add(student4);
        list.add(student5);

        FindStudentOverAge findStudentOverAge = new FindStudentOverAge();
        FindStudentUnderAge findStudentUnderAge = new FindStudentUnderAge();

        Student.studentInfo2(list, findStudentOverAge);
        System.out.println("--------------------------------------");
        Student.studentInfo2(list, findStudentUnderAge);

    }
}
