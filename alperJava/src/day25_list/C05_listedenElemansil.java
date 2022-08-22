package day25_list;

import java.util.ArrayList;
import java.util.List;

public class C05_listedenElemansil {
    public static void main(String[] args) {

        //verilen birlistedeki tekrar eden tekrar elemanlari silin.
        // metod olusturup eski sayilar listesini kalici silerek
        //orn {1,3,5,3,5,6,1,7}
        //output{1,3,5,6,7} haline donustur
        List<Integer> sayilar= new ArrayList<>();
        sayilar.add(1);
        sayilar.add(3);
        sayilar.add(5);
        sayilar.add(3);
        sayilar.add(5);
        sayilar.add(6);
        sayilar.add(1);
        sayilar.add(7);

        sayilar= tekrarsizListeolusturr(sayilar);
        System.out.println(sayilar);



    }

    private static List<Integer> tekrarsizListeolusturr(List<Integer> sayilar) {
        List<Integer> tekrarsizlist= new ArrayList<>();
        for (int i = 0; i < sayilar.size(); i++) {
            if(!tekrarsizlist.contains(sayilar.get(i))){
                tekrarsizlist.add(sayilar.get(i));

            }

        } return tekrarsizlist;

    }
}
