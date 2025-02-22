package Lesson35.p1;

import java.util.ArrayList;
import java.util.function.Supplier;

public class Runner2 {
    static ArrayList<Employee> createThreeCars(Supplier<Employee> supplier){
        ArrayList<Employee> al = new ArrayList<>();
        for (int i = 0; i < 4; i++) {
            al.add(supplier.get());

        }
        return al;
    }

    public static void main(String[] args) {
        Employee employee = new Employee();


        ArrayList <Employee> arrayList = createThreeCars(() -> new Employee());
        arrayList.forEach(s-> System.out.println(s));



    }
}
