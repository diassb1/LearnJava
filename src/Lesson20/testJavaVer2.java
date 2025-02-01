import java.util.Arrays;

public class testJavaVer2 {

    static String[] abc(String[] ... abc){
        int length = 0;
        for (String[] a : abc){
            length += a.length;
        }

        String[] array = new String[length];
        int count = 0;
        for (String[] a : abc){
            for (String b : a){
                array[count] = b;
                count++;
            }

        }
        return array;
    }

    public static void main(String[] args) {


        String[][] array = new String[][]{{"ok", "privet", "poka"}, {"ok", "hi", "bye"} };


        for (String a : args){

            for (int i = 0; i < array.length; i++) {

                if (a.equals(array[i])) {
                    array[i] = null;
                }
            }
        }

        for (String[] a : array){
            for (String b : a){
                System.out.print(b + " ");
            }
        }
        System.out.println();

        System.out.println(Arrays.toString(abc(array)));

    }
}
