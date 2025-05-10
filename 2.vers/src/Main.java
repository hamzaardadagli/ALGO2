import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

            System.out.println("1. sayıyı giriniz");
        int a = scn.nextInt();

            System.out.println("2.sayıyı giriniz");
        int b =scn.nextInt();

        if(a>b){
            System.out.println("1.sayı 2.sayıdan büyüktür");
        }
        else if(a<b){
            System.out.println("1.sayı 2.sayıdan küçüktür");
        }
        else{
            System.out.println("1.sayı ile 2.sayı eşittir");
        }

        }
    }
