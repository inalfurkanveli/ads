package BenimAlistirmalar;

import java.util.Arrays;

public class C06_arrayAlistirma6 {
    public static void main(String[] args) {
        /*
        Bir dizide istenen elementin index'ini bulan program yazın
         */

        int[] arr={1,23,5,565,7623,1234,2,3,4,5,6,7};

// 1234 'ün index'ini bulalım
        int istenenSayi=1234;
        for (int i = 0; i < arr.length ; i++) {
            if (arr[i]==istenenSayi){
                System.out.println(arr[i]);
            }
        }


            }
        }


