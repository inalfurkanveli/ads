package day14_doWhile_Scope;

import java.util.Scanner;

public class C01_DoWhileLoop {
    public static void main(String[] args) {

        /*
        While loop un dez avantajı 2 tanedir
        1 -- while loop'dan önce olusturduğumuz ve lopp'ta kullanacagımız veriable'lara
         yanlış bir değer verirsek loop body'si hiç çalışmaya bilir.
        2- Loop condition'i loop body'sinden bir kez falza çalışır.

         */

        // Kullanıcıdan istediği kadar sayi alın ve toplayın
        // kullanıcı değer olarak 0 ' a basarsa islemi bitirin
        Scanner scan=new Scanner(System.in);
        int girilenSayi=0;
        int toplam=0;

        while(girilenSayi!=0){
            System.out.println("Lütfen toplamak için bir tam sayı giriniz");
            girilenSayi=scan.nextInt();
            toplam+=girilenSayi;

        }
        System.out.println("Girilen sayiların toplamı : "+ toplam);

        }

    }

