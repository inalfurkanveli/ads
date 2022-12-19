package CarsambaPractise;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class C13_ManavListesiSorusu {
    /*
    /*
 * Basit bir 5 ürünlü manav alisveris programi yaziniz.
 *
 * 1. Adim : urun listesinden urun sectir ve kac kilo oldugunu sor.
 * 2. Adim : Baska bir urun almak isteyip istemedigini sor. istemiyorsa toplam miktari
 * goster, istiyorsa tekrar urun sectir. Bu islemi alisverisi bitirmek isteyene
 * kadar tekrarla.
 * 3. Adim : Musteri her urun sectiginde, aldigi urunun fiyatini
 * toplam fiyata ekle.
 * 4. Adim : Alisveris bitince toplam odemesi gereken tutari goster.

     */
   static ArrayList<String> urunList=new ArrayList<>(Arrays.asList("Portakal","Mandalina","Elma","Ispanak","Muz"));
   static   ArrayList<Integer> fiyatList=new ArrayList<>(Arrays.asList(10,12,15,10,18));

   static    double toplam=0;

    public static void main(String[] args) {


        System.out.println("******FURKAN MARKET************* ");
        menu();

    }
    private static void menu(){
        Scanner scanner=new Scanner(System.in);
        for (int i = 0; i <5 ; i++) {
            System.out.println(i+1+" . " + "ürün : "+urunList.get(i)+" fiyatı: "+fiyatList.get(i)+" TL");
        }

        System.out.println("Seçmek istediğiniz ürünün kodunu giriniz. ");

        int urun=scanner.nextInt();
        System.out.println("Miktar giriniz : ");
        double miktar= scanner.nextInt();
        toplam+=miktar*fiyatList.get(urun-1);

        System.out.println("Alışverişe devam etmek istiyor musunuz? E/H" );
        char secim=scanner.next().charAt(0);

        if(secim=='e' || secim=='E'){
            menu();
        }else {
            System.out.println("Toplam tutar : "+ toplam);
        }

    }

}
