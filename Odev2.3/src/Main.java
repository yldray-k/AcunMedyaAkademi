import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] dizi = new int[10];
        int Ntoplam = 0;
        int Ptoplam = 0;

        System.out.println("10 adet sayı giriniz");
        for(int i=0;i<10;i++){
            dizi[i]=scanner.nextInt();

        }
        for(int i=0;i<10;i++){
            if(dizi[i]<0){
                Ntoplam = Ntoplam + dizi[i];
            }
            else if(dizi[i]>0){
                Ptoplam = Ptoplam + dizi[i];
            }
        }
        System.out.println("Negatif sayıların toplamı: " + Ntoplam);
        System.out.println("Pozitif sayıların toplamı: " + Ptoplam);




    }
}