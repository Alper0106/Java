package pratikBireysel;

import java.util.ArrayList;
import java.util.List;

public class List5 {
    public static void main(String[] args) {
        // Verilen bir listede, istenen iki index'deki elementlerin yerini
        // kalici olarak degistiren bir method olusturun
        List<Integer> sayilar = new ArrayList<>();
        sayilar.add(1);
        sayilar.add(3);
        sayilar.add(5);
        sayilar.add(3);
        sayilar.add(5);
        sayilar.add(6);
        sayilar.add(1);
        sayilar.add(7);

        int ilkindex=2;
        int ikinciindex=5;
        System.out.println("listenin onceki hali"+ sayilar);



        sayilar= indexidegismissayilar(sayilar,ilkindex,ikinciindex);

        System.out.println("degismis miste= "+ sayilar);
    }

    private static List<Integer> indexidegismissayilar(List<Integer> sayilar, int ilkindex, int ikinciindex) {
        int tem=0;

        if ((ilkindex> sayilar.size()-1)||(ikinciindex>sayilar.size()-1)||ilkindex<0||ikinciindex<0){

            System.out.println("lutfen mantikli bir index girin");

        } else {
            tem=sayilar.get(ilkindex);
            sayilar.set(ilkindex,sayilar.get(ikinciindex));
            sayilar.set(ikinciindex,tem);


        }


        return sayilar;
    }
}
