package BenimAlistirmalar.Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Arrays5 {
    /*
     Kullanicidan array’in boyutunu ve elementlerini alip array’i olusturan ve bize
donduren bir method olusturun.
     */

    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);

       arrayOlustur();

    }

    private static void arrayOlustur() {
        Scanner scan=new Scanner(System.in);

        System.out.println("Array'in kaç elemanlı olacagini giriniz ");
        int arrayLength=scan.nextInt();

        int[] kullaniciArr=new int[arrayLength];

        for (int i = 0; i <arrayLength ; i++) {
            System.out.println("Array'e eklenecek elementleri giriniz.");
            kullaniciArr[i]=scan.nextInt();

        }

        System.out.println(Arrays.toString(kullaniciArr));
    }
}
