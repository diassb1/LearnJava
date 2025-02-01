    package Lesson8;

    public class StaticMethod {
        static final double pi = 3.14;

        void square(double radius) {
            System.out.println(pi* radius * radius);
        }

        static void circumference(double radius){
            System.out.println(2 * pi * radius);
        }

        void result (double raduis) {
            System.out.println(raduis);
            square(raduis);
            circumference(raduis);
        }

        public static double multiplication(double a, double b, double c){
            return a * b * c;
        }
        public static void devision(int a, int b){
            System.out.println("целое частное: " + (a / b) + "остаток от деления: " + a % b);
        }

    }


