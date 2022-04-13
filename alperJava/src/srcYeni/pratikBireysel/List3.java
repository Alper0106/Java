package srcYeni.pratikBireysel;

import java.util.ArrayList;
import java.util.List;

public class List3 {
    public static void main(String[] args) {
        List<String> isimler= new ArrayList<>();
        isimler.add("kedi");
        isimler.add("yilan");
        isimler.add("ali");
        isimler.add("veli");
        isimler.add("A");
        isimler.add("B");
        isimler.add("C");
        System.out.println(isimler.contains("B"));
        System.out.println(isimler.contains("b"));

        List<String>altlist=new ArrayList<>();
        altlist.add("A");
        altlist.add("B");
        altlist.add("C");
        System.out.println(isimler);
        System.out.println(altlist);

        System.out.println(isimler.containsAll(altlist));





    }
}
