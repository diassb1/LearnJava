package Lesson27;

public class Test {
    public static void main(String[] args) {
        Mechenosec mechenosec = new Mechenosec("Меченосец");
        System.out.println(mechenosec.name);
        mechenosec.sleep();
        mechenosec.eat();
        mechenosec.swim();

        System.out.println("--------------------------");

        Speakable speakable = new Pingvin("Пингвин, ");
        speakable.speak();

        System.out.println("--------------------------");

        Animal lion = new Lion("Лев");
        System.out.println(lion.name);
        lion.sleep();
        lion.eat();

        System.out.println("--------------------------");

        Mammal lion2 = new Lion("Лев 2 ");
        lion2.run();
        lion2.eat();
        lion2.sleep();
        lion2.speak();



    }
}
