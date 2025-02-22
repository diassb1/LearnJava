package Lesson35.p1;

public class Employee {
    private String name;
    private String department;
    private int salary;



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
        return "Работники{" +
                "Имя='" + name + '\'' +
                ", Отдел='" + department + '\'' +
                ", з/п= " + salary +
                '}';
    }
}
