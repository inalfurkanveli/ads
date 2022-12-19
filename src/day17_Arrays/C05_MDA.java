package day17_Arrays;

import java.util.Arrays;

public class C05_MDA {
    public static void main(String[] args) {
        int[][] arr={{1,7},{2,3},{4,5,7,0},{5},{7,8,9,13}};

        //Verilen 2 katlı MDA in sayiların toplamını yazdıran bir method olusturun

       /*
       int toplam = 0 ;
        for (int i = 0; i <arr.length ; i++) {
            for (int j = 0; j <arr[i].length ; j++) {
               toplam+=arr[i][j];
            }
            System.out.println(Arrays.toString(toplam));
        }

        bu loop'u standart olarak olusturursanız
        */


        tumSayilariTopla(arr);

    }
    public static void tumSayilariTopla(int[][] arr ){
        int toplam=0;
        for (int i = 0; i <arr.length ; i++) {
            for (int j = 0; j <arr[i].length ; j++) {

                toplam+=arr[i][j];
            }

        }
        System.out.println("Array'deki sayıların toplamı: "+ toplam);
    }

}
