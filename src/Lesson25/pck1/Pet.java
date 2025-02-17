package Lesson25.pck1;

public class Pet extends Animal{

    Pet(){
        System.out.println("I am pet");
        super.eyes = 2;
    }
    Pet(String name) {
        this.name = name;
    }

    protected String xoziain;

    protected int tail = 1;
    protected int paw = 4;

    protected void jump() {
        System.out.println("Pet jumps");
    }

    protected void run() {
        System.out.println("Pet runs");
    }
}
