public class Main {
    public static void main(String[] args) {

        Manager manager1 = new Manager(1, "Kaan Sezgi", 10000, "IT", 5);
        Manager manager2 = new Manager(3, "Yıldıray Kaya", 12000, "HR", 3);


        Developer developer1 = new Developer(2, "Emre Ortatepe", 8000, "IT", "Backend Developer");
        Developer developer2 = new Developer(4, "Ali Etdöğer", 8500, "IT", "Frontend Developer");


        System.out.println(manager1);
        System.out.println("Manager 1 Bonus: " + manager1.calculateBonus());
        System.out.println(manager2);
        System.out.println("Manager 2 Bonus: " + manager2.calculateBonus());

        System.out.println(developer1);
        System.out.println("Developer 1 Bonus: " + developer1.calculateBonus());
        System.out.println(developer2);
        System.out.println("Developer 2 Bonus: " + developer2.calculateBonus());
    }
}
