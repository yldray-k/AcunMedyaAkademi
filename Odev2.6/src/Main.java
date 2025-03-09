import java.util.ArrayList;
import java.util.Random;

public class Main {
    public static void main(String[] args) {

        Random random = new Random();
        ArrayList<Integer> sayilar = new ArrayList<>();

        for (int i = 0; i < 20; i++) {
            sayilar.add(random.nextInt());
        }

        ArrayList<Integer> çiftsayilar = new ArrayList<>();

        for (int sayi : sayilar) {
            if (sayi % 2 == 0) {
                çiftsayilar.add(sayi);
            }
        }

        System.out.println("Çift Sayılar:");
        for (int çiftsayi : çiftsayilar) {
            System.out.println(çiftsayi);
        }
    }
}
