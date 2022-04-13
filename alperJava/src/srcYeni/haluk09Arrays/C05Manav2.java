package srcYeni.haluk09Arrays;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class C05Manav2 {


    static List<String> urunListesi=new ArrayList<>();
    static List<Double> urunFiyatlari= new ArrayList<>();
    static double toplamodeme;
    static Scanner scan= new Scanner(System.in);

    public static void main(String[] args) {
        /*
         * Basit bir 5 ürünlü manav alisveris programi yaziniz.
         *
         * 1. Adim : urun listesinden urun sectir ve kac kilo oldugunu sor.
         * 2. Adim : Baska bir urun almak isteyip istemedigini sor.
         *            istemiyorsa toplam miktari goster, istiyorsa tekrar urun sectir.
         *            Bu islemi alisverisi bitirmek isteyene kadar tekrarla.
         * 3. Adim : Musteri her urun sectiginde, aldigi urunun fiyatini toplam fiyata ekle.
         * 4. Adim : Alisveris bitince toplam odemesi gereken tutari goster.
         *
         * */
        urunListesi.add("domates, kodu1");
        urunListesi.add("muz, kodu2");
        urunListesi.add("elma, kodu3");
        urunListesi.add("erik, kodu4");
        urunListesi.add("cilek, kodu5");

        urunFiyatlari.add(15.0);
        urunFiyatlari.add(18.0);
        urunFiyatlari.add(8.0);
        urunFiyatlari.add(47.0);
        urunFiyatlari.add(27.0);

        System.out.println(urunListesi);

        musteriSecim(); //recursive method tur. metod metod u cagirir bu sekilde. pek tercih edilmez. hata payi yuksektir.

    }

    private static void musteriSecim() {

        System.out.println("urun kodu girin= ");
        int secim= scan.nextInt();
        System.out.println("kac kilo alacaksiniz");
        double kilo= scan.nextDouble();
        double urunTutari= kilo*urunFiyatlari.get(secim-1);
        toplamodeme+=urunTutari;
        System.out.println("alisverise devam etmek istiyorsaniz 1, kasa icin 2 seciniz");
        int devamke= scan.nextInt();
        if (devamke==1){
            musteriSecim();
        }else
            kasa();


    }

    private static void kasa() {
        System.out.println("tesekkurler yine bekleriz= " + toplamodeme);
    }
}
