package day33_Maps;

import day32_Sets_Maps.MapMethodDepo;

import java.util.Map;

public class C03_SinifListesiYazdirma {
    public static void main(String[] args) {
        // verilen siniftaki ogrencilerin no,isim,soyisim,bolumlerini
        // bir liste olarak yazdiran bir method olusturun

        Map<Integer,String> ogrenciMap = MapMethodDepo.ogrenciMapOlustur();

        MapMethodDepo.sinifListesiYazdirma(ogrenciMap,"10");
    }
}
