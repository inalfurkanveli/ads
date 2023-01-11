package day33_Maps;

import day32_Sets_Maps.MapMethodDepo;

import java.util.Map;

public class C08_IsimSoyisimSiraliListe {
    public static void main(String[] args) {
        // tum ogrenci Listesini isim soyisim no sinif sube bolum
        // seklinde sirali olarak yazdiran method olusturun


        Map<Integer,String> ogrenciMap= MapMethodDepo.ogrenciMapOlustur();

        MapMethodDepo.isimSoyisimSiraliListeYazdir(ogrenciMap);
    }
}
