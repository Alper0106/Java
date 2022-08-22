package day22ArraysMultidimantionel;

import java.util.Arrays;

public class C02 {

    public static void main(String[] args) {
        int arr1[] =new int[3];
        arr1[2]=14;
        System.out.println(Arrays.toString(arr1));
        int arr[]={9,6,8,2,47,0};

        Arrays.sort(arr);
        System.out.println("en kucuk= "+ arr[0]);
        System.out.println("en buyuk "+ arr[arr.length-1]);

        terstensirala(arr);




    }

    private static void terstensirala(int[] arr) {
        int tersarr[]= new int[arr.length];
        for (int i = 0; i <arr.length ; i++) {
            tersarr[i]= arr[arr.length-1-i];
        }
        System.out.println(Arrays.toString(tersarr));
    }
}
