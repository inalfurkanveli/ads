package day33_Maps;

import day32_Sets_Maps.MapMethodDepo;

import java.util.Map;
import java.util.Set;

public class C02_EntrySet {
    public static void main(String[] args) {
        // tum ogrencileri 101= Ali-Can-11-H-MF seklinde yazdirin

        Map<Integer,String> ogrenciMap= MapMethodDepo.ogrenciMapOlustur();

        System.out.println(ogrenciMap);
        //{101=Ali-Can-11-H-MF, 102=Furkan-Veli-12-B-EA, 103=Mustafa-Kemal-11-C-MF, 104=Ayse-Can-11-H-MF, 105=Sevgi-Cem-11-T-TM, 106=Sevgi-Can-11-K-MF}

        System.out.println(" No        Ogrenci Bilgileri");
        System.out.println("==============================");

        // 1- önce ögrenci numaralarını elde edelim
         Set<Integer> ogrenciNoSet= ogrenciMap.keySet(); // [101, 102, 103, 104, 105, 106]

        for (Integer eachKey:ogrenciNoSet
             ) {
            System.out.println(eachKey + "="+ ogrenciMap.get(eachKey));


            /*
            Aslinda bizden istenen map'in içindeki elementler
            Java Map'deki elementleri key-value ikilisi olarak birlikte alabilmemiz için
            ENTRY class'i olusturmuştur.

            entry'ler de map ile ayni data yapisina sahip olmalıdır.
            örnegin ögrenci map'ini düşünürsek entry'ler

            Entry<Integer,String>
             */

            Set<Map.Entry<Integer,String>> ogrenciEntrySet= ogrenciMap.entrySet();
            System.out.println(" No        Ogrenci Bilgileri");
            System.out.println("==============================");

            for (Map.Entry<Integer,String> eachEntry:ogrenciEntrySet
                 ) {
                System.out.println(eachEntry);
            }



        }
    }
}
