import java.util.Scanner;
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        System.out.println("bir sayı giriniz");
//        int a = sc.nextInt();
//        for (int i = 1; i <= a; i++) {
//            if (a % i == 0) {
//                System.out.println(i + " a sayısının tam bölenidir");
//            }
//            else{
//                System.out.println(i+" a sayısının tam  böleni değildir");
//            }
//
//            }
        Scanner sc = new Scanner(System.in);

        System.out.println("bir sayı giriniz: ");
        int baslangic = 3;
        int bitis = 8;
        int sayi1 = sc.nextInt();


        System.out.println("ikinci sayıyı giriniz");
        int sayi2 = sc.nextInt();
        for (int i = baslangic; i <= bitis; i++) {
            System.out.println("Sayı: " + i + " için çarpım tablosu:");
            for (int j = 1; j <= 10; j++) {
                System.out.println(i + " x " + j + " = " + (i * j));
            }
            System.out.println();
            {

            }
        }
    }
}

