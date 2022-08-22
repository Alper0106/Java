package day38_Inheritence_Overriding;

public class UstaBasi extends Isci{
    public String statu= "ustabasi";
    public String haklar="ustabasi haftada bir gun tatil haklara sahiptir";



    public void mesai(){
        System.out.println("ariza varsa ustabasi extra ucret almadan calisir");
    }
    public void maasHesapla(){
        System.out.println("ustabasi 30 gun* 8 saat* 12 euro= "+(30*8*12)+ "euro maas alir");

    }

    public static void main(String[] args) {
        /* icinde bulundugumuz class dan klasik haliyle bir obje olusturuyorsak
        o obje ile cagirdigimiz variable ve method larda
        java once icinde bulundugumuz class a bakar.
        aradigimiz class ugesi, icinde bulundugumuz class da varsa getirir.
        Yoksa, Parent class lara bakar ilk buldugunu getirir.
         */

        UstaBasi yasin= new UstaBasi();
        System.out.println(yasin.statu);//ustabasi
        System.out.println(yasin.haklar);//ustabasi haftada bir gun tatil haklara sahiptir
        System.out.println(yasin.ikramiye);//isciler yilda bir ikramiye alir
        System.out.println(yasin.izin);//tum personel yilda 4 hafta izin kullanabilir
        yasin.maasHesapla();
        yasin.mesai();

        //eger isci olarak ozelliklerini gormek istersek,
        // class adini(Data Turunu) isci seceriz

        Isci ahmet= new UstaBasi();
        System.out.println(ahmet.statu);//isci
        System.out.println(ahmet.haklar);//isciler kidem tazminati alir
        System.out.println(ahmet.ikramiye);//isciler yilda bir ikramiye alir
        System.out.println(ahmet.izin);//tum personel yilda 4 hafta izin kullanabilir
        ahmet.maasHesapla();
        ahmet.mesai();
        //bir objeyi hangi class dan tanimlarsaniz, o class a sahip ozelliklere sahip olur.

        Personel adem= new UstaBasi();
        System.out.println(adem.statu);//personel
        System.out.println(adem.haklar);//tum personel esit haklara sahiptir
        //System.out.println(adem.ikramiye);//CTE verir
        System.out.println(adem.izin);//tum personel yilda 4 hafta izin kullanabilir
        adem.maasHesapla();
        adem.mesai();
        /*
        Personel adem= new UstaBasi();
        Personel adem= new Personel();
         */

        /*
        Personel adem= new UstaBasi();
        adem in data turu personeldir.
        boylece biz adem i ne olarak isimlzndirdigimizi bilebiliriz.
        Ancak ben Adem in ustabasi oldugunu biliyorum.
        cunku constructor u ustabasi
        Ama bu yazim formati ile
        adem in tum personel ile birlikte sahip oldugu
        ortak ozellikleri vurgulamak istiyorum.

        Bu kullanim seklinde olusturulan obje, data turu olarak secilen class
        ve onun parent class larindaki variable lari kullanabilir.
         */
    }
}
