package srcYeni.day25_list;

import java.util.ArrayList;
import java.util.List;

public class C04_listedenElemanSilme {
    public static void main(String[] args) {
        //verilen birlistedeki tekrar eden tekrar elemanlari silin
        //orn {1,3,5,3,5,6,1,7}
        //output{1,3,5,6,7}
        List<Integer> sayilar= new ArrayList<>();
        sayilar.add(1);
        sayilar.add(3);
        sayilar.add(5);
        sayilar.add(3);
        sayilar.add(5);
        sayilar.add(6);
        sayilar.add(1);
        sayilar.add(7);

        tekrarsizListeolustur(sayilar);

    }

    public static void tekrarsizListeolustur(List<Integer> sayilar) {
            List<Integer> tekrarsizlist= new ArrayList<>();

        for (int i = 0; i < sayilar.size(); i++) {
            if(!tekrarsizlist.contains(sayilar.get(i))){
                tekrarsizlist.add(sayilar.get(i));

            }

        }
        System.out.println(tekrarsizlist);

    }
}
