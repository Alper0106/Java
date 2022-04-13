package srcYeni.day35_inheritance;

public class Isci extends Personel{
    public static void main(String[] args) {

        Personel objPers= new Personel();
        objPers.isim="eren";
        objPers.soyisim="terzioglu";
        objPers.adres="paris";

        Isci objIsci= new Isci();
        objIsci.isim= "huseyin";
        objIsci.soyisim=" selint";
        objIsci.adres="paris";

    }
}
