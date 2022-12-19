package day05_ıfElseStatement;

import java.util.Scanner;

public class C01_ıfStatements {
    public static void main(String[] args) {
        // ogrenciden notunu rakam olarak alıp harf olarak yazdırın
        //0-49 ff
        //50-64,999 cc
        //65-84,999 bb
        //85-100 aa

        Scanner scan= new Scanner(System.in);
        System.out.println("Lütfen notunuzu giriniz.");
        double girilenNot= scan.nextDouble();

        if(0<girilenNot && girilenNot<=49){
            System.out.println("Malesef Kaldınız. Notunuz dd");
        }
        if(50<girilenNot && girilenNot<=64.999){
            System.out.println("Tebrikler dersi geçtiniz. Notunuz cc");
        }
        if(65<girilenNot && girilenNot<=84.999){
            System.out.println("Tebrikler dersi geçtiniz. Notunuz bb");
        }
        if (85<girilenNot && girilenNot<=100){
            System.out.println("Tebrikler dersi AA notuyla geçtiniz.");
        }
        else {
            System.out.println("Geçersiz bir not girdiniz. Tekrar Deneyiniz.");
        }
        return;

    }
}
