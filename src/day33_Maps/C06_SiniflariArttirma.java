package day33_Maps;

import day32_Sets_Maps.MapMethodDepo;

import java.util.Map;

public class C06_SiniflariArttirma {
    public static void main(String[] args) {
        // ogrenci map'indeki tum sınıf degerlerini 1 artirin
        // 12.sınıf varsa sınıf bilgisini mezun yap

        Map<Integer,String> ogrenciMap= MapMethodDepo.ogrenciMapOlustur();

        System.out.println(ogrenciMap = MapMethodDepo.siniflariArtir(ogrenciMap));
    }
}
