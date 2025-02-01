package Lesson21;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListAbc {

    static ArrayList <String> abc (String ... text) {
        ArrayList <String> arrayList = new ArrayList<>();

        for (String text2  : text) {
            if (!arrayList.contains(text2)) {
                arrayList.add(text2);
            }
        }
        Collections.sort(arrayList);

        

        return arrayList;
    }

    public static void main(String[] args) {
        System.out.println(abc("dsa", "ddf", "bsa", "asvc", "htf"));

    }
}
