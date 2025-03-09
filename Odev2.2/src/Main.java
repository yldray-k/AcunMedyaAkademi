
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int[] dizi = new int[7];

        System.out.println("7 adet sayı giriniz:");
        for (int i = 0; i < dizi.length; i++) {
            dizi[i] = scanner.nextInt();
        }

        boolean[] tekrarEdiyor = new boolean[dizi.length];

        System.out.print("Tekrar eden sayılar: ");
        for (int i = 0; i < dizi.length; i++) {
            for (int j = i + 1; j < dizi.length; j++) {
                if (dizi[i] == dizi[j]) {
                    tekrarEdiyor[i] = true;
                }
            }
            if (tekrarEdiyor[i]) {
                System.out.print(dizi[i] + " ");
            }
        }
    }
}

