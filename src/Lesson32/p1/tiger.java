package Lesson32.p1;

public class tiger {
    void eat(String s) throws neMyaso{
        if (!s.equalsIgnoreCase("myaso")){
            throw new neMyaso("Тигр не ест " + s);
        }
        System.out.println("тигр ест мясо");
    }

    void drink(String s) throws neVoda {
        if (!s.equalsIgnoreCase("voda")){
            throw new neVoda(s);
        }
        System.out.println("Тигр пьет воду");
    }

}
