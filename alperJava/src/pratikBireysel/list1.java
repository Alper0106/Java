package pratikBireysel;

import java.util.ArrayList;
import java.util.List;

public class list1 {
    public static void main(String[] args) {
        List<String>hayvan= new ArrayList<>();
        hayvan.add("kedi");
        hayvan.add("yilan");
        hayvan.add(1,"kartal");
        System.out.println(hayvan);

        List<Integer> sayilar=new ArrayList<>();
        sayilar.add(5);
        sayilar.add(9);
        sayilar.add(1,-6);

        System.out.println(sayilar);
        System.out.println(sayilar.size());
        sayilar.remove(1);
        System.out.println(sayilar);



    }
}
