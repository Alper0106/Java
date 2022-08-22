package pratikBireysel;

import java.util.Arrays;
import java.util.Scanner;

public class Array {
    public static void main(String[] args) {

        // verilen bir array'e yeni bir element ekleyen bir method olusturun

        int arr[]= {3,5,7,5,2};

        System.out.println("eklenecek elementi giriniz");
        Scanner scan= new Scanner(System.in);

        int eklenecekElement= scan.nextInt();

        arr=yenielement(arr,eklenecekElement);

        System.out.println(Arrays.toString(arr));


    }

    public static int[] yenielement(int[] arr, int eklenecekElement) {

        int yeniarray[]= new int[arr.length+1];

        for (int i = 0; i < arr.length ; i++) {
            yeniarray[i]=arr[i];

        } yeniarray[arr.length]=eklenecekElement;

        return yeniarray;
    }


}
