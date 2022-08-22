package day22ArraysMultidimantionel;

public class C05Istenenharfsayisi {
    public static void main(String[] args) {
        //verilen cumlede tekrar eden harf sayisini bulunuz

        String str= "bir berber bir berbere berberistanda berber duk";
        String harf= "e";

        harfkackerekullanilmis(str,harf);


    }

    private static void harfkackerekullanilmis(String str, String harf) {
        int sayac=0;
        String arr[]= str.split("");

        for (int i = 0; i < arr.length ; i++) {
            if(arr[i].equals(harf)){
                sayac+=1;
            }

        } System.out.println("aradiginiz harfin tekrar sayisi= "+ sayac);

    }
}
