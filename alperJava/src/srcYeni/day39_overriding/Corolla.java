package srcYeni.day39_overriding;

public class Corolla extends Toyota {
    protected String hiz="corolla maximum 200";
    protected String yakit="corolla benzinli veya elektriklidir";
    protected String model= "corolla";





    public void motor(){

        System.out.println("corolla araclar cevreci motor kullanir");
    }

    public void yakittuketimi(){

        System.out.println("corolla 5,7 litre yakit tuketirler");
    }

    public void vitessayisi(){

        System.out.println("corolla 5 viteslidir");
    }

    public static void main(String[] args) {

        /*
        Data turu ve constructor farkli oldugunda
        Constructor calistigi icin obje
        Constructor'in oldugu class ozelliklerini tasir
        ancak Data turu Parent class secildigi icin
        variable'lar data turunun secildigi class ve
        onun parent class'larindan deger alabilir

        Method'lar icin ise, yine Data turunun oldugu class'a gideriz
        ancak direk method'u calistirmadan once
        method Override edilmis mi diye kontrol ederiz
         */

        Corolla arb1=new Corolla();
        System.out.println(arb1.hareket);//araba clasi
        System.out.println(arb1.hiz);//corolla clasi
        System.out.println(arb1.yakit);//corolla
        System.out.println(arb1.marka);//toyota
        System.out.println(arb1.sirketmerkezi);//toyota
        System.out.println(arb1.model);//corolla
        arb1.motor();

        Toyota arb2=new Corolla();
        System.out.println(arb2.hareket);//araba clasi
        System.out.println(arb2.hiz);//toyota clasi
        System.out.println(arb2.yakit);//araba
        System.out.println(arb2.marka);//toyota
        System.out.println(arb2.sirketmerkezi);//toyota
        //System.out.println(arb2.model);//CTE
        arb2.motor();// corolla dan geldi Override oldu
        arb2.garanti();// toyotadaki method calisir.
        arb2.yakittuketimi();// corolla dan geldi Override oldu.  arabadakini ezdi
        // arb2.vitesSayisi(); data turu olan Toyota'dan
        // baslayinca boyle bir method bulamadik
        // dolayisiyla CTE

        Araba arb3=new Corolla();
        System.out.println(arb3.hareket);//araba clasi
        System.out.println(arb3.hiz);//Araba clasi
        System.out.println(arb3.yakit);//araba
        System.out.println(arb3.marka);//araba
        // System.out.println(arb3.sirketmerkezi);//CTE
        //System.out.println(arb3.model);//CTE

        arb3.yakittuketimi();// Corolla
        arb3.motor(); // Corolla
        // arb3.garanti() ; // CTE aramaya Araba class'indan basladi ve method'u bulamadi
        // arb3.vitesSayisi(); // CTE



    }


}
