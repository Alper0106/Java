package day39_overriding;

public class Toyota extends Araba{

   protected String hiz="toyotalar maximum 220km hiz yaparlar";
   protected String marka= "toyota";
   protected String sirketmerkezi= "japonya";




    public void motor(){

        System.out.println("toyota arabalar toyota marka motor kullanirlar");
    }


    public void garanti(){
        System.out.println("toyotalar 10 yil garantilidir");
    }
}
