import java.util.Scanner;
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        System.out.println("taban uzunluğunu girin");
//        double taban =sc.nextDouble();
//
//        System.out.println("yükseliği giriniz");
//        double yükseklik=sc.nextDouble();
//
//        double alan=taban*yükseklik/2;
//        System.out.println(alan);
        int birinciSayi = 0, ikinciSayi=0;
        Scanner sc = new Scanner(System.in);
        System.out.println("birinciSayi giriniz");
        double sayi1 = sc.nextDouble();

        System.out.println("ikinciSayi giriniz");
        double sayi2 = sc.nextDouble();

        System.out.println("yapılacak işlemi seçiniz:(Toplam,Fark,Çarpma,Bölme");
        int islem = sc.nextByte();
        switch (islem) {
            case 1:
                System.out.println("Toplam : " + (birinciSayi+ ikinciSayi));
                break;
            case 2:
                System.out.println("Fark : " + (birinciSayi - ikinciSayi));
                break;
            case 3:
                System.out.println("Çarpma : " + (birinciSayi * ikinciSayi));
                break;
            case 4:
                System.out.println("Bölme : " + (birinciSayi / ikinciSayi));
                break;


        }
    }
}