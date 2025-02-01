package Lesson13;

class MonthTest {
    int countMonth;

    public MonthTest(int countMonth) {
        this.countMonth = countMonth;
    }

    static void dayMonth(int a){
        switch (a) {
            case 1 -> System.out.println("Январь, Ферваль, Март");
            case 2 -> System.out.println("Апрель, май, июнь");
            case 3 -> System.out.println("Июль, август, сентярь");
            case 4 -> System.out.println("Октябрь, ноябрь, декабрь");
            default -> System.out.println("Нету такого месяца");
        }
    }
}

public class Month{
    public static void main(String[] args) {
        MonthTest monthTest = new MonthTest(5);
        MonthTest.dayMonth(monthTest.countMonth);
    }

}
