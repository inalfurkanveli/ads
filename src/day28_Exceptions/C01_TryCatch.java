package day28_Exceptions;

import java.util.Scanner;

public class C01_TryCatch {
    public static void main(String[] args) {
        // kullanıcıdan iki tam sayı alıp
        // sayıları birbirne bölüp sonucu yazdırın

        Scanner scan=new Scanner(System.in);
        System.out.println("bölme işlemi için iki sayı giriniz");
        int sayı1=scan.nextInt();
        int sayı2=scan.nextInt();


        try {
            // 1- try bolumu : yapmak istedigimiz ama exc.riski olusturan kodlar
            System.out.println("iki sayının bölümü : " + sayı1 / sayı2);
        }catch (ArithmeticException e)
            // 2- catch () : bekledigimiz mühtemel exception ve
           //           bu exc. gerceklesirse hata dokumanini store edebilecegimiz veriable
        {
            System.out.println("Bolecek sayi 0 olamaz");
            e.printStackTrace();
             //throw new RuntimeException(e);
            // catch blogu: exception gerceklesirse calısmasini istedigimiz kodlar
            //              burayı yazarken öncelikle
            //              exp/olustugunda kodların calısması dursun mu ? yoksa devam mı etsin
            //              karar vermeliyiz
        }
    }
}
