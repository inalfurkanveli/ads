package day03_dataCasting_matematikselIslemler;

public class C07_Modules {
    public static void main(String[] args) {
        //% işareti Java'da bölme işlemi sonucunda kalan sayıyı verir.

     //   System.out.println(15%4);
        /*
        kullanıcın girdiği sayı çift sayı mı?
        girilenSayi % 2 sonucu 0 ise çifttir.

        kullanıcının girdiği sayı 7'nin katı mı ?
        girilenSayi % 7 işleminin sonucu 0 ise 7'nin katıdır.

        kullanıcının girdiği sayının birler basamağı
        kullanıcı 3456 girdi
         */

        int girilenSayi=3456;
        int birlerBasamagi= 3456%10; //6

        girilenSayi=girilenSayi/10;
        System.out.println(girilenSayi); //342

        birlerBasamagi=girilenSayi%10;
        System.out.println("birler basamağı: "+birlerBasamagi);

    }

}
