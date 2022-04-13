package srcYeni.pratikBireysel;

public class StaticMember {
    static int x; //bunun adi static verieble
    int y;        //instance veriable

    StaticMember(){ //bu bady bastan sona "CONSTRACTER"
        x+=2;       //cunku class adiyla ayni adi var ve retur type i yok.
        y++;        //parametresiz siz constracter

    }
    static int getSguare(){ //bu static method
        return x *x;
    }

    public static void main(String[] args) {
        StaticMember sm1= new StaticMember(); //sm1 objesi olusturduk.
        StaticMember sm2= new StaticMember();





    }
}
