package elif_interviewQuestions5;

import java.util.Scanner;

public class Q02_MethodTekCift {
    //verilen sayinin tek mi ciftmi oldugunu kontrol eden. ciftse dogru; tekse yanlis cevabi veren method

    public static void main(String[] args) {
        System.out.println("bir sayigir");
        Scanner scan=new Scanner(System.in);
        int sayi= scan.nextInt();

        if (sayi%2==0){
            System.out.println("true");
        }else System.out.println("false");


    }
}
