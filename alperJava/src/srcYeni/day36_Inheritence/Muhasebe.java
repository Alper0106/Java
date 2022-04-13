package srcYeni.day36_Inheritence;

public class Muhasebe extends Personel{
    protected int saatucreti;
    protected String statu;
    protected int maas;


    protected int maasHesapla(){
        int maas=saatucreti*8*30;
        return maas;
    }

}
