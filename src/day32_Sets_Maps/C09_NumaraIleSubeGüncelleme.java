package day32_Sets_Maps;

import java.util.Map;

public class C09_NumaraIleSubeG√ľncelleme {
    public static void main(String[] args) {
        // numarasi verilen √∂grencinin sube ismini
        // verilen sube yapan bir method olusturun.


        Map<Integer,String> ogrenciMapNumara=MapMethodDepo.ogrenciMapOlustur();

       ogrenciMapNumara= MapMethodDepo.numaraIleSubeDegistir(ogrenciMapNumara,105,"K");

        System.out.println(ogrenciMapNumara);

        ogrenciMapNumara= MapMethodDepo.numaraIleSubeDegistir(ogrenciMapNumara,101,"F");
        System.out.println(ogrenciMapNumara);
    }
}
