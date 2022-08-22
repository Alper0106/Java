package day36_Inheritence;

public class Child extends Parent{
    Child(){
        System.out.println("child cons calisti");
    }

    public static void main(String[] args) {
        /* Tum class larda biz gormesek bile
        java nin olusturdugu default constracter vardir.

        Extends keyword kullanan class lardaki
        Tum CONSTRUCTOR larin ilk satirinda
        biz gormesek bile super() constuctor call vardir.
        yani Parent class in parametresiz constructor call.
         */
        Child child= new Child();
    }
}
