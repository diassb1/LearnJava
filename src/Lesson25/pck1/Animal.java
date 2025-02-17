package Lesson25.pck1;

public class Animal {
    Animal(){
        System.out.println("I am animal");
    }
    protected String name;

    protected int eyes;

    protected void eat() {
        System.out.println("Animals eats");
    }

    protected void drink() {
        System.out.println("Animals drinks");
    }
}
