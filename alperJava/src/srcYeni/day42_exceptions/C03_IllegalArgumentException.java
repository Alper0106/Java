package srcYeni.day42_exceptions;

import java.util.Scanner;

public class C03_IllegalArgumentException {
    /*
    kullanicidan yasini isteyin
    kullanici yas olarak negatif bir sayi
    0 veya
    120' den buyuk bir sayi girerse illegalargumentexception olusacak sekilde
    bir program yaziniz
     */
    public static void main(String[] args)  {
        Scanner scan=new Scanner(System.in);
        System.out.println("lutfen yasinizi giriniz");
        int yas=scan.nextInt();
        if (yas<=0 || yas>120){
            //System.out.println("Lutfen gecerli bir yas giriniz");
            //java bizim istedigimiz durumlarda exception firlatabilir
            throw new IllegalArgumentException();
        }else{
            System.out.println("uygun yas girdiniz ,tesekkurler");
        }
    }
}
