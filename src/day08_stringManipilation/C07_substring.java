package day08_stringManipilation;

public class C07_substring {
    public static void main(String[] args) {

        String str="Java ogren, isi kap";

        System.out.println(str.length()); // karakter sayısı 19

        // metnin tam ortasındaki karakter nedir ?

        System.out.println(str.length()/2); // n

        // son karakteri yazdırın.

        System.out.println(str.charAt(str.length()-1)); // p

        // Bir karakteri değilde verilen stringin içerdiği bir metin parçasını
        // elde etmek istersek

        // ornegin : "ogren" kelimesini yazdıralım

        System.out.println(str.substring(5, 9)); // ogre

        // substring(bas,bitis) methodun'da
        // baslangıc olarak yazılan index dahil(inclusive)
        // bitis olarak yazılan index haric(exclusive) 'dir

        System.out.println(str.substring(5,10)); //ogren


        // "Java"

        System.out.println(str.substring(0,4));// Java

        //"kap"

        System.out.println(str.substring(str.length()-3,str.length()-0)); // kap
        System.out.println(str.substring(16,19)); // kap
        System.out.println(str.substring(16));//kap
        System.out.println(str.substring(str.length()-3));//kap

        // substring kullanaarak J harfini yazdırın

        System.out.println(str.substring(0)); //Java ogren isi kap
        System.out.println(str.substring(0,1)); // j

        // substring kullanarak 9.index teki harfi yazdırın.
        System.out.println(str.substring(9,10).toUpperCase());// N
        System.out.println(str.charAt(9)); // N

        // charAt() kullanmak yerine substring kullanmak daha avantajlı olabilir.
        //Cunku substring kullanınca ifade hala string oldugundan
        // method kullanmaya devam edebiliriz.

        System.out.println(str.substring(5,5));

        // System.out.println(str.substring(4,3)); // StringIndexOutOfBoundsException
        // System.out.println(str.substring(25,28)); // StringIndexOutOfBoundsException
        System.out.println(str.substring(str.length())); // hiclik yazdırır.
        // System.out.println(str.charAt(str.length())); // StringIndexOutOfBoundsException
        // System.out.println(str.substring(str.length()+1)); // StringIndexOutOfBoundsException
        System.out.println("=======");
    }
}
