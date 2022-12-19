package day14_doWhile_Scope;

import java.util.Scanner;

public class C02_doWhileLoop {
    public static void main(String[] args) {
        // Kullanıcıdan istediği kadar sayi alın ve toplayın
        // kullanıcı değer olarak 0 ' a basarsa islemi bitirin
        Scanner scan=new Scanner(System.in);
        int girilenSayi=0;
        int toplam=0;

        do {
            System.out.println("Toplamak üzere tam sayı giriniz.");
            girilenSayi= scan.nextInt();
            toplam+=girilenSayi;

        }while (girilenSayi!=0);
        System.out.println("Girilen sayıların toplamı : "+ toplam);

        /*
        While loopta  ilk sart sağlanmazsa loop body hiç ÇALIŞMAZ .
        Ama Do-While Loop'da  önce body calıstıgı icin, sart yanlis olsa bile
        Loop body'si en az bir kere calismis olur .
         */
    }
}
