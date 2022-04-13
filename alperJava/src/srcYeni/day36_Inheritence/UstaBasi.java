package srcYeni.day36_Inheritence;

public class UstaBasi extends Isci{
    @Override
    public String toString() {
        return "UstaBasi{" +
                "iscistatu='" + iscistatu + '\'' +
                 " ,\n saatucreti=" + saatucreti +
                ", statu='" + statu + '\'' +
                ", maas=" + maas +
                ", persNo=" + persNo +
                ", isim='" + isim + '\'' +
                ", soyisim='" + soyisim + '\'' +
                ", adres='" + adres + '\'' +
                ", tel='" + tel + '\'' +
                '}';
    }

    public static void main(String[] args) {
        UstaBasi ustbas1=new UstaBasi();
        ustbas1.isim="levent";
        ustbas1.soyisim="yardimci";
        ustbas1.saatucreti=15;
        ustbas1.maas= ustbas1.maasHesapla();
        System.out.println(ustbas1);

    }
}
