package Lesson25.pck1;

public class Test {
    public static void main(String[] args) {
        Cat cat1 = new Cat("Musia");
        System.out.println(cat1.eyes);
        cat1.eat();
        System.out.println(cat1.name);



        Dog dog = new Dog("Rex");
        dog.play();
        dog.run();


        Pet dog2 = new Dog("Roks");



        dog2.xoziain = "Dias";
        System.out.println(dog2.xoziain);



    }
}
