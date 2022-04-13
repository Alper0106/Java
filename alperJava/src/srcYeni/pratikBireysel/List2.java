package srcYeni.pratikBireysel;

import java.util.ArrayList;
import java.util.List;

public class List2 {
    public static void main(String[] args) {
        List<Integer>sayilar= new ArrayList<>();
        sayilar.add(5);
        sayilar.add(9);
        sayilar.add(9);
        sayilar.add(14);
        sayilar.remove(1);
        System.out.println(sayilar);

        Integer sayi=5;
        sayilar.remove(sayi);
        System.out.println(sayilar);

        List<String> isimler= new ArrayList<>();
        isimler.add("kedi");
        isimler.add("yilan");
        isimler.add("ali");
        isimler.add("veli");
        isimler.remove("kedi");
        System.out.println(isimler);

        isimler.remove(2);
        System.out.println(isimler);

        isimler.set(0,"mehmet");
        System.out.println(isimler);

        List<String>loglist=new ArrayList<>();
        loglist.add(isimler.set(1,"levent"));
        System.out.println(loglist);
        System.out.println(isimler);

        System.out.println( isimler.get(1));


    }
}
