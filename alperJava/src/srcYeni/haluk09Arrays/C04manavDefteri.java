package srcYeni.haluk09Arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class C04manavDefteri {

    static List<String>gunler= new ArrayList<>(Arrays.asList("Pazartesi", "Sali", "Carsamba", "Persembe", "Cuma",
            "Cumartesi","Pazar"));
    static List<Double> gunlukKazanclar= new ArrayList<>();
    static Scanner scan= new Scanner(System.in);
    static double ciro=0;
    static double gunlukHasilat=0;

    /*
     * Bir bakkalın 7 günlük tüm kazançlarını günlük olarak gösteren bir program yazınız.
     * Ayrıca bakkalın bu hafta ortalama kazandığı miktarı gösteren bir method yazınız.
     * Ayrıca bakkalın hangi günler ortalamanın üstüne kazandığını gösteren bir method yazınız.
     * Ayrıca bakkalın hangi günler ortalamanın altında kazandığını gösteren bir method yazınız.
     *
     * 1. Adım : Günleri içeren bir tane ArrayList oluşturun. (gunler)
     * 2. Adım : Günlük kazançları ekleyeceğimiz bir tane ArrayList oluşturun. (gunlukKazanclar)
     * 3. Adım : While döngüsü ile kullanıcıdan 7 günlük kazançları tekek teker alıp gunlukKazanclar ArrayList'e ekle.
     * 4. Adım : getOrtalamaKazanc() adlı method ile ortalama kazancı alın.
     * 5. Adım : getOrtalamaninUstundeKazancGünleri() adlı method oluşturun.
     *            for döngüsü ile tüm günleri ortalama kazanç ile karşılaştır
     *            ortalama kazançtan yüksekse o günleri return yap.
     * 6. Adım : getOrtalamaninAltindaKazancGünleri() adlı method oluşturun.
     *            for döngüsü ile tüm günleri ortalama kazanç ile karşılaştır
     *            ortalama kazançtan aşağıysa o günleri return yap.
     * */

    public static void main(String[] args) {

        int gun=0;
        while (gun<7){
            System.out.println(gunler.get(gun)+ " gununun kazancini yaziniz");
            double gunlukHasilat= scan.nextDouble();
            gunlukKazanclar.add(gunlukHasilat);
            ciro+= gunlukHasilat;
            gun++;

        } getOrtalamaKazanc();
        getOrtalamaninUstundeKazancGünleri();
    }

    private static void getOrtalamaninUstundeKazancGünleri() {

    }

    private static void getOrtalamaKazanc() {
    }


}
