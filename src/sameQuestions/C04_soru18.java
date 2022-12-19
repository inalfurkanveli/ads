package sameQuestions;

import java.util.Scanner;

public class C04_soru18 {
    public static void main(String[] args) {
        /*
        Soru 18-)
Girilen araç hızı ve yol kilometresinden, gidilen yere varış süresini hesaplayan bir method yazalım.
 Kullanıcıya hızını ve kilometreyi soralım, bunu methoda gönderelim ve bize varış süremizi hesaplasın
İpucu:
yol=Hız*zaman
         */
        Scanner scanner= new Scanner(System.in);
        System.out.println("Lütfen yolculuk mesafesini  giriniz.");
        int yol=scanner.nextInt();
        System.out.println("Lütfen hizinizi giriniz:");
        int hiz=scanner.nextInt();

        varisSüreHesabı(hiz,yol);



    }
    public static void varisSüreHesabı(int yol,int hiz){

        int zaman=(hiz/yol);

        System.out.println("Gideceginiz yere tahmini varis süreniz: "+ zaman+" saatdir.");

    }
}
