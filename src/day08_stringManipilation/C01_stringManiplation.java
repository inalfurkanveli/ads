package day08_stringManipilation;

import java.util.Locale;
import java.util.Scanner;

public class C01_stringManiplation {
    public static void main(String[] args) {
        /*
        Soru 4- Kullanicidan gunu ismini girmesini isteyin,
         ,girilen gun hafta ici bir gun ise “Simdi calisma zamani tatile .. gun var”
        seklinde hafta sonu tatiline kac gun kaldigini yazdirin,
         girilen gun hafta sonu ise “Simdi dinlenme zamani” yazdirin
         */
        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen Gun ismini giriniz");
        String girilenGun=scan.next();
        String kullanilacakGun=girilenGun.toLowerCase();

        /*
        string ifadeler case sensitive'dir.
        Kullanıcının Pazar,PAzar,PAZAR ... gibi 32 farklı şekilde yazma ihtimali vardır.

        Kullanıcının girdiği değeri direk kalici olarak değiştirmek tercih edilmez
        bunun yerine kullanicinin girdiği değeri degistirip yeni bir veriable'a atama yapar ve kodlarımızda
        yeni veriable'i kullanırız.
         */

        switch (kullanilacakGun){
            case "pazartesi":

                System.out.println(girilenGun+" calisma zamanı, tatile 5 gün var.");
                break;
            case "sali":
                System.out.println(girilenGun+" calisma zamanı, tatile 4 gün var.");
                break;
            case "carsamba":
                System.out.println(girilenGun+" calisma zamanı, tatile 3 gün var.");
                break;
            case "persembe":
                System.out.println(girilenGun+" calisma zamanı, tatile 2 gün var.");
                break;
            case "cuma":
                System.out.println(girilenGun+" calisma zamanı, tatile 1 gün var.");
                break;
            case "cumartesi":
            case "pazar":
                System.out.println(girilenGun+" tatil zamani");
                break;
            default:
                System.out.println("Yanlis gün ismi.");
        }
    }
}
