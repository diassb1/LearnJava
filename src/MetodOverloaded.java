//import lesson7.Student1;

public class MetodOverloaded {

    int sumOfNumbers(int a, int b) {
        return a + b;
    }

    int sumOfNumbers(int b, int c, int d) {
        return this.sumOfNumbers(b, c) + d;
    }

    int sumOfNumbers(int a, int b, int c, int d) {
        return this.sumOfNumbers(a, b, c) + d;
    }
    int sumOfNumbers() {
        return 0;
    }


}

class MetodOverloadedTest {
    public static void main(String[] args) {
        MetodOverloaded metodOverloaded = new MetodOverloaded();

        System.out.println(metodOverloaded.sumOfNumbers(5, 3, 10, 2));
        System.out.println(metodOverloaded.sumOfNumbers());

        lesson7.Student1 student1 = new lesson7.Student1(1, "Niki", "Valery", 4, 20, 10.2, 3.5);
        System.out.println(student1.toString());


      ;

    }
}
