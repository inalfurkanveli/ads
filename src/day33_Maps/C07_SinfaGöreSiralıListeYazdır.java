package day33_Maps;

import day32_Sets_Maps.MapMethodDepo;

import java.util.Map;

public class C07_SinfaGöreSiralıListeYazdır {
    // tüm ögrenci listesini
    // sınıf sube no isim soyisim seklinde
    // dogal sirali olarak
    // Yazdiran bir method olusturun
    public static void main(String[] args) {

        Map<Integer,String> ogrenciMap= MapMethodDepo.ogrenciMapOlustur();

        MapMethodDepo.sinifSiraliListeOlustur(ogrenciMap);




    }
}
