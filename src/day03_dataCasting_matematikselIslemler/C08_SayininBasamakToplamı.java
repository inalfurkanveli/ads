package day03_dataCasting_matematikselIslemler;

import java.util.Scanner;

public class C08_SayininBasamakToplamı {
    public static void main(String[] args) {


        //4 basamaklı + sayı basamaklarının toplamı


        System.out.println("Lütfen 4 basamaklı bir sayı giriniz.");
        Scanner scanner=new Scanner(System.in);

        int girilenSayi= scanner.nextInt();

      /*  int birlerBasamagı=girilenSayı%10;
        int yuzlerBasamagı=girilenSayı%100;
        int binlerBasamagı=girilenSayi%1000;

        int rakamlarToplamı=

        */
       int birlerBasamagi=0;
       int rakamlarToplami=0;

       birlerBasamagi=girilenSayi%10;
       rakamlarToplami=rakamlarToplami+birlerBasamagi;
       girilenSayi=girilenSayi/10;

       birlerBasamagi=girilenSayi%10;
       rakamlarToplami=rakamlarToplami+birlerBasamagi;
       girilenSayi=girilenSayi/10;

       birlerBasamagi=girilenSayi%10;
       rakamlarToplami=rakamlarToplami+birlerBasamagi;
       girilenSayi=girilenSayi/10;

       birlerBasamagi=girilenSayi%10;
       rakamlarToplami=rakamlarToplami+birlerBasamagi;
       girilenSayi= girilenSayi/10;

        System.out.println("Girilen sayının rakamlar toplamı: "+ rakamlarToplami);
    }
}
