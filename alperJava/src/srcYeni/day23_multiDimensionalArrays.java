package srcYeni;

import java.util.Arrays;
import java.util.Scanner;

public class day23_multiDimensionalArrays {
    public static void main(String[] args) {
        // kullaniciya kac elementlik bir array olusturacagini sorun
        // array'i olusturup elementleri kullanicidan alip, array'e atayin

        System.out.println("kac elementlik arrary gireceksin");
        Scanner scan= new Scanner(System.in);
        int elementsayisi= scan.nextInt();

        int arr[]= new int[elementsayisi];

        for (int i = 0; i <elementsayisi ; i++) {
            System.out.println("lutfen "+ (i+1)+ ".inci elementi yaziniz");
            arr[i]= scan.nextInt();


        }
        System.out.println(Arrays.toString(arr));


    }
}
