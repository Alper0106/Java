package srcYeni.day22ArraysMultidimantionel;

import java.util.Arrays;
import java.util.Scanner;

public class C03 {
    public static void main(String[] args) {
        // kullaniciya kac elementlik bir array olusturacagini sorun
        // array'i olusturup elementleri kullanicidan alip, array'e atayin

        System.out.println("kac elementlik array gireceksiniz");
        Scanner scan= new Scanner(System.in);
        int uzunluk= scan.nextInt();
        int arr[]= new int[uzunluk];

        for (int i = 0; i < uzunluk; i++) {
            System.out.println("Arrays icin "+ (i+1)+ ".nci elementi girin" );
             arr[i]=scan.nextInt();
        }
        System.out.println(Arrays.toString(arr));
    }

}
