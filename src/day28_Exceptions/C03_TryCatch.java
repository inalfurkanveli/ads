package day28_Exceptions;

import java.util.InputMismatchException;
import java.util.Scanner;

public class C03_TryCatch {
    // kullanıcıdan toplamak üzere sayılar alın
    // kullanıcın işlemi bitirmesi için Q ya basmasını isteyin kullanıcı
    // Q ya bastıgında toplam kac sayı girdigini ve sayıların toplamını yazdırın


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int giirlenSayi = 0;
        int sayiAdedi = 0;
        int sayilarToplamı = 0;


        while (sayiAdedi < 10000) {
            try {
                System.out.println("toplamak için tam sayı girin" +
                        "\n Bitirmek için Q'ya basın.");
                giirlenSayi = scanner.nextInt();
                sayiAdedi++;
                sayilarToplamı += giirlenSayi;


            }catch(InputMismatchException e){
                    String girilenDeger = scanner.nextLine();
                    if (girilenDeger.equalsIgnoreCase("q")) {
                        System.out.println("Girilen  " + sayiAdedi + " sayının toplamı :" + sayilarToplamı);
                        break;
                    } else {
                        System.out.println("Gecersiz input! ");
                    }
                }
            }
        }


    }


