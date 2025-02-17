package Lesson36;

import java.util.ArrayList;

public class Generics {
    public static void main(String[] args) {
        Info<Integer> info = new Info<>(500);
        System.out.println(info.getValue());

        ArrayList<String> al = new ArrayList<>();
        al.add("1");
        al.add("2");
        al.add("3");

        GenMethod genMethod = new GenMethod();
        System.out.println(genMethod.getSecondElements(al));
    }
}


class Info <T> {
    private T value;

    public Info(T value){
        this.value = value;
    }

    public T getValue(){
        return this.value;
    }
}


class GenMethod {

    public <T> T getSecondElements(ArrayList<T> arrayList){
        return arrayList.get(1);
    }
}
