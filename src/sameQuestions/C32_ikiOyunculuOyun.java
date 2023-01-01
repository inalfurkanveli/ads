package sameQuestions;

import java.util.Scanner;

public class C32_ikiOyunculuOyun {
    /*
    Constructor Sorusu-
1. Aşama: Başlangıçta İlk Oyuncuya oyunu başlatmak için bir kelime girmesini iste.
2. Aşama: Sonra oyuncuyu degiştir ve ikinci oyuncuya geç. Yeni oyuncuya verilen kelimenin geçerli olup olmadıgını sor
   2.1) Eğer yeni oyuncu verilen kelimeyi kabul ederse : kelimeyi yazan oyuncuya puan olarak kelimedeki harf sayısını ekleyin ve 3. adıma gidin
  2.2) Eğer yeni oyuncu verilen kelimeyi	geçerli olarak kabul etmesse "Geçersiz kelime, oyuncu X(Mevcut oyuncu) oyunu kazandı" yazıp oyunu bitirin.
3. Aşama: Kullanıcılara oyuna devam etmek isteyip istemediklerini sor: Eğer devam etmek isterlerse:
  3.1) Kullanıcıdan kelimeye eklemek için bir harf isteyin
  3.2) Ve kullanıcıya hangi tarafa eklemek istedigini sorun (Başa veya Sona)
  3.3) Daha sonra harfi kelimeye ekleyin ve 2.Aşamaya geçin Eğer devam etmek istemezlerse: "Game Finished" yazdırın.

Puanları ve kazananı ekrana yazdırın
     */

    static int birinciOyuncuPuanı = 0;
    static int ikinciOyuncuPuanı = 0;
    static String kelime = "";

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        /*
        System.out.println("Lütfen kaçıncı oyunucu olduğunuzu seçiniz : 1/2");
        char oyuncuSecimi = scan.next().charAt(0);

        if (oyuncuSecimi =='1'){
            birinciOyuncuPuanı=oyuncuSecimi;
        }
        else {
            ikinciOyuncuPuanı=oyuncuSecimi;
        }

         */
        //1.aşama
        System.out.println("Lütfen ilk oyuncu  ilk kelimesini girsin");
        kelime = scan.next();


        //2.aşama
        System.out.println("Bu kelimeyi onaylıyor musunuz ? E/H");
        char kelimerOnayi = scan.next().charAt(0);

        // 2.1 aşama
        if (kelimerOnayi == 'h' || kelimerOnayi == 'H') {
            System.out.println("Geçersiz kelime. Mevcut oyunucu kazandı");
        }
        //2.2 aşama
        else {
            birinciOyuncuPuanı += kelime.length();

        }
        //3.Aşama
        System.out.println("Oyuna devam etmek istiyor musunuz ?  E/H");
        char oyunDevamı = scan.next().charAt(0);

        if (oyunDevamı == 'e' || oyunDevamı == 'E') {
            while (oyunDevamı == 'E' || oyunDevamı == 'e') {
                //3.1 aşama
                System.out.println("Kelimeye eklemek için bir harf giriniz ");
                String eklenecekHarf = scan.next();
                //3.2 aşama
                System.out.println("Girilen harf kelimenin basına eklenecek ise 'B' sonuna eklenecekse 'S' giriniz");
                char eklenecekYer = scan.next().charAt(0);
                if (eklenecekYer == 'b' || eklenecekYer == 'B') {
                    kelime = eklenecekHarf + kelime;
                    System.out.println(kelime);

                } else {
                    kelime = kelime.concat(eklenecekHarf);
                    System.out.println(kelime);
                }
                System.out.println("Oyuna devam etmek istiyor musunuz ?  E/H");
                char oyunaDevam = scan.next().charAt(0);

                if (oyunaDevam == 'e' || oyunaDevam == 'E') {
                    continue;

                } else {
                    System.out.println("Game Finished.");
                    break;
                }

            }
            System.out.println("1.oyuncunun puanı : " + birinciOyuncuPuanı);
            System.out.println("2.oyunucunun puanı : " + ikinciOyuncuPuanı);
        }
    }
}
