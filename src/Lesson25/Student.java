package Lesson25;

public class Student {
    private StringBuilder name;
    private int course;
    private int grade;

    public StringBuilder getName(){
        StringBuilder sb = new StringBuilder(this.name);
        //new line for git 2
        return sb;
    }

    public int getCourse() {
        return course;
    }

    public int getGrade() {
        return grade;
    }


    public void setName(StringBuilder name) {
        if (name.length() > 3 ) {
            this.name = name;
        } else this.name = new StringBuilder("no name");
    }

    public void setCourse (int course) {
        if (course >= 1 && course <= 4) {
            this.course = course;
        }
    }

    public void setGrade (int grade) {
        if (grade >=1 && grade <=10) {
            this.grade = grade;
        }
    }

    public void showInfo() {
        System.out.printf("""
                Имя студента: %s
                Курс: %d
                Оценка: %d
                """, getName(), getCourse(), getGrade());
    }

}


