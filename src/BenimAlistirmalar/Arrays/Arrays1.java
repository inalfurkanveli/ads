package BenimAlistirmalar.Arrays;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Arrays1 {
/*
Verilen bir int array’in tum elemanlarini 2 artirip bize donduren bir method
olusturun. Eski array’i yeni haliyle kaydedin.
 */

   static int [] arr={1,2,43,5,2,76,87};

    public static void main(String[] args) {

        arrayArrtır(arr);

    }
    public static int[] arrayArrtır(int[] arr){

        for (int i = 0; i < arr.length ; i++) {

            arr[i]=arr[i]+2;

        }
        System.out.println(Arrays.toString(arr));




        return arr;
    }

}
