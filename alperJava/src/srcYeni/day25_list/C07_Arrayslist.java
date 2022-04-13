package srcYeni.day25_list;

import java.util.ArrayList;
import java.util.List;

public class C07_Arrayslist {
    public static void main(String[] args) {
        // bir listede ortalamanin ustunde olan elemanlari yazan yeni bir liste olusturun

        // orn : [1, 3, 5, 3, 5, 6, 1, 7]
        // output [1, 3, 5, 6, 7]

        List<Double> sayilar = new ArrayList<>();
        sayilar.add(1.0);
        sayilar.add(3.0);
        sayilar.add(5.0);
        sayilar.add(3.0);
        sayilar.add(5.0);
        sayilar.add(6.0);
        sayilar.add(1.0);
        sayilar.add(7.0);

        //ortalamayi bul

        Double ortalama=0.0;
        Double toplam= 0.0;

        for (int i = 0; i < sayilar.size(); i++) {
            toplam+= sayilar.get(i);

        } ortalama=toplam/ sayilar.size();
        System.out.println(ortalama);
        
        // ortalamanin ustunde olanlari bir list e at
        
        List<Double> ortalamaninustundekiler= new ArrayList<>();

        for (int i = 0; i < sayilar.size() ; i++) {

            if(sayilar.get(i)>ortalama){
                ortalamaninustundekiler.add(sayilar.get(i));


            }
            
        }System.out.println(ortalamaninustundekiler);






    }
}
