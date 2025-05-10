import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("satır sayısını giriniz");
        int satirsayisi =sc.nextInt();
        for (int i=0;i<=satirsayisi;i++){
            for (int j=0;j<=satirsayisi-i;j++){
                System.out.print(" ");

            }
            for (int k=0;k<(2*i)-1;k++){
                System.out.print("*");
            }
            System.out.println();



        }








    }
}