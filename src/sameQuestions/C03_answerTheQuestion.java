package sameQuestions;


import java.util.Scanner;

public class C03_answerTheQuestion {
    public static void main(String[] args) {

        // --------------------SORU 12 --------------//
        Scanner scanner=new Scanner(System.in);

        System.out.println("Lütfen iki adet  sayı giriniz. ");
        int sayi1=scanner.nextInt();
        int sayi2=scanner.nextInt();

        if((sayi1+sayi2)>999999999){
            System.out.println("Fazla yüklenme ");
        }
        else {
            System.out.println(" Sayiların toplamı "+ sayi2+sayi1);
        }

        //---------------SORU 13 ----------------------------------//

        char yanit='g';

        switch (yanit){


            case 'a':
                System.out.println("İsteginiz isleniyor.");
            case 'b':
                System.out.println("Degerlendirmeniz icin yinede tesekkür ederiz .");
            case 'c':
                System.out.println("Üzgünüm suanda yardımcı olamıyoruz .");
            default:
                System.out.println("Geçersiz giriş. Lütfen tekrar deneyiniz.");
        }
        //--------------SORU 14-----------------//





    }
}
