package Lesson33;

import java.time.*;
import java.time.format.*;

public class DateAndTime {
    public static void main(String[] args) {


        LocalDateTime ld = LocalDateTime.of(2016, 1, 1, 9,0);
        LocalDateTime ld2 = LocalDateTime.of(2016, 2, 3, 9,0);

        Period p = Period.of(0,1,2);
        Duration d = Duration.ofMinutes(600);
        smena(ld, ld2, p, d);


        }

    static  void smena(LocalDateTime start, LocalDateTime end, Period p, Duration d){
        while (start.isBefore(end)) {
            DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy, MMMM-dd !! hh:mm");
            System.out.println("Работаем с: " + start.format(dtf));
            start = start.plus(p);
            System.out.println(start.format(dtf));

            DateTimeFormatter dtf2 = DateTimeFormatter.ofPattern("hh:mm, dd/MMM/yy");
            System.out.println("Отдыхаем с: " + start.format(dtf2));

            start = start.plus(d);
            System.out.println("До: " + start.format(dtf2));




        }

    }
}
