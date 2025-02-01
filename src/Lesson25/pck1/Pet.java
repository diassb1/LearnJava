package Lesson25.pck1;

public class Pet extends Animal{
    Pet(String name){
        System.out.println("Это стринг нейм");
        }
    Pet(){
        System.out.println("I am pet");
        super.eyes = 2;
    }
    protected String name;
    protected int tail = 1;
    protected int paw = 4;

    protected void jump() {
        System.out.println("Pet jumps");
    }

    protected void run() {
        System.out.println("Pet runs");
    }
}
