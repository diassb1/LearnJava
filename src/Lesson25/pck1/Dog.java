package Lesson25.pck1;

public class Dog extends Pet {
    Dog(String name){
        System.out.println("I am a dog and my name is: "+ name);
    }

    void play() {
        System.out.println("Dogs play");
    }

    @Override
    protected void run() {
        System.out.println("Dog runs");
    }
}
