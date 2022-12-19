package sameQuestions;

import java.util.Scanner;

public class C08_soru22 {
    public static void main(String[] args) {
        /*
Kullanıcıdan 2 tamsayı girmesini isteyin, ardından GCD (En Büyük Ortak Bölen) ve LCM'yi bulun (En Küçük Ortak Kat)
Giriş :
30 ve 40

Beklenen Çıktı:
30 ve 40 için EBOB= 10
30 ve 40 için EKOK= 120
ipucu:
Loopları kullanarak çözebiliriz. İki sayının EKOK'u sayıların çarpımının sayıların EBOB'una bölünerek bulunabilir.

         */

        Scanner scanner=new Scanner(System.in);
        System.out.println("Lütfen iki sayı giriniz. ");
        int sayi1=scanner.nextInt();
        int sayi2=scanner.nextInt();

        int kücükSayi= sayi1<sayi2 ?  sayi1:sayi2;


        int ebob=1;
        int ekok=1;

        for (int i = 1; i <kücükSayi ; i++)
            if (sayi1 % i == 0 && sayi2 % i == 0)

                ebob = i;

        System.out.println("İki sayının Ebob'u : "+ ebob);
        System.out.println("İki sayının Ekok'u : "+ (sayi1*sayi2)/ebob);

    }
}
