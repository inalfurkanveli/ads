package day03_dataCasting_matematikselIslemler;

import java.util.Scanner;

public class C03_dataCasting {
    public static void main(String[] args) {

       /* System.out.println(28/5); //5

        System.out.println(29/3); //9

        //Java bir bölme işleminde iki integer işleme giriyorsa sonucu integer verir.

        int sayi1=25;
        int sayi2=6;

        System.out.println(sayi1/sayi2); //4
        double dbl=6;
        System.out.println(sayi1/dbl); //6.25
*/
        //kullanıcıdan 2 tamsayı alın
        //1.tamsayıyı 2.ye bolup sonucu ondalık olarak yazdırın

        Scanner scan= new Scanner(System.in);

        System.out.println("Lütfen bir sayı giriniz.");
         Integer ilkSayi=scan.nextInt();

         Integer ikinciSayi=scan.nextInt();

        System.out.println("İki sayinin bölme sonucu "+((double)ilkSayi/ ikinciSayi));


    }
}
