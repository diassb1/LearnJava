package Lesson32;

import java.io.*;

public class Tiger {
    void eat(String s) {
        if (!s.equalsIgnoreCase("мясо")) {
            throw new NeMyasoExeption("Тигр не ест " + s);
        }
        System.out.println("Тигр ест мясо");
    }

    void drink(String s) throws NeVodaException {
        if (!s.equalsIgnoreCase("вода")){
            throw new NeVodaException(s);
        }
        System.out.println("Тигр пьет воду");
    }

}
