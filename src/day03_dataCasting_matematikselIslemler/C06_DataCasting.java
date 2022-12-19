package day03_dataCasting_matematikselIslemler;

import java.util.Scanner;

public class C06_DataCasting {
    public static void main(String[] args) {

        /*
        bir double bir tam sayı al
        double ı int e böl
        tam sayı kısmını yazdır

         */

        Scanner scan=new Scanner(System.in);

        System.out.println("Lütfen bir double sayı giriniz.");
        double sayiDbl=scan.nextDouble();

        System.out.println("Lütfen bir tam sayı giriniz.");
        int sayiInt=scan.nextInt();

        double bolum=sayiDbl/sayiInt;

        System.out.println("İşlem sonucunuz : "+(int)bolum);

    }
}
