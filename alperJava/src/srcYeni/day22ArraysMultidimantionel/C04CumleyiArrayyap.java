package srcYeni.day22ArraysMultidimantionel;

import java.util.Arrays;
import java.util.Scanner;

public class C04CumleyiArrayyap {
    public static void main(String[] args) {

        Scanner scan= new Scanner(System.in);
        System.out.println("bir cumle yazin");
        String str= scan.nextLine();
        String arr[]= str.split(" ");
        System.out.println(Arrays.toString(arr));
        System.out.println(arr[2]);

        //String arr[]= str.split("");
        //System.out.println(Arrays.toString(arr));
        //String arr[]= str.split(",");
        //System.out.println(Arrays.toString(arr));

        //String kelime= "yazarken istedigimiz kelimeyi yazinca java arrayi ordan boluyor";
        //String arr1[]= kelime.split("yazinca");
        //System.out.println(Arrays.toString(arr1));



}}
