package srcYeni.day37_Inheritence;

import day36_Inheritence.Parent;

public class Child extends Parent {
    /* bir class i child clas yaptigimizda
    parent class daki constructor a  ulasmasi gerekir.
    bu durumda parent clas daki constructor un
    acces modifier i uygun bir modifier olmalidir
    protected veya public gibi
     */
    Child(){
        super();
        System.out.println("child class parametresiz cons");
    }
    Child(int s){
        System.out.println("child class daki parametreli cons");
    //child class larda tum consreuctor larin ilk satirinda
        // gorunmeyen parametresiz super() cons. vardir
    }

    Child(int sayi1, int sayi2){
        //eger Parent class dan parametresiz constructoru degil de
        // baska bir cons. calistirmak isterseniz
        //bunu child clas daki constructorun ilk satirina yazmalisiniz.
        super(sayi1,sayi2);
        System.out.println("child classdaki iki parametreli cons. calisti");
    }

    public static void main(String[] args) {
        Child child= new Child(5,8);
    }
}
