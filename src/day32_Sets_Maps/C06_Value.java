package day32_Sets_Maps;

import java.util.HashMap;
import java.util.Map;

public class C06_Value {
    public static void main(String[] args) {

        // Map olustur methodu bize bir map döndürüyor.
        // biz o class'daki map'i kullanmak istiyoruz
        // ama her seferinde o class'a o mapi yeniden oluşturmamız
        //işimize yaramaz

        // Bu class'da bir map olusturmak istedigimizde
        // new HashMap <> () yazıyoruz
        // ancak bu bize boş bir map getiriyor
        // bu kodun yerine mapMethodDepo'dan ogrenciMapOlustur method'unu calistirirsak
        // bize dolu bir map getirir
        // bizde onu içinde oldugumuz class'da olusturdugumuz ogrenciMap'e atama yapariz


        Map<Integer,String> ogrenciMaps=MapMethodDepo.ogrenciMapOlustur();
        ogrenciMaps.put(110,"Cemal-Han-12-M-MF");

        System.out.println(ogrenciMaps);

        System.out.println(ogrenciMaps.keySet()); // [101, 102, 103, 104, 105, 106, 110]
        System.out.println(ogrenciMaps.values());
        // [Ali-Can-11-H-MF, Furkan-Veli-12-B-EA, Mustafa-Kemal-11-C-MF, Ayse-Can-11-H-MF, Sevgi-Cem-11-T-TM, Sevgi-Can-11-K-MF, Cemal-Han-12-M-MF]

        // verilen ismin ogrenciMap'de olup olmadıgını kontrol edip true veya false dönen bir method olusturun

        boolean sonuc=MapMethodDepo.isimIleOgrenciArama(ogrenciMaps,"Ali");

        System.out.println(sonuc); // true

        System.out.println(MapMethodDepo.isimIleOgrenciArama(ogrenciMaps, "Kemal")); // false

    }
}
