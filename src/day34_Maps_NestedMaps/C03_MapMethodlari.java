package day34_Maps_NestedMaps;

import day32_Sets_Maps.MapMethodDepo;

import java.util.Map;

public class C03_MapMethodlari {
    public static void main(String[] args) {
        Map<Integer,String> ogrenciMap = MapMethodDepo.ogrenciMapOlustur();

        System.out.println(ogrenciMap.containsValue("Ali")); // false
        // value degerinin tamami sorulursa true , bir parçası sorulursa false döndürür.

        System.out.println(ogrenciMap.getOrDefault(108, "Ogrenci bulunamadı")); // Ogrenci bulunamadı

        System.out.println(ogrenciMap.getOrDefault(102, "Ogrenci bulunamadı")); // Furkan-Veli-12-B-EA

        System.out.println(ogrenciMap.get(123)); // null

        ogrenciMap.replace(103,"Ali-Cem-11-K-MF");

        System.out.println(ogrenciMap.get(103)); // Ali-Cem-11-K-MF

        ogrenciMap.put(103, "Ali-Cem-12-K-MF");

        System.out.println(ogrenciMap.replace(123, "Ali-Cem-12-K-MF")); // null



        ogrenciMap.replace(103,"Ali-Cem-12-K-MF","Ali-Han-12-K-MF");
        System.out.println(ogrenciMap.get(103)); // Ali-Han-12-K-MF

        // kontrol eder , eski value verilen deger ile aynı ise degistirir , yoksa degistirmez.

    }
}
