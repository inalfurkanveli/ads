package day21_staticKeyword;

public class C02_passByValue {
    public static void main(String[] args) {


        int fiyat=100;
        //fiyat üzerinden %10 indirim yapıp indirimli fiyatı döndüren  bir method olusturun.

        /*
        Java PassByValue Kullanır.
        Yani method'lar arasinda gonderilen veriable'larin
         */

        System.out.println(indirimYap10(fiyat)); // 90
        System.out.println(indirimYap10(fiyat)); // 90
        System.out.println(indirimYap10(fiyat)); // 90
        System.out.println(indirimYap10(fiyat)); // 90

        System.out.println(fiyat); // 100

        // eger indirimli fiyatın kalıcı olarak fiyatımı  değiştirmek istersek atama yaparız.
        fiyat=indirimYap10(fiyat);

    }

    public static int indirimYap10(int fiyat){

        fiyat=fiyat*90/100;

        return fiyat;
    }
}
