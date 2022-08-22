package day22ArraysMultidimantionel;

import java.util.Arrays;

public class C06 {
    public static void main(String[] args) {

        int arr[]={5,2,0};
        System.out.println(Arrays.toString(arr));


        for (int i = 0; i < arr.length; i++) {

            arr[i] += i;


        }System.out.print(Arrays.toString(arr));
        System.out.println("");
        for (int i = 0; i <arr.length ; i++) {
            arr[i]+=arr[i];


        }System.out.print(Arrays.toString(arr));
        System.out.println("");
        System.out.println(arr[arr.length-1]);






    }
}
