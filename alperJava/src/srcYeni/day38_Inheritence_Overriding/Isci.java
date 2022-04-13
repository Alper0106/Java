package srcYeni.day38_Inheritence_Overriding;

public class Isci extends Personel{
    public String statu= "isci";
    public String haklar="isciler kidem tazminati alir";
    public String ikramiye= "isciler yilda bir ikramiye alir";


    public void mesai(){
        System.out.println("tum isciler haftalik 40 saat calisir");
    }
    public void maasHesapla(){
        System.out.println("tum isciler 30 gun* 8 saat* 11euro= "+(30*8*11)+ "euro maas alir");

    }

    public static void main(String[] args) {

    }

}
