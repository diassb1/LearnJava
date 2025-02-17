package Lesson34.p1;

public class Lambda {


    public static void main(String[] args) {
        TestLamda testLamda = s -> s.length();
        TestLamda testLamda2 = s -> s.charAt(0);


        System.out.println(testLamda.get("Привет"));
        System.out.println(testLamda2.get("Привет"));


    }
}
