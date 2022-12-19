package day05_ıfElseStatement;

import java.util.Scanner;

public class C02_IfStatements {
    public static void main(String[] args) {



         /*
            Basit if cumleleri kodun geri kalanindan bagimsizdir
            sadece 1 sarta odaklanir
            o sart true ise if body calisir
            sart false ise if body calismaz( KOD CALISIR)
            birden fazla bagimsiz if cumlesi kullanilmissa
            her cumle birbirinden bagimsiz olacagindan
            bazi degerler icin tum if body'leri calisirken
            bazi degerler icin hic bir if body'si CALISMAYABILIR
         */

        // kullanıcıdan  bir sayı alıp
        //pozitif ise poztif sayıdır
        // 100 ile 999 arasında ise "3 basamaklı poztif bir sayı"
        // 3 ile bölünüyorsa 3 ile tam bölünüyor.
        //birler basamağı 7 ise "mükemmel"
        //seceneklerinden uygun olanları yazdırın.

        Scanner scan= new Scanner(System.in);
        System.out.println("Lütfen 3 basamaklı bir sayı giriniz.");
        int girilenSayi=scan.nextInt();

        if(0<girilenSayi){
            System.out.println("Girdiğiniz sayi pozitif bir sayidir.");
        }
        if(100<=girilenSayi && girilenSayi<=999){
            System.out.println("Girilen sayi 3 basamaklı pozitif bir sayidir.");
        }
        if(girilenSayi%3==0){
            System.out.println("Girilen sayı 3'e tam bölünür.");
        }
        if(girilenSayi%10==7){
            System.out.println("Mükemmel");

        }



    }
}
