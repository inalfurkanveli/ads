package day08_stringManipilation;

public class C03_equals {
    public static void main(String[] args) {
        String str1="Java";



        String str2="Java";


        String str3= new String( "Java");

        String str4="Ja";

        String str5=str4.concat("va");

        System.out.println(str1==str2); // true

        System.out.println(str1==str3);//false

        System.out.println(str1==str5);//false

        /*
        = = string için beklediğimiz sonuçları vermeyebilir.
        Çünkü hem metnin değerini hemde obje nin referansını karşılaştırır.
        Bunu ileride anlatıcaz.

        Java'da string objelerinin metinlerinin aynı olup olmadıgını kontrol etmek için = = yerine
        equals method'u kullanılmalıdır.
         */

        System.out.println(str1.equals(str2));//true
        System.out.println(str1.equals(str3));//true
        System.out.println(str1.equals(str5));//true



    }
}
