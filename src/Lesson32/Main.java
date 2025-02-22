package Lesson32;

public class Main {
    public static void main(String[] args) {
        Tiger tiger = new Tiger();
        tiger.eat("МЯсо");

        try {
            tiger.drink("вода");
            try {
                tiger.drink("пиво");
            } catch (NeVodaException e) {
                System.out.println("Тигр не пьет " + e.getMessage());
            }
        } catch (Exception e) {
            System.out.println("Тигр не пьет " + e.getMessage());
        } finally {
            System.out.println("Это finally блок");
        }

    }
}
