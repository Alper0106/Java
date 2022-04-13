package srcYeni.day35_inheritance;

public class Child extends Parent{
    public static void main(String[] args) {

        /* Child class hic bir objeye ihtiyac duymadan, yani
        obje olusturmaya gerek kalmadan parent class daki veriable
        ve method lara ulasabilir.
         */

        System.out.println(isim);
        System.out.println(soyisim);
        System.out.println(fabrika);

        method1();
        method2();



    }

}
