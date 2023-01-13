package day34_Maps_NestedMaps;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class C01_nestedOgrenciMap {
    public static void main(String[] args) {
        Map<Integer, Map<String,String>> ogrenciMap = new HashMap<>();

        Map<String,String> ogrenci101=new HashMap<>();
        ogrenci101.put("Isim","Ali");
        ogrenci101.put("Soyisim","Can");
        ogrenci101.put("Sinif","11");
        ogrenci101.put("Sube","H");
        ogrenci101.put("Bolum","MF");
        Map<String,String> ogrenci102=new HashMap<>();
        ogrenci102.put("Isim","Veli");
        ogrenci102.put("Soyisim","Cem");
        ogrenci102.put("Sinif","10");
        ogrenci102.put("Sube","K");
        ogrenci102.put("Bolum","TM");
        Map<String,String> ogrenci103=new HashMap<>();
        ogrenci103.put("Isim","Mustafa");
        ogrenci103.put("Soyisim","Kemal");
        ogrenci103.put("Sinif","11");
        ogrenci103.put("Sube","C");
        ogrenci103.put("Bolum","MF");

        ogrenciMap.put(101,ogrenci101);
        ogrenciMap.put(102,ogrenci102);
        ogrenciMap.put(103,ogrenci103);

        System.out.println(ogrenciMap);

        /*
        {101={Bolum=MF, Soyisim=Can, Sube=H, Sinif=11, Isim=Ali},
        102={Bolum=TM, Soyisim=Cem, Sube=K, Sinif=10, Isim=Veli},
        103={Bolum=MF, Soyisim=Kemal, Sube=C, Sinif=11, Isim=Mustafa}}
         */

        // 101 numaralı ögrencinin ismini yazdıralım.

        System.out.println(ogrenciMap.get(101).get("Isim")); // Ali
        //102 numaralı ögrencinin sinif bilgisini yazdırın

        System.out.println(ogrenciMap.get(102).get("Sinif")); // 10

        // 103 numaralı ögrencinin sinifini 12 yapalim

        Set<Map.Entry<Integer, Map<String, String>>>  ogrenciEntrySeti = ogrenciMap.entrySet();

        for (Map.Entry<Integer, Map<String, String>> eachOgrenciEntry:ogrenciEntrySeti
             ) {
            // 103- {Bolum=MF, Soyisim=Kemal, Sube=C, Sinif=11, Isim=Mustafa}}
            // once ogrenci value'sunu kaydetmeliyiz

            if (eachOgrenciEntry.getKey()==103){

                Map<String,String> eachOgrenciValueMapi = eachOgrenciEntry.getValue();
                //  {Bolum=MF, Soyisim=Kemal, Sube=C, Sinif=11, Isim=Mustafa}

                eachOgrenciValueMapi.put("Sinif","12");

                eachOgrenciEntry.setValue(eachOgrenciValueMapi);

            }

        }
        System.out.println(ogrenciMap);


    }
}
