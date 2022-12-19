package day11_ForLoops;

import java.util.Scanner;

public class C12{
    public static void main(String[] args) {
        /*
        // Soru1: 1 den 100e kadar aralarında bir boşluk olacak şekilde sayıları yazdırın

        for (int i = 0; i <100 ; i++) {
            System.out.print(i +" ");

        }

         */
        // Soru 2 : kullanıcan bir sayı alın 1 den giirlen sayıya kadar ( sayı dahil ) 7'ye bölünebilen sayıları
        // yazdırın.

        /*
        Scanner scanner=new Scanner(System.in);
        System.out.println("Lütfen bitis sayısını giirniz.");
        Integer bitis= scanner.nextInt();

        for (int i = 1; i <=bitis ; i++) {
            if(i%7==0){
                System.out.println(i);
            }

        }

         */

        // Soru3 : - Kullanicidan baslangic ve bitis degeri olarak pozitif sayilar alin, sinirlar
        //dahil olarak aralarindaki tum sayilarin toplamini yazdirin. Bitis degeri
        //baslangic degerinden kucukse, uyari yazdirip islemi sonlandirin
/*
        Scanner scanner=new Scanner(System.in);
        System.out.println("Lütfen baslangic degerini giriniz.");
        Integer baslangic=scanner.nextInt();
        System.out.println("Lütfen bitis degerini giriniz.");
        Integer bitis=scanner.nextInt();

        if (baslangic>bitis){
            System.out.println("Girilen baslangic değeri , bitis değerinden büyük olamaz.");
        }
        else {
            int sayilarToplami=0;

            for (int i = baslangic; i <=bitis; i++) {
                sayilarToplami+=i;

                System.out.print(sayilarToplami+" ");
            }
        }

 */
        // Soru 4 :  // input olarak verilen bir Stringde
        //        // index'i tek sayi olanlari kucuk harfle
        //        // index'i cift sayi olanlari buyuk harfle yazdirin
        //        // ornek : Java  output: JaVa
        /*
          String input="Bebegimsin gizemcim benimmm.";

        for (int i = 0; i <=input.length() ; i++) {


            System.out.print  ( i%2==0   // index cift mi ?
                    ? input.substring(i,i+1).toUpperCase() // index cift ise
                    : input.substring(i,i+1).toLowerCase() // index cift degilse
            );

        }
         */

/*
        - Kullanicidan pozitif bir sayi alin, 1’den baslayarak tum
        tamsayilari yazdirin, sira
        - 3 ile bolunebilen bir sayiya gelirse, sayi yerine fizz
        - 5 ile bolunebilen bir sayiya gelirse sayi yerine buzz
        - hem 3 hem 5 ile bolunebilen bir sayiya gelirse sayi yerine fizzBuzz

 */

        Scanner scanner=new Scanner(System.in);
        System.out.println("Lütfen bir tam sayı giriniz.");
        Integer sayi= scanner.nextInt();

        for (int i = 1; i <=sayi ; i++) {
            if (i%3==0 && i%5==0) {
                System.out.println("fizzbuzz");
            } else if (i%3==0) {
                System.out.println("fizz");

            } else if (i%5==0) {
                System.out.println("buzz");

            }
            else {
                System.out.println(i + " ");
            }


        }


    }
}
