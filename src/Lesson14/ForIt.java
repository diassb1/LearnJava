package Lesson14;

public class ForIt {

    static void time() {
        OUTER: for (int i = 0; i < 6; i++) {

            INNER: for (int j = 0; j < 60; j++) {
                if (i > 1 && j ==10 ) {
                    break OUTER;
                }

                INNER2:for (int k = 0; k < 60; k++) {

                    System.out.println(i + ":" + j +":" + k);

                    if (k * i > j) {
                        continue INNER2;

                    }

                }

            }

        }
    }

    public static void main(String[] args) {
        time();
    }
}

