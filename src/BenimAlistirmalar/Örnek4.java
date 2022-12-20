package BenimAlistirmalar;

import java.util.Arrays;
import java.util.Scanner;

public class Örnek4 {
    public static void main(String[] args) {
        /*
        //Soru 31-)
        //Kullanıcıdan Arrayin uzunlugunu isteyin.
        //Ardından kullanıcıdan Arrayin elemanlarını girmesini isteyin.
        //İpucu:  Önce uzunluk alıp arrayi oluştur daha sonra loop ile kullancııya doldurt
         */

        Scanner scanner=new Scanner(System.in);
        System.out.println("Lütfen array'in uzunlugunu giriniz.");
        int arrayUzunluk=scanner.nextInt();


        int[] arr = new int[arrayUzunluk];

        for (int  each:arr
             ) {
            System.out.println("Lütfen array'in elemanlarını giriniz:");
            int girilen=scanner.nextInt();
            arr[each]=girilen;

            if(arr[each]==arrayUzunluk)
                break;
        }
        System.out.println(Arrays.toString(arr));

    }
}
