package CarsambaPractise;

import java.util.Scanner;

public class C03_Soru3 {
    public static void main(String[] args) {
      /*  Girilen bir stringdeki a harfi sayısını bulunuz. ama c harfine gelirse
 * döngüden çıkılsın
 *
 * Bugün hava oldukca güzel.-> 2

       */
        Scanner scan=new Scanner(System.in);
        System.out.println("Lütfen bir cümle giriniz.");
        String input=scan.nextLine().toUpperCase();
        int sayac=0;

        for (int i = 0; i <input.length() ; i++) {
            if(input.charAt(i)=='A'){

                sayac++;
            }if(input.charAt(i)=='C'){
                break;
            }
        }
        System.out.println(input + "-->"+ sayac );


    }
}
