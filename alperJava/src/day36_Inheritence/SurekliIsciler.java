package day36_Inheritence;

public class SurekliIsciler extends Isci{
    @Override
    public String toString() {
        return "SurekliIsciler{" +
                "iscistatu='" + iscistatu + '\'' +
                ", saatucreti=" + saatucreti +
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
        SurekliIsciler surisc1= new SurekliIsciler();
        surisc1.persNo=5001;
        surisc1.isim="cem";
        surisc1.soyisim="akay";
        surisc1.statu="isci";
        surisc1.saatucreti=11;
        surisc1.maas= surisc1.maasHesapla();
        System.out.println(surisc1);

    }

}
