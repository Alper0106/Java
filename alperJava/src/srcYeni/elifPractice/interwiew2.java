package srcYeni.elifPractice;

import java.util.Scanner;

public class interwiew2 {
    public static void main(String[] args) {


    /*     Ask user enter a positive number and check if it is prime or not
        Kullanıcıdan pozitif bir sayı girmesini isteyin ve asal olup olmadığını kontrol edin */

    Scanner scan= new Scanner(System.in);
        System.out.println("pozitif bir sayi giriniz");
        int sayi= scan.nextInt();

        boolean asalmi= true;
        for (int i = 2; i <sayi ; i++) {
            if (sayi%i==0){
                asalmi=false;
                break;
            }

        }
        if (asalmi) System.out.println("sayi asaldir");
        else System.out.println("asal degildir");

    }
}
