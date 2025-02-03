package Lesson27;

public class Pingvin extends Bird{
    Pingvin(String name){
        super(name);
    }

    @Override
    void eat() {
        System.out.println(this.name + " Пингвин любит есть рыбу");
    }

    @Override
    void sleep() {
        System.out.println(this.name + "пингвины спят прижавшись друг к другу");
    }

    @Override
    void fly() {
        System.out.println(this.name + "Пингвины не умеют летать");
    }

    @Override
    public void speak() {
        System.out.println(this.name + "Пингвины не умеют петь как соловьи");
    }
}


