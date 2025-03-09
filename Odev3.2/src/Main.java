public class Main {
    public static void main(String[] args) {

        BankAccount account1 = new SavingsAccount("Yıldıray Kaya", 10000);
        BankAccount account2 = new CheckingAccount("Kubilay Kaya", 5000);


        account1.displayAccountInfo();
        System.out.println("Interest Earned: TL" + account1.calculateInterest());
        System.out.println("----------------------");

        account2.displayAccountInfo();
        System.out.println("Interest Earned: TL" + account2.calculateInterest());
    }
}