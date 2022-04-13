package srcYeni.elifPractice;

import java.util.Scanner;

public class interwiew3 {
    public static void main(String[] args) {
        // STRING OLAN PIN kodunuzu kontrol eden bir kod yazınız.

        String pin="said.12345";
                Scanner scan= new Scanner(System.in);
                int girishakki=4;

        System.out.println("***hosgeldiniz****");

        while (true){
            System.out.println("pin kodu giriniz");
            String girilenpin= scan.nextLine();

            if (pin.equals(girilenpin)){
                System.out.println("basarili giris yaptiniz");
                break;}

            else{
                    System.out.println("yanlis giris yaptiniz");
                    girishakki--;
                    System.out.println("kalan giris hakkiniz= " + girishakki);
                }
            if (girishakki==0){
            System.out.println("kartiniz bloke oldu");
            break;

        }}
        }

    }


