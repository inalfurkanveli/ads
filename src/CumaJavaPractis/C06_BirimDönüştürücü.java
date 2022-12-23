package CumaJavaPractis;

import java.util.Locale;
import java.util.Scanner;

public class C06_BirimDönüştürücü {
    public static void main(String[] args) {
        /*
        // Saati saniyeye, mil'i kilometreye, kilogrami gram'a
        // ceviren bir method yaziniz.
        // Bu methodu main methodun disinda olusturup main methodun
        // icinden cagiriniz.
         */
        Scanner scanner= new Scanner(System.in);
        System.out.println("Lütfen dönüştürmek istediginiz birimi giriniz:\n =>Saat\n =>Mil \n =>Kilogram");
        String birim = scanner.nextLine().toLowerCase();
        System.out.println("Lütfen dönüştürmek istediginiz birimin miktarı giriniz : ");
        double miktar = scanner.nextDouble();


        BirimDönüştürücü(birim,miktar);
    }

    private static void BirimDönüştürücü(String brm, double mktr) {
        switch (brm){
            case "saat":

                System.out.println(mktr+" saat "+mktr*60*60 + " saniyedir. ");
                break;

            case "mil":
                System.out.println(mktr+" mil "+  mktr*1.6 + " kilometredir. ");
                break;

            case "kilogram":
                System.out.println(mktr+" kilogram "+  mktr *1000+ " gramdır. ");
                break;
            default:
                System.out.println("Belirtilenler dışında bir birim girdiniz ,"+
                        "işleminizin gerçekleşmesini istiyorsanız yonergelere uyunuz ! ");


        }


    }
}
