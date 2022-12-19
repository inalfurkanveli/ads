package day08_stringManipilation;

import java.util.Random;

public class C06_lenght {
    public static void main(String[] args) {
        String str="Java her gecen gun daha da guxzellesiyor";

        // sondan 3.karakteri yazdırın

        System.out.println(str.charAt(str.length()-3)); // y

        System.out.println(str.length()); //59

        // rastgele bir karakterini yazdırın

        Random rnd= new Random(); // rnd değerini 0 ile 1 arasında rastgele bir değer oluşturur.

        int index= rnd.nextInt(str.length()); // str.lenght() ' den küçük rastgele bir int üretir.

    }
}
