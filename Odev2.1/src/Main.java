import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        float[] dizi = new float[10];
        Scanner scanner = new Scanner(System.in);
        System.out.println("Dizi elemanlarını giriniz:");
        float ortalama=0;

        for(int i = 0; i < 10; i++) {
            System.out.print("Eleman " + (i + 1) + ": ");
            dizi[i] = scanner.nextFloat();

        }
        for(int i = 0; i < 10; i++) {
            ortalama =  ortalama+(dizi[i]/10);

        }
        for(int i = 0; i < 10; i++) {
            if(dizi[i]>50) {
                System.out.println("50’den büyük olan eleman :"+dizi[i]);
            }
        }
        System.out.println("ortalama: "+ortalama);


    }

}
