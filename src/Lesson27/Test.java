package Lesson27;

public class Test {
    public static void main(String[] args) {
        Animal animal = new Mechenosec("Меченосец ");
        Animal animal1 = new Pingvin("Пингвин ");
        Animal animal2 = new Lion("Лев ");
        Fish fish = new Mechenosec("Меченосец 2");
        Bird bird = new Pingvin("Пингвин 2");
        Mammal mammal = new Lion("Лев 2");
        Mechenosec mechenosec = new Mechenosec("Меченосец 3");
        Pingvin pingvin = new Pingvin("Пингвин 3");
        Lion lion = new Lion("Лев 3");
        Speakable speakable = new Pingvin("Пингвин 4");
        Speakable speakable1 = new Lion("Лев 4");

        Animal[] animals = new Animal[]{animal, animal1, animal2, fish, bird, mammal, mechenosec, pingvin, lion};
        Speakable[] speakables = new Speakable[]{speakable, speakable1, pingvin, lion, bird, mammal};

        for (Animal a : animals) {
            if (a instanceof Mechenosec) {
                Mechenosec m = (Mechenosec) a;
                m.swim();
                m.eat();
                m.sleep();
            } else if (a instanceof Pingvin) {
                a.eat();
                ((Pingvin) a).fly();
                ((Pingvin) a).speak();
            } else if (a instanceof Lion) {
                a.eat();
                a.sleep();
                ((Lion) a).run();
            }
        }

        for (Speakable s : speakables) {
            if (s instanceof Pingvin) {
                Pingvin pingvin1 = (Pingvin) s;
                pingvin1.sleep();
                pingvin1.fly();
                pingvin1.eat();
                pingvin1.speak();
            } else if (s instanceof Lion) {
                Lion lion1 = (Lion) s;
                lion1.sleep();
                lion1.run();
                lion1.eat();
                lion1.speak();

            }
        }


    }
}
