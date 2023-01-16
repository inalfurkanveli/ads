package day33_Maps;

import day32_Sets_Maps.MapMethodDepo;

import java.util.Map;

public class C08_IsimSoyisimSiraliListe {
    public static void main(String[] args) {
        // tum ogrenci Listesini isim soyisim no sinif sube bolum
        // seklinde sirali olarak yazdiran method olusturun


        Map<Integer,String> ogrenciMap= MapMethodDepo.ogrenciMapOlustur();

        MapMethodDepo.isimSoyisimSiraliListeYazdir(ogrenciMap);

        /*


        Bu method printf() kullanılarak asagıdaki çıktı elde edilmiştir.


            isim     soyisim no  sinif sube bolum
            ===========================
            Ali       Can   101   11     H     MF
            Ayse      Can   104   10     H     MF
            Furkan    Veli  102   12     B     EA
            Mustafa   Kemal 103   11     C     MF
            Sevgi     Can   106   10     K     MF
            Sevgi     Cem   105   11     T     TM
         */
    }
}
