package Lesson25;

public class StudentTest {
    public static void main(String[] args) {
        Student student1 = new Student();
        student1.setName(new StringBuilder("Иван"));
        student1.setCourse(4);
        student1.setGrade(8);

        Student student2 = new Student();
        student2.setName(new StringBuilder("Каша"));
        student2.getName().append("!!!");
        student2.setCourse(5);
        student2.setGrade(11);

        student1.showInfo();
        student2.showInfo();
    }

}
