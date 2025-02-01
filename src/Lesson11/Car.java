package Lesson11;

public class Car {
    String color;
    String engine;
    int countDoor;

    public Car(String color, String engine, int countDoor) {
        this.color = color;
        this.engine = engine;
        this.countDoor = countDoor;
    }

    void changeCarColor (Car car){
        car.color = "black";
    }

    static void changeCar (Car car1, Car car2) {
        Car car = new Car (car1.color, null, 0);
        car1.color = car2.color;
        car2.color = car.color;
    }
}


