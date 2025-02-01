package Lesson25.pck1;

public class Cat extends Pet{
    Cat(String name){
        super(name);
        super.eyes = 3;
        System.out.println("I am a cat and my name: " + name);
    }


    void sleep() {
        System.out.println("Cat sleeps");
    }

    @Override
    protected void eat() {
        System.out.println("Cat eats");
    }
}
