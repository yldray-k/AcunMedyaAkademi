import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> sayilar = new ArrayList<>();

        System.out.println("10 adet sayı giriniz:");
        for (int i = 0; i < 10; i++) {
            sayilar.add(scanner.nextInt());
        }

        Collections.sort(sayilar, Collections.reverseOrder());

        System.out.println("Büyükten küçüğe sıralı liste: " + sayilar);
    }
}

        

