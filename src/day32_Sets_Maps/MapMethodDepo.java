package day32_Sets_Maps;

import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class MapMethodDepo {

    // bize ögrenciMap döndüren bir method olusturun

    public static Map<Integer,String> ogrenciMapOlustur(){

        Map<Integer,String> ogrenciMap=new HashMap<>();
        ogrenciMap.put(101,"Ali-Can-11-H-MF");
        ogrenciMap.put(102,"Furkan-Veli-12-B-EA");
        ogrenciMap.put(103,"Mustafa-Kemal-11-C-MF");
        ogrenciMap.put(104,"Ayse-Can-11-H-MF");
        ogrenciMap.put(105,"Sevgi-Cem-11-T-TM");
        ogrenciMap.put(106,"Sevgi-Can-11-K-MF");

        return ogrenciMap;
    }

    public static boolean isimIleOgrenciArama(Map<Integer, String> ogrenciMaps, String isim) {
        //1-tum value'leri bir collection olarak kaydedelim
        //  // [Ali-Can-11-H-MF, Furkan-Veli-12-B-EA, Mustafa-Kemal-11-C-MF, Ayse-Can-11-H-MF, Sevgi-Cem-11-T-TM, Sevgi-Can-11-K-MF, Cemal-Han-12-M-MF]
        Collection<String> valuesCollection= ogrenciMaps.values();
        //2-  for-each kullanarak her bir value'yu ele alalım
        //3- -'yi kullanarak split yapalım [Ali, Can, 11, H, MF]
        //4- split yaptıgımız array'den isim bilgisini alalım   0.index
        //5- eger valueden aldıgımız isim, aranan isim ile aynı ise
        // true döndürüp for-each bitirelim
        // 6- eger for- each bittiginde true olmadıysa  false döndürelim.

        for (String eachValue:valuesCollection
             ) {
            String[] valueArr=eachValue.split("-");
            String valuedekiIsim=valueArr[0];
            if (valuedekiIsim.equalsIgnoreCase(isim)){
                return true;
            }
        }return false;

    }


}
