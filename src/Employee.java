public class Employee {
    int id;
    String surname;
    int age;
    double salary;
    String department;

    public Employee(int id, String surname, int age, double salary, String department) {
        this.id = id;
        this.surname = surname;
        this.age = age;
        this.salary = salary;
        this.department = department;
    }

    @Override
    public String toString() {
        return "Сотрудник{" +
                "id=" + id +
                ", Фамилия='" + surname + '\'' +
                ", Возраст=" + age +
                ", Зарплата=" + salary +
                ", Отделение='" + department + '\'' +
                '}';
    }

    void salaryX2() {
        salary *= 2;
    }
}

