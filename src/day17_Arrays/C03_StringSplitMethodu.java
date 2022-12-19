package day17_Arrays;

import java.util.Arrays;

public class C03_StringSplitMethodu {



    public static void main(String[] args) {
    String str="Java her gecen gün güzellesiyor";
    // split methodu istedigimiz string i istedigimiz ayirac kullanarak parcalara ayirmamıza imkan verir.

        String[] spaceSplit =str.split(" ");

        System.out.println(Arrays.toString(spaceSplit)); //[Java, her, gecen, gün, güzellesiyor]
        System.out.println("Verilen cümlede ki kelime sayısı : "+ spaceSplit.length);

        System.out.println(Arrays.toString(str.split("e"))); // [Java h, r g, c, n gün güz, ll, siyor]

        System.out.println(Arrays.toString(str.split("gün"))); // [Java her gecen ,  güzellesiyor]

        System.out.println(Arrays.toString(str.split("av"))); // [J, a her gecen gün güzellesiyor]


    }
}
