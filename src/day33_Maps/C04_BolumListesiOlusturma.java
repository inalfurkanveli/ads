package day33_Maps;

import day32_Sets_Maps.MapMethodDepo;

import java.util.Map;

public class C04_BolumListesiOlusturma {
    public static void main(String[] args) {
        // verilen bölümdeki ogrencilerin
        // no isim soyisim ve siniflarıni yazdırın
        // bir method olusturun


        Map<Integer,String> ogrenciMap = MapMethodDepo.ogrenciMapOlustur();

        MapMethodDepo.bolumListesiOlusturma(ogrenciMap,"EA");
    }
}
