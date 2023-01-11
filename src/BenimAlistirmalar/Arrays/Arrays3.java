package BenimAlistirmalar.Arrays;

import java.util.Arrays;

public class Arrays3 {
    public static void main(String[] args) {
        /*
        - Verilen bir array’deki tum elementleri bir saga kaydirip, sondaki elementi de
basa tasiyacak bir method olusturun, array’i yeni haliyle kaydedin.
Orn : input : [4,5,6,7] array’in son hali. : [7,4,5,6]
         */

        int [] arr={1,2,43,5};

        int eleman0=arr[arr.length-1];


        for (int i = arr.length-1; i >=1 ; i--) {
            arr[i]=arr[i-1];

        }
        arr[0]=eleman0;

        System.out.println(Arrays.toString(arr));

    }
}
