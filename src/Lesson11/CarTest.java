package Lesson11;

public class CarTest {


    public static void main(String[] args) {
        Car car1 = new Car("Green", "v5", 2);
        Car car2 = new Car("Blue", "v6", 4);


//        car1.changeCarColor(car1);
//        car2.changeCarColor(car2);
//        System.out.println(car1.color);
//        System.out.println(car2.color);

        Car.changeCar(car1, car2);
        System.out.println(car1.color);
        System.out.println(car2.color);
    }
}


