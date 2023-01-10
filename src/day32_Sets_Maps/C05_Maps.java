package day32_Sets_Maps;

import java.util.HashMap;
import java.util.Map;

public class C05_Maps {
    public static void main(String[] args) {

        Map<Integer,String> ogrenciMap=new HashMap<>();
        ogrenciMap.put(101,"Ali-Can-11-H-MF");
        ogrenciMap.put(102,"Furkan-Veli-12-B-EA");
        ogrenciMap.put(103,"Mustafa-Kemal-11-C-MF");
        ogrenciMap.put(104,"Ayse-Can-11-H-MF");

        System.out.println(ogrenciMap);
        System.out.println(ogrenciMap.size()); // 4

        // map'te 103 numaralı ögrenci var mı ?

        System.out.println(ogrenciMap.containsKey(103));  // true

        // Ali diye bir ögrenci var mı ?

        System.out.println(ogrenciMap.containsValue("Ali")); // false
        System.out.println(ogrenciMap.containsValue("Ali-Can-11-H-MF")); // true


    }
}
