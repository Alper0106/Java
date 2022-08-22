package pratikBireysel;

import java.util.ArrayList;
import java.util.List;

public class List4 {
    public static void main(String[] args) {
        //verilen birlistedeki tekrar eden tekrar elemanlari silin
        //orn {1,3,5,3,5,6,1,7}
        //output{1,3,5,6,7}

        List<Integer>sayilar= new ArrayList<>();

        sayilar.add(1);
        sayilar.add(3);
        sayilar.add(5);
        sayilar.add(3);
        sayilar.add(5);
        sayilar.add(6);
        sayilar.add(1);
        sayilar.add(7);

        List<Integer> yenisayilar=new ArrayList<>();

        for (int i = 0; i <sayilar.size() ; i++) {

            if (!yenisayilar.contains(sayilar.get(i))){
                yenisayilar.add(sayilar.get(i));

            }



        }
        System.out.println(yenisayilar);


    }
}
