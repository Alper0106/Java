package day39_overriding;

public class Araba {
    protected String hareket="arabalar teker ile hreket eder";
    protected String hiz="arabalar gucune gore hiz yaparlar";
    protected String yakit="arabalar farkli yakitlar kullanabilir";
    protected String marka= "arabalar uretildikleri markaya sahiptir";




    public void motor(){

        System.out.println("arabalar farkli markakarda motor kullanirlar");
    }

    public void yakittuketimi(){
        System.out.println("arabalar motor gucune gore yakit tuketirler");
    }

}
