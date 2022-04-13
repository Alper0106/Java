package srcYeni.elif_interviewQuestions5;

import java.util.List;

public class Q06_MultiMethodVarags {
    //farkli 4 ogrencinin 6, 4, 3 ve 5 yazili notlarinin ortalamalarini yazdiran
    // parametreli bir metod olusturun.

    public static void main(String[] args) {
        notOrtalamasi("ali", 30,50,88,90,25,65);
        notOrtalamasi("veli", 30,50,88,90);
        notOrtalamasi("deli", 30,25,65);
        notOrtalamasi("ben", 88,90,25,65,55);
    }

    private static void notOrtalamasi(String isim, double ...not) {
        double toplam=0;
        for (double each:not) {
            toplam += each;

        }
        System.out.println(isim+ "'nin ortalamasi= "+ toplam/not.length);

    }

}
