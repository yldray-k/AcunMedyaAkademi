import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        ArrayList<String> kelime = new ArrayList<>();

        System.out.println("Lütfen 10 adet kelime giriniz:");

        for (int i = 0; i < 10; i++) {
            System.out.print("Kelime " + (i + 1) + ": ");
            String word = scanner.nextLine();
            kelime.add(word);
        }

        Collections.sort(kelime);

        System.out.println("\nAlfabetik sıraya göre sıralanmış kelimeler:");
        for (String word : kelime) {
            System.out.println(word);
        }

        scanner.close();
    }
}
