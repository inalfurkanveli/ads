package day03_dataCasting_matematikselIslemler;

public class C05_WrapperClass {
    public static void main(String[] args) {

        int sayi=10;
        String str="Java candır.";

        // int primitive olduğu için hazır methodları yoktur.
        //String non-primitive olduğu için hazır methodları vardır.
        //int,char,boolean gibi primitive veriable turlerinde hazır method
        //kullanmak için
        //Java Integer,Character,Boolean gibi wrapper class'lar oluşturmuştur.
        // bunlar primitive'ler ile aynı değerleri alabilir
        //ama extradan method'ları vardir.
        // eğer sayıya çevirmek istediğimiz metinlerde harf veya sayı olmayan başka
        //karakter varsa java hata verir.

        Integer sayi2=20;
        /*
        işlemlerimizi yaparken bazen String olarak tanımlanmış
        ancak matematiksel içerik barındıran veriable'lar ile karşılaşabilirz
        Bu durumda bu tür String veriable'ları sayıya çevirmek ihtiyacımız olabilir.
         */
        String str2="123";
        String str3="354";

        int str2Int=Integer.parseInt(str2);
        int str3Int=Integer.parseInt(str3);

        System.out.println(str2Int+str3Int);//477
        char krk1='$';
        System.out.println(Character.isLetter(krk1)); //false
        System.out.println(Character.isDigit(krk1));  //false
        System.out.println(Character.isAlphabetic(krk1)); //false

        short sayi3=4;
        int sayi5=sayi3;

        //Wrapper class'larda Data Casting olmaz.


    }
}
