package day32_Sets_Maps;

import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class MapMethodDepo {

    // bize ögrenciMap döndüren bir method olusturun

    public static Map<Integer, String> ogrenciMapOlustur() {

        Map<Integer, String> ogrenciMap = new HashMap<>();
        ogrenciMap.put(101, "Ali-Can-11-H-MF");
        ogrenciMap.put(102, "Furkan-Veli-12-B-EA");
        ogrenciMap.put(103, "Mustafa-Kemal-11-C-MF");
        ogrenciMap.put(104, "Ayse-Can-11-H-MF");
        ogrenciMap.put(105, "Sevgi-Cem-11-T-TM");
        ogrenciMap.put(106, "Sevgi-Can-11-K-MF");

        return ogrenciMap;
    }

    public static boolean isimIleOgrenciArama(Map<Integer, String> ogrenciMaps, String isim) {
        //1-tum value'leri bir collection olarak kaydedelim
        //  // [Ali-Can-11-H-MF, Furkan-Veli-12-B-EA, Mustafa-Kemal-11-C-MF, Ayse-Can-11-H-MF, Sevgi-Cem-11-T-TM, Sevgi-Can-11-K-MF, Cemal-Han-12-M-MF]
        Collection<String> valuesCollection = ogrenciMaps.values();
        //2-  for-each kullanarak her bir value'yu ele alalım
        //3- -'yi kullanarak split yapalım [Ali, Can, 11, H, MF]
        //4- split yaptıgımız array'den isim bilgisini alalım   0.index
        //5- eger valueden aldıgımız isim, aranan isim ile aynı ise
        // true döndürüp for-each bitirelim
        // 6- eger for- each bittiginde true olmadıysa  false döndürelim.

        for (String eachValue : valuesCollection
        ) {
            String[] valueArr = eachValue.split("-");
            String valuedekiIsim = valueArr[0];
            if (valuedekiIsim.equalsIgnoreCase(isim)) {
                return true;
            }
        }
        return false;

    }


    public static void soyIsimIleOgrenciListesiYazdırma(Map<Integer, String> ogrenciMap, String soyIsim) {
        //1- map'deki value leri bir collection olarak kaydedelim
        // [Ali-Can-11-H-MF, Furkan-Veli-12-B-EA, Mustafa-Kemal-11-C-MF, Ayse-Can-11-H-MF, Sevgi-Cem-11-T-TM, Sevgi-Can-11-K-MF, Cemal-Han-12-M-MF]
        // 2- for-each ile her bir value bilgisini ele alalım  Ali-Can-11-H-MF
        //3- value'yu - ile split yapıp bir array elde edelim  [Ali, Can, 11, H, MF]
        //4- Array'in 1.index'indeki soyİsme bakıp aranan soyİsimle aynı ise
        // İsim,Soyisim,Sinif ve sube bilgilerini yazdıralım.

        Collection<String> ogrenciValueCollection = ogrenciMap.values();
        // Liste'nin ilk satırı olarak başlıkları yazdıralım
        System.out.println("Isim Soyisim Sınıf Sube ");

        for (String eachValue : ogrenciValueCollection
        ) {
            String[] valueArr = eachValue.split("-");
            String valueSoyIsim = valueArr[1];
            if (valueSoyIsim.equalsIgnoreCase(soyIsim)) {
                System.out.println(valueArr[0] + " " +
                        valueArr[1] + " " +
                        valueArr[2] + " " +
                        valueArr[3] + " ");


            }
        }


    }

    public static void OgrenciSoyIsimIleYazdırma(Map<Integer, String> ognenciSoyİsim, String sube, String sinif) {
        Collection<String> ValueCollection = ognenciSoyİsim.values();
        System.out.println("İsim Soyisim");
        for (String eachValue : ValueCollection
        ) {
            String[] valueArr = eachValue.split("-");
            if (valueArr[2].equalsIgnoreCase(sinif) && valueArr[3].equalsIgnoreCase(sube)) {
                System.out.println(valueArr[0] + " " + valueArr[1]);
            }
        }
    }

    public static Map<Integer, String> numaraIleSubeDegistir(Map<Integer, String> ogrenciMapNumara, int numara, String sube) {
        // 1- okul numarasını biliyoruz, direk ögrenci Value'ye ulasabilirz

        String ogrenciValue = ogrenciMapNumara.get(numara); // "Sevgi-Cem-11-T-TM"

        String[] valueArr = ogrenciValue.split("-"); // "Sevgi-Cem-11-T-TM"
        // 2- sube ismini güncelleyelim
        valueArr[3] = sube; //  Sevgi-Cem-11-K-TM
        // 3- Array'deki güncel bilgileri yeniden value formatında bir String Yapalım

        String yeniValue = valueArr[0] + "-" + valueArr[1] + "-" + valueArr[2] +
                "-" + valueArr[3] + "-" + valueArr[4];

        //4- ogrenci no ile yani key ile yeni value'yu map'e ekleyelim

        ogrenciMapNumara.put(numara, yeniValue);

        return ogrenciMapNumara;


    }
}
