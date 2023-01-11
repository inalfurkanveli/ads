package day33_Maps;

import day32_Sets_Maps.MapMethodDepo;

import java.util.Map;

public class C05_SoyisimleriBuyukHarfYapma {
    public static void main(String[] args) {
        // Map’deki soyisimleri buyuk harfe cevirin


        Map<Integer,String> ogrenciMap= MapMethodDepo.ogrenciMapOlustur();

        ogrenciMap= MapMethodDepo.soyisimleriBuyukHarfYap(ogrenciMap);

        System.out.println(MapMethodDepo.soyisimleriBuyukHarfYap(ogrenciMap));

        MapMethodDepo.tumListeyiYazdır(ogrenciMap);
    }
}
