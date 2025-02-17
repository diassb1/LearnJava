package Lesson27;


abstract public class Animal {
    Animal(String name) {
        this.name = name;
    }
    String name;

    abstract void eat();
    abstract void sleep();

}

abstract class Fish extends Animal {
    Fish (String name){
        super(name);
    }

    @Override
    void sleep() {
        System.out.println("Всегда интересно наблюдать как спят рыбы");
    }

     abstract void swim();
}


abstract class Bird extends Animal implements Speakable {
    Bird(String name) {
        super(name);
    }

    @Override
    public void speak() {
        System.out.println(this.name + " sings");;
    }

    abstract void fly();
}

abstract class Mammal extends Animal implements Speakable{
    Mammal(String name){
        super(name);
    }

    abstract void run();
}


class Mechenosec extends Fish{
    Mechenosec(String name) {
        super(name);
    }

    @Override
    void swim() {
        System.out.println("Меченосец красивая рыба которая быстро плавает");
    }

    @Override
    void eat() {
        System.out.println("Меченосец не хищняя рыба поэтому кушает корм");
    }
}