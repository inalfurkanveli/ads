package day08_stringManipilation;

public class C04_equalsIgnoreCase {
    public static void main(String[] args) {
        String str1="Pazar";
        String str2="PAzar";
        String str3="PazaR";
        String str4="PAZAR";
        String str5="PaZar";

        System.out.println(str1.equals(str2));//false
        System.out.println(str1.equals(str3));//false
        System.out.println(str1.equals(str4));//false
        System.out.println(str1.equals(str5));//false

        /*
        Eğer iki metni karşılaştırırken buyuk kucuk harf duyarlılığı (case sensitive)
        onemsiz ise o zaman
        equalsIgnoreCase() kullanılır.
         */

        System.out.println(str1.equalsIgnoreCase(str2));//true
        System.out.println(str1.equalsIgnoreCase(str3));//true
        System.out.println(str1.equalsIgnoreCase(str4));//true
    }
}
