package srcYeni.day36_Inheritence;

public class Memur extends Muhasebe{



    public static void main(String[] args) {

        Memur memur1= new Memur();
        //memur1 objesi Memur class in objesi olmasina ragmen
        //inherit ettigi Muhasebe ve onun da Parenti olan Personel
        //class larinda tum data lari alabilir.

        memur1.persNo=1001;
        memur1.isim="ahmet";
        memur1.soyisim="tepecik";
        memur1.adres="paris";
        memur1.tel="06616346";

        //muhasebe class indan
        memur1.saatucreti=10;
        memur1.maas= memur1.maasHesapla();
        memur1.statu="memur";
        System.out.println(memur1);


        Memur memur2=new Memur();
        memur2.statu="memur";
        memur2.isim="zafer";
        memur2.saatucreti=24;
        memur2.maas= memur2.maasHesapla();
        System.out.println(memur2);


    }
    @Override
    public String toString() {
        return "Memur{" +
                "saatucreti=" + saatucreti +
                ", statu='" + statu + '\'' +
                ", maas=" + maas +
                ", persNo=" + persNo +
                ", isim='" + isim + '\'' +
                ", soyisim='" + soyisim + '\'' +
                ", adres='" + adres + '\'' +
                ", tel='" + tel + '\'' +
                '}';
    }
}
