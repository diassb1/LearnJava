package Lesson15;

public class doWhileTest {

    static void time(){
        int a = 0;



        OUTER: while (a < 24){
            int i = 0;

            MIDDLE: while (i < 60){
                int k = 0;

                if (a > 1 && i ==10 ) {
                    break OUTER;
                }

                INNER: do {
                    if (k * a > i) {
                        continue INNER;

                    }
                    System.out.println(a + ":" + i + ":" + k);
                    k++;
                }  while (k < 60);

                i++;
            }

            a++;
        }
    }

    public static void main(String[] args) {
        time();
    }
}


