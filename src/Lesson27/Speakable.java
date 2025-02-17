package Lesson27;

public interface Speakable {
    default void speak(){
        System.out.println("Someone sings");
    };
}
