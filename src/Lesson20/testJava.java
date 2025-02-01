package Lesson20;

import java.util.Arrays;

public class testJava {
    static String[] abc(String[] ... abc) {

        String[] res = new String[lengthArray(abc)];

        UPPER: for (String[] a : abc) {
            MIDDLE: for (int i = 0; i < a.length; i++) {

                INNER: for (int j = 0; j < res.length; j++) {
                    if (res[j] == null) {
                        res[j] = a[i];
                        break INNER;
                    }
                }
            }
        }
        return res;
}

    static int lengthArray(String[] ... abc){
        int length=0;
        for (String[] a : abc){
            for (int i = 0; i < a.length; i++) {
                length += 1;
            }
        }
        return length;
    }


    public static void main(String[] args) {
        System.out.println(Arrays.toString(abc(args)));
    }
}
