package halukProje4_okulYönetimi;

import java.util.ArrayList;
import java.util.Scanner;

public class Islemler {
    static ArrayList<Kisi>ogrncListesi=new ArrayList<>();
    static ArrayList<Kisi>ogrtmListesi=new ArrayList<>();
    static Scanner scan= new Scanner(System.in);
    static String kisiTuru;


    public static void girisPaneli(){

        System.out.println("====================================\nOGRENCI VE OGRETMEN YONETIM PANELI\n" +
                "====================================\n"
                + "1- OGRENCI ISLEMLERI\n2- OGRETMEN ISLEMLERI\nQ- CIKIS");
        System.out.print("isleminiz seciniz : ");
        String secim= scan.next().toUpperCase();//secimde Q harfini buyuk veya kucuk yazabilir.

        switch (secim){

            case "1":
                kisiTuru="OGRENCI";
                islemMenusu();
                break;
            case "2":
                kisiTuru="OGRETMEN";
                islemMenusu();
                break;
            case "Q":
                cikis();
                break;
            default:
                System.out.println("hatali giris yaptiniz");
                girisPaneli();//recursive(ozyonelim) method call var.tekrar secim soracak.
                break;



        }
    }

    private static void cikis() {
        System.out.println("gule gule yine bekleriz");
    }

    public static void islemMenusu(){
        System.out.println("Sectiginiz  Kişi turu: " + kisiTuru + " icin  aşağıdaki işlemlerden tercih yapınız.\r\n"
                + "============= İŞLEMLER =============\r\n"
                + "     1-EKLEME\r\n"
                + "     2-ARAMA\r\n"
                + "     3-LİSTELEME\r\n"
                + "     4-SİLME\r\n"
                + "     0-ANA MENU");

        System.out.print("islem tercihinizi giriniz : ");
        int secilenIslem = scan.nextInt();

        switch (secilenIslem) {
            case 1:
                ekle();
                System.out.println("ekleme basariyla gerceklesti");
                islemMenusu();
                break;
            case 2:
                islemMenusu();
                break;
            case 3:
                islemMenusu();
                break;
            case 4:
                islemMenusu();
                break;
            case 0:
                girisPaneli();
                break;
            default:
                System.out.println("adam gibi bir şey girrr :( ");
                islemMenusu();

                break;
        }


    }

    private static void ekle() {

        System.out.println("****" + kisiTuru+ "ekleme sayfasi    ***");

        System.out.println("ad soyad giriniz");
        scan.nextLine();//DUMMY YANI HAYALET KOMUT. ALT ALTA VERI ISENDIGINDE OLUSAN(VERILERI AYNI ANDA ISTEME IHTIMALINE KARSI)
        String adSoyad= scan.nextLine();
        System.out.println("kimlik no giriniz");
        String kimlikNo= scan.nextLine();
        System.out.println("yas giriniz");
        int yas= scan.nextInt();

        if(kisiTuru.equals("OGRENCI")){
            System.out.println("ogrenci numara giriniz");
            scan.nextLine();//DUMMY YANI HAYALET KOMUT. ALT ALTA VERI ISENDIGINDE OLUSAN(VERILERI AYNI ANDA ISTEME IHTIMALINE KARSI)
            String ogrncNo= scan.nextLine();
            System.out.println("sinif giriniz");
            String sinif= scan.nextLine();
            Ogrenci sefilOgrenci=new Ogrenci(adSoyad,kimlikNo,yas,ogrncNo,sinif);//parametreli ogrenci classindan ogrenci creat edecek.
            ogrncListesi.add(sefilOgrenci);

        }else{
            System.out.println("ogretmen sicil no giriniz");
            String sicilNo= scan.nextLine();
            System.out.println("bolum giriniz");
            String bolum= scan.nextLine();
            Ogretmen aslanOgretmen= new Ogretmen(adSoyad,kimlikNo,yas,sicilNo,bolum);
            //ogretmen clas indaki constracordan(verileri islemlerde kendi yaptigim method dan aldim. obje olusturdum.
            ogrtmListesi.add(aslanOgretmen);
        }



    }

}
