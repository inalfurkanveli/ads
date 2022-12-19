package day03_dataCasting_matematikselIslemler;

import com.sun.jdi.CharType;

import java.util.Scanner;

public class C04_charDataCasting {
    public static void main(String[] args) {
        /*
        char data türünün ekstra bir özelliği var.
        Eğer matematiksel bir işlemde char data türünde
        bir değer kullanırsanız
         */


        System.out.println('a'+'b'); // 97+98=195

        System.out.println((char) ('a'-32)); //A

        Scanner scan = new Scanner(System.in);


        System.out.println("Bir karakter giriniz.");
        char girilenKarakter=scan.next().charAt(0); //scan.next() ilk kelimeyi alır .charAt() ilk index i alır.

        System.out.println((char) (girilenKarakter+1)+" ,"+(char)(girilenKarakter+2)+ "," +(char)(girilenKarakter+3) );
    }
}
