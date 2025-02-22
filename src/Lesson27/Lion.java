package Lesson27;

public class Lion extends Mammal {
    public Lion(String name) {
        super(name);
    }

    @Override
    void eat() {
        System.out.println(this.name + " Лев как хишник любит мясо");
    }

    @Override
    void sleep() {
        System.out.println(this.name + "Большую часть дня лев спит");
    }

    @Override
    void run() {
        System.out.println(this.name + "Лев не самая быстрая кошка");
    }

}
