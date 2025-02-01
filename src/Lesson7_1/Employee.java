package Lesson7_1;

public class Employee {
    int iD;
    private double salary;
    public String surname;

    public Employee(int iD, double salary, String surname) {
        this.iD = iD;
        this.salary = salary;
        this.surname = surname;
    }

    private Employee(double salary) {
        this(0, salary, null);
    }

    Employee(int id, String surname) {
        this(id, 0, surname);
    }

    public void showID(){
        System.out.println(iD);
    }

    public void showSalary(){
        System.out.println(salary);
    }

    public void showSurname(){
        System.out.println(surname);
    }

   
}





