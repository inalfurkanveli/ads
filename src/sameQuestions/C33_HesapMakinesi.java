package sameQuestions;

import java.util.Scanner;

public class C33_HesapMakinesi {

    /*
    * Problem Tanımı :
  Basit 4 işlem yapan bir hesap makinesi kodlayınız.

  Kullanicidan yapacagi islemi islem sembolu ile secmesini saglayinız.
  Kullanicidan iki sayi girmesini isteyiniz.
  Girilen iki sayi ve secilen isleme gore dogru sonucu ekrana yazdirınız.
     */
    public static void main(String[] args) {


        Scanner scanner=new Scanner(System.in);
        System.out.println("Lütfen yapmak istediginiz işlemi sembol olarak belirtiniz +/-/%/*");
        String islem = scanner.nextLine();

        System.out.println("Lütfen ilk sayıyı giriniz ");
        int sayı1=scanner.nextInt();
        System.out.println("Lütfen ikinci sayıyı giriniz");
        int sayı2=scanner.nextInt();

        switch (islem){

            case "+":
                System.out.println("Girdiginiz sayıların toplamı : "+ (sayı1+sayı2));
                break;
            case "-":
                System.out.println("Girdiginiz sayıların farkı: " + (sayı1-sayı2));
                break;
            case "%":
                System.out.println("Girdiginiz sayıların bölümü" + (sayı1%sayı2));
                break;
            case "*":
                System.out.println("Girdiginiz sayıların carpımı: "+ (sayı1*sayı2));
                break;
            default:
                System.out.println("Geçersiz sembol girdiniz.");
        }









    }

}
