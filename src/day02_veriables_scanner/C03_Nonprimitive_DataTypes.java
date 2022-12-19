package day02_veriables_scanner;

import java.security.spec.RSAOtherPrimeInfo;

public class C03_Nonprimitive_DataTypes {
    public static void main(String[] args) {
        String str="JAva candır";

        int sayi=10;
        System.out.println(sayi);

        // primitive data türlerinin hazır method'ları yoktur.
        // ancak non-primitive data türlerinin önceden hazırlanmış
        // bizim kullanabileceğimiz methodları vardır.


        System.out.println(str.toLowerCase()); // java candir. 'toLowerCase' sadece kullanılan satır için çıktıyı küçük harfle yazdırır.

        System.out.println(str.toUpperCase()); // JAVA CANDIR. 'toUpperCase' ise sadece kullanılan satır için çıktıyı büyük harfle yazdırır.


    }
}
