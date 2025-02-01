class BankTest {
    int id;
    String name;
    double balance;


    @Override
    public String toString() {
        return "BankTest{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", balance=" + balance +
                '}';
    }

    void addBalance(double _balance) {
     balance += _balance;
    }

    void deleteBalance(double _balance) {
     balance -= _balance;
    }

}

    public class BankAccount{
        public static void main(String[] args) {
            BankTest bA  = new BankTest();

            bA.id = 1;
            bA.name = "Mike";
            bA.balance = 25.5;

            System.out.println(bA.toString());

            bA.addBalance(30);

            System.out.println(bA.toString());

            bA.deleteBalance(25);

            System.out.println(bA.toString());


        }
    }

