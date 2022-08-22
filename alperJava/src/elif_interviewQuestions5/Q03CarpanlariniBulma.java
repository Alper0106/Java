package elif_interviewQuestions5;

import java.util.Scanner;

public class Q03CarpanlariniBulma {
    //herhangi bir integer degerinin sayisinin carpanlarinin sayisini veren cod yazin.

    public static void main(String[] args) {
        System.out.println("bir tam sayi giriniz");
        Scanner scan=new Scanner(System.in);
        int sayi= scan.nextInt();
        int caunt=0;

        if (sayi<0){
            sayi=-sayi;
        }


        for (int i = 1; i <=sayi ; i++) {

            if (sayi%i==0){
                System.out.print(i+", ");
                caunt++;

            }

        }
        System.out.println("");
        System.out.println("girdiginiz sayinin pozitif carpanlarinin sayisi= "+caunt);

    }
}
