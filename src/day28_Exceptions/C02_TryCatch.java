package day28_Exceptions;

import java.util.Scanner;

public class C02_TryCatch {
    public static void main(String[] args) {
        /*
        Try-catch bloklarının amacı
        riski 0 yapmak degil
        kodun iyi analiz yapıp java'nın çözemeyecegi durumlarda
        ne yapmasını istedigimizi kendisine söylemektir.


        Java try blogunda bas edemeyecegi bir sorunla karşılaşırsa
        siz o sorunu deklare edinceye kadar yani
        catch () satırına kadar calısmayi durdurur.

        Bu durumda sorun olan satır ile catch satırı arasindaki kodlar CALISMAZ.
         */



        // kullanıcıdan iki tam sayı alıp
        // sayıları birbirne bölüp sonucu yazdırın

        Scanner scan=new Scanner(System.in);
        System.out.println("bölme işlemi için iki sayı giriniz");
        int sayı1=scan.nextInt();
        int sayı2=scan.nextInt();

        try {
            System.out.println("İki sayının bölümü : "+ sayı1/sayı2);

            System.out.println("kontrol1");
            System.out.println("kontrol2");
            System.out.println("kontrol3");
        } catch (ArithmeticException e) {
            System.out.println("bolen sayı 0 olamaz.");
            System.out.println(e.getCause());
        }
    }
}
