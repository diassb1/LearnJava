package Lesson26.p2;
import Lesson26.p1.*;

public class Test2 extends Test1{
    Test2() {
    }
    public void abc() {
        System.out.println("Y");
    }

    public static void main(String[] args) {
        Test2 test2 = new Test2();
        test2.abc();
    }



}
