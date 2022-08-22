package pratikBireysel;

public class Arrays5 {
    public static void main(String[] args) {
        /*
         *  String 2D array olustur
         *  {{"$12" , "$22" , "0$"},   {"€9" , "€40" , "$1" },  {"€12", "$2","$0"}}
         *  String de $ varsa 3.2 ile carp
         *  String de € varsa 4.2 ile carp
         *  elemanlarin toplamini double olarak yazdir
         */

        String arr[][]= {{"$12" , "$22" , "0$"},   {"€9" , "€40" , "$1" },  {"€12", "$2","$0"}};

        double toplam1=0;
        double toplam2=0;
        double carpim=1;


        for (int i = 0; i < arr.length ; i++) {
            for (int j = 0; j < arr[i].length; j++) {
               if (arr[i][j].contains("$")){
                   toplam1+=Double.parseDouble((arr[i][j].replace("$", "")));


               }else if (arr[i][j].contains("€")){
                   toplam2+=Double.parseDouble((arr[i][j].replace("€", "")));
               }


            }}

        carpim=3.2*toplam1+ 4.2*toplam2;
        System.out.println("sonuc= "+ carpim);
    }
}
