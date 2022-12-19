package sameQuestions;

import java.util.Scanner;

public class C07_soru21 {
    public static void main(String[] args) {
        /*
        Bir aydaki gün sayısını bulmak için bir Java programı yazın
(Mülakat Sorusu / Interview Sorusu / Leak Year)

Örnek:
Bir ay numarası girin: 2
Bir yıl girin: 2016

Şubat 2016'da 29 gün vardır
ipucu:
Switch Case kullanarak çözebiliriz. Şubat ayı senelere göre farklılık gösterir. Bunu çözmek için Şubat ayı için method kullanmamız gerekiyor!
Artık yıl ile ilgili olarak NOT düşeyim değerli arkadaşlar!

ARTIK YILI BULABİLMENİZ İÇİN İKİ KOŞULU GÖZ ÖNÜNDE BULUNDURUN!:
1-) Bir yılın son iki rakamı "00" değilse ve bu sayı 4 e tam bölünebiliyorsa bu yıl artık yıldır.
Mesela 2008 yılı artık yıldır. Son iki rakamı "00" değildir ve 4 e bölünebilen bir sayıdır.
2-) Bir yılın son iki rakamı "00" ise ve bu sayı 400 e tam bölünüyorsa, yine bu yıl yine artık yıldır.
Mesela 2000 yılı artık yıldır.Son iki rakamı "00" ve 400 e bölünebilen bir sayıdır.
         */
        Scanner scanner =new Scanner(System.in);
        System.out.println( "lütfen ay numarası giriniz.");
        int ay=scanner.nextInt();
        System.out.println("Lütfen yıl giriniz.");
        int yıl=scanner.nextInt();

        switch (ay){

            case 1:
                System.out.println(yıl+ " yılında "+ay+ " ayı 31 gündür.  ");
                break;

            case 2:
                if (subatAyi(yıl)) System.out.println(yıl+ "yılında "+ ay+" .ayı 29 gündür.");
                else System.out.println(yıl+ " yılında "+ ay+".ayı 28 gündür.");
                break;
            case 3:
                System.out.println(yıl+ " yılında "+ay+ " ayı 30 gündür.  ");
                break;
            case 4:
                System.out.println(yıl+ " yılında "+ay+ " ayı 31 gündür.  ");
                break;
            case 5:
                System.out.println(yıl+ " yılında "+ay+ " .ayı 30 gündür.  ");
                break;
            case 6:
                System.out.println(yıl+ " yılında "+ay+ " .ayı 31 gündür.  ");
                break;
            case 7:
                System.out.println(yıl+ " yılında "+ay+ " .ayı 30 gündür.  ");
                break;
            case 8:
                System.out.println(yıl+ " yılında "+ay+ " .ayı 31 gündür.  ");
                break;
            case 9:
                System.out.println(yıl+ " yılında "+ay+ " .ayı 30 gündür.  ");
                break;
            case 10:
                System.out.println(yıl+ " yılında "+ay+ " .ayı 31 gündür.  ");
                break;
            case 11:
                System.out.println(yıl+ " yılında "+ay+ " .ayı 30 gündür.  ");
                break;
            case 12:
                System.out.println(yıl+ " yılında "+ay+ " .ayı 31 gündür.  ");
            default:
                System.out.println("Girilen gün ve ay sayısı hatalıdır.");
        }


    }

    private static boolean subatAyi(int yıl) {
        boolean artikYıl;
        if (yıl%4==0 || yıl%400==0 || yıl%100==0 ) artikYıl=true;
        else artikYıl=false;



        return artikYıl;
    }
}
