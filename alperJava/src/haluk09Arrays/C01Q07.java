package haluk09Arrays;

public class C01Q07 {
    public static void main(String[] args) {
        /* TASK :
         * write a method that accepts a 2 dimensional array and finds the max value
         * (2 boyutlu bir diziyi kabul eden ve maksimum degeri bulan bir method yazin )
         * Input : {{1,2,-3},{41,55},{-61,-17,80}}
         * Output : 80
         */

        int arr[][]={{1,2,-3},{41,55},{-61,-17,80}};
        System.out.println("girdiginiz array in max elemani= "+ maxDegerbul(arr));

    }
    public static int maxDegerbul(int arr[][]){
        int max=arr[0][0]; //methoddan return edilecek max elemanın atanacagı cont cretae edildi
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {

                if (arr[i][j]>max){
                    max=arr[i][j];

                }

            }

        }
        return max;
    }
}
