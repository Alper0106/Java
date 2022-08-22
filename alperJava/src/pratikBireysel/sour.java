package pratikBireysel;

public class sour {
    // kac tane String verilirse verilsin
    // iclerinden en uzun olani yazdiran bir method olusturun
    
    public static void main(String[] args) {
        String str1="ali";
        String str2="ayse";
        String str3="abdulkerim";
        String str4="abdsussamed";
        enuzunkelime(str1,str3,str4);
    }

    private static void enuzunkelime(String... str) {
        String enuzun="";

        for (String each:str
             ) {
            if (each.length()>enuzun.length()) {
                enuzun=each;

            }

            
        }
        System.out.println("en uzun kelime= "+ enuzun);
    }
}
