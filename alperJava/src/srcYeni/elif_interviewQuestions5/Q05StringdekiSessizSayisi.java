package srcYeni.elif_interviewQuestions5;

import java.util.Locale;
import java.util.Scanner;

public class Q05StringdekiSessizSayisi {
    //verilen bir stringdeki sesli hard(aeiou)lerin sayisini yazan cod

    public static void main(String[] args) {
        System.out.println("bir string giriniz");
        Scanner scan=new Scanner(System.in);
        String str= scan.next().toLowerCase(Locale.ROOT);
        /*int index=0;
        int sayac=0;
        while (index<str.length()){
            char c=str.charAt(index);
            if (c=='a' || c=='e' || c=='i' || c=='o'||c=='u'){
                sayac++;
                System.out.print(c+" ");
            }
            index++;
        }
        System.out.println();
        System.out.println("sesli harf sayisi= "+ sayac);

         */


        String s=str.replaceAll("[^aeiou]", "");
        System.out.println(s);
        System.out.println();
        System.out.println("sesli hatf sayisi="+ s.length());
    }
}
