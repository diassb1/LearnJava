package Lesson26.Test5;

class X{
    String s1 = "Privet";

}

class Y extends X{
    boolean bool = false;
}

public class Test {
    public static void main(String[] args) {
        X x = new Y();
        System.out.println(x.s1 + " ");
    }
}
