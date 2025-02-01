public class EmployeeTest {
    public static void main(String[] args) {
        Employee employee = new Employee(1, "Kileoff", 25, 150,"Отдел продаж");
        Employee employee2 = new Employee(2, "Mikeoff", 35, 230,"Отдел закупа");

        System.out.println(employee.toString());
        System.out.println(employee2.toString());

        employee.salaryX2();
        employee2.salaryX2();

        System.out.println(employee.toString());
        System.out.println(employee2.toString());


    }
}
