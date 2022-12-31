package sameQuestions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class C31_ManavListeSorusu {

    /*
     Basit bir 5 ürünlü manav alisveris programi yaziniz.

   1. Adim : urun listesinden urun sectir ve kac kilo oldugunu sor.
   2. Adim : Baska bir urun almak isteyip istemedigini sor. istemiyorsa toplam miktari goster, istiyorsa tekrar urun sectir. Bu islemi alisverisi
             bitirmek isteyene kadar tekrarla.
   3. Adim : Musteri her urun sectiginde, aldigi urunun fiyatini toplam fiyata ekle.
   4. Adim : Alisveris bitince toplam odemesi gereken tutari goster
     */

    Scanner scanner=new Scanner(System.in);

   static ArrayList<String> urunler=new ArrayList<>(Arrays.asList("Portokal","Nar","Mandalina","Domates","Mantar"));
   static   ArrayList<Integer> fiyatlar= new ArrayList<>(Arrays.asList(20,30,15,20,30));

   static  ArrayList<String> alınanUrunler= new ArrayList<>();

   static   int toplam=0;


    public static void main(String[] args) {
        fiyatListesi();
    }

    public static void fiyatListesi(){
        Scanner scanner=new Scanner(System.in);
        for (int i = 0; i <5 ; i++) {
            System.out.println(i+1 + ". ürün "+ urunler.get(i) + " kilo fiyatı :"+ fiyatlar.get(i) + " TL");

        }
        System.out.println("Lütfen almak isteginiz ürünü seçiniz.");
        int secilenÜrün=scanner.nextInt();
        System.out.println("Lütfen almak istediginiz miktarı giriniz.");
        int miktar=scanner.nextInt();
        switch (secilenÜrün) {
            case 1:
                alınanUrunler.add(miktar + " kilo portokal =\t"+ miktar*fiyatlar.get(secilenÜrün-1)+" TL");
                break;
            case 2:
                alınanUrunler.add(miktar +" kilo Nar =\t" + miktar*fiyatlar.get(secilenÜrün-1)+" TL");
                break;
            case 3:
                alınanUrunler.add(miktar +" kilo Mandalina=\t" + miktar*fiyatlar.get(secilenÜrün-1)+" TL");
                break;
                case 4:
                    alınanUrunler.add(miktar + " kilo Domates=\t" + miktar*fiyatlar.get(secilenÜrün-1)+" TL");
                    break;
            case 5:
                alınanUrunler.add(miktar + " kilo Mantar=\t"+ miktar*fiyatlar.get(secilenÜrün-1)+" TL ");
                break;

        }


        toplam += miktar*fiyatlar.get(secilenÜrün-1);



        System.out.println("Alışverişe devam etmek istiyor musunuz ? E/H");
        char secim= scanner.next().charAt(0);

        if(secim == 'E' || secim == 'e'){
            fiyatListesi();
        } else {

            System.out.println("FURKAN && EMRE MARKET ALIŞVERİŞ FİŞİ");
            for (int i = 0; i <alınanUrunler.size() ; i++) {
                System.out.println(alınanUrunler.get(i));
            }

            System.out.println("Alışverişin toplam tutarı : "+ toplam + "TL\n");
            System.out.println("FURKAN && EMRE MARKET'İ TERCİH ETTİĞİNİZ İÇİN TEŞEKKÜR EDERİZ");
        }

    }
}
