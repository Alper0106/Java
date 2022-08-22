package elifPractice;

import java.util.Arrays;
import java.util.Scanner;

public class elifPractice {


        /*
          Kullanicidan bir String aliniz.
          String'de var olan her character'in sayisini ekrana yazdiriniz.
          Ornek: alacan ==> a = 3, l = 1, c = 1, n = 1
                 abaa   ==> a=3  b=1
         */
        public static void main(String[] args) {
            Scanner scan = new Scanner(System.in);
            System.out.print("Bir string giriniz :");
            String str = scan.nextLine();
            //split()
            String arr[] = str.split(""); //her bir karakteri ayirir
            System.out.println(Arrays.toString(arr));
            //sort()
            Arrays.sort(arr); //siralar
            System.out.println(Arrays.toString(arr));
            //sayac olustur
            int counter =0;
            for(int i=1;i<arr.length;i++){
                if(arr[i-1].equals(arr[i])){
                    counter++;
                }else{
                    System.out.println(arr[i-1] +" sayisi " +(counter+1));
                    counter = 0;
                }
                if(i==arr.length-1){ //en sona geldiginde
                    System.out.println(arr[i] + " sayisi " + (counter+1));
                }// String[] array = new String[str.length()];
                    //array = str.split("");
                //for (c = 'a'; c <= 'z'; c++) {
        //count = 0;
            //for (int i = 0; i < array.length; i++) {
            //if (c == array[i].charAt(0)) {
            //count++;
       // }
         //}
   // if (count != 0) {
      //  System.out.println(c + " ==== " + count);
    //}
            //}
            }

        }
    }

