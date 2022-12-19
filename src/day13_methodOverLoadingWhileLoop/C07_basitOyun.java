package day13_methodOverLoadingWhileLoop;

import java.util.Random;
import java.util.Scanner;

public class C07_basitOyun {
    public static void main(String[] args) {
        /*
        random olarak bir ile 100 arasında bir sayı oluşturun
        kullnıcıdan bu sayıyı bilmesini isteyin
        kullanıcı her değer girdiğinde tuttugumuz sayı ile karşılaşturup
        tahminin büyült veya küçült diyelim.
        Kullanıcı tuttugumuz sayıyı bildiğinde
        tahmin sayisini

        - 3 veya daha az tahminde bildiyse " Waoow "

        4- 8 tahminde bildiyse " aferin "
        daha fazla tahminde bildiyse başarısız
         */


        Random rnd= new Random();
        int tutulanSayi=rnd.nextInt(100);
        int sayac=1;
        int tahmin=0;

        Scanner scan=new Scanner(System.in);

        while(tutulanSayi!=tahmin){

            System.out.println("Lütfen bir tahmin giriniz.");
            tahmin= scan.nextInt();

            if (tahmin==tutulanSayi){ // sayiyi bulduysa
                System.out.println(sayac + "tahmin ile tuttugum sayıyı buldun. ");
                if (sayac<=3 ){
                    System.out.println("Waaaooowww");
                }else if (sayac<=8) {
                    System.out.println("Aferin ");
                } else {
                    System.out.println("Basarisiz");
                }
                break;


            } else if (tahmin<tutulanSayi) {
                System.out.println("Sayiyi buyut ");
                sayac++;
            } else   {
                System.out.println("Sayiyi kücült");
                sayac++;
            }
        }
    }
}
