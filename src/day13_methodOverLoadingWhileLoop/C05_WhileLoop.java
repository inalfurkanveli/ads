package day13_methodOverLoadingWhileLoop;

import java.util.Scanner;

public class C05_WhileLoop {
    public static void main(String[] args) {

        // Kullancıdan toplamak üzere sayı alın
        // girilen sayıların toplamı 500 olur veya geçerse
        // bu sayı yeter deyip toplamı yazdırın.

        Scanner scan = new Scanner(System.in);
        System.out.println("Lütfen toplamak istediğiniz sayıları giriniz.");
        int toplanacakSayilar = scan.nextInt();

        int toplam = 0;
        int sayi = 0;
        for (int i = 1; i < 10000; i++) {
            System.out.println("toplamak uzere tamsayi giriniz");
            sayi = scan.nextInt();
            toplam += sayi;
            if (toplam >= 500) {
                System.out.println("Bu kadar sayi yeter. Toplamlari " + toplam + " oldu");
                break;
            }
        }
        toplam=0;
        sayi=0;

        while(toplam<500){
            System.out.println("Toplamak üzere sayı giriniz.");
            sayi=scan.nextInt();

            toplam+=sayi;
        }
        System.out.println("That is enough, you reached 500.");
    }
}
