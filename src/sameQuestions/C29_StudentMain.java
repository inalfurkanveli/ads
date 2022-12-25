package sameQuestions;

import java.util.Scanner;

public class C29_StudentMain {

    public static void main(String[] args) {
        /*
        ad soyad yas cınsiyet okul
         */

        Scanner scanner= new Scanner(System.in);
        System.out.println("Lütfen isim giriniz: ");
        String ad= scanner.nextLine();
        System.out.println("Lütfen soyisim giriniz : ");
        String soyIsim=scanner.nextLine();
        System.out.println("Lütfen yas giriniz: ");
        int yas=scanner.nextInt();
        System.out.println("Lütfen cinsiyet giriniz : ");
        String Cinsiyet=scanner.next();
        System.out.println("Lütfen okul giriniz: ");
        String Okul=scanner.next();

        C30_Student student= new C30_Student(ad,soyIsim,yas,Cinsiyet,Okul);
        System.out.println(student);


        }

    }

