package BenimAlistirmalar.Arrays;

import java.util.Arrays;

public class Arrays4 {

    /*
    Verilen bir array’de istenen bir elemanin var olup olmadigini ve varsa kac kere
kullanildigini yazdiran bir method olusturun
     */

    public static void main(String[] args) {

        int[] arr={1,1,2,3,4,6,4,2,4,5,1,3,};

        int arananSayi=1;
        elemanlarıYazdir(arr,1);
    }


    public  static void elemanlarıYazdir(int[] arr, int arananSayi){
        int tekrarSayisi=0;
        for (int i = 0; i < arr.length ; i++) {
           if (arr[i]==arananSayi){
            tekrarSayisi++;
            }

        }
        if (arananSayi==0){
            System.out.println("İstediginiz eleman array'de yoktur.");
        }else {
            System.out.println(arananSayi + " Arrayde "+ tekrarSayisi + " adet vardir.");
        }

    }
}
