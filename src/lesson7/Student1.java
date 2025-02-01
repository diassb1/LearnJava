package lesson7;

public class Student1 {
    int studentIDnumber;
    String nameStudent;
    String secondNameStudent;
    int yearOfStudy;
    double averageEconomic;
    double averageMath;
    double averageForeignLang;

    public Student1(int studentIDnumber, String nameStudent, String secondNameStudent, int yearOfStudy, double averageEconomic, double averageMath, double averageForeignLang) {
        this.studentIDnumber = studentIDnumber;
        this.nameStudent = nameStudent;
        this.secondNameStudent = secondNameStudent;
        this.yearOfStudy = yearOfStudy;
        this.averageEconomic = averageEconomic;
        this.averageMath = averageMath;
        this.averageForeignLang = averageForeignLang;
    }

    public Student1(int studentIDnumber, String nameStudent, String secondNameStudent, int yearOfStudy) {
        this(studentIDnumber, nameStudent, secondNameStudent, yearOfStudy, 0,0,0);
    }

    public Student1() {
    }

    double sredArifmetiv() {
        return (averageEconomic + averageMath+ averageForeignLang) / 3;
    }

    @Override
    public String toString() {
        return "Student{" +
                "ID студента=" + studentIDnumber +
                ", Ммя студента='" + nameStudent + '\'' +
                ", Фамилия студента='" + secondNameStudent + '\'' +
                ", Год обучения=" + yearOfStudy +
                ", Средняя оценка студента=" + sredArifmetiv()
                +
                '}';
    }

}
