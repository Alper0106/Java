package elif_interviewQuestions5;

import java.util.Scanner;

public class Q01_DoWhileSayiSiralama {
    // 100 den kucuk sayilari do while kullanarak 5 er 5 er artacak sekilde siralayiniz
    public static void main(String[] args) {
        sayiartirma();


    }

    private static void sayiartirma() {
        System.out.println("sayi gir");
        Scanner scan=new Scanner(System.in);
        int sayi= scan.nextInt();
        if (sayi<100) {
            do {
                sayi = sayi + 5;
                System.out.print(sayi + ",");
            } while (sayi < 100);
        }else {
            System.out.println("sayi 100 den kucuk degil. tekrar dene");
            sayiartirma();
        }
    }
}
