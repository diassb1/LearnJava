package Lesson32.p1;

public class test {
    public static void main(String[] args) {
        tiger tiger = new tiger();
        tiger.eat("myaso");

        try {
            tiger.drink("voda2");
        } catch (neVoda e) {
            System.out.println("Тигр не пьет " + e.getMessage());
        }
    }

}
