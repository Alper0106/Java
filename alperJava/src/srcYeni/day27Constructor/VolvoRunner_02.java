package srcYeni.day27Constructor;

public class VolvoRunner_02 {
    public static void main(String[] args) {
        // Her obje obje olusturdugumuzda model, yakit gibi degerleri tek tek atama
        // yapmak istemiyorsaniz
        Volvo_01 arb1=new Volvo_01("XC60",false,2023,"Benzin");
        System.out.println(arb1); // Model : XC60 Yakit : Benzin Max Hiz : 240

    }
}
