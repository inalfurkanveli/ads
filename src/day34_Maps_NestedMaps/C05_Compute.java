package day34_Maps_NestedMaps;

import java.util.Map;
import java.util.TreeMap;

public class C05_Compute {

    public static void main(String[] args) {
        Map<String,Integer> harfSayilarıMap= new TreeMap<>();
        harfSayilarıMap.put("A",10);
        harfSayilarıMap.put("C",15);
        harfSayilarıMap.put("D",3);
        harfSayilarıMap.put("K",5);

        System.out.println(harfSayilarıMap); // {A=10, C=15, D=3, K=5}

        // A'nın kullanım miktarini 20 tane yapalım

        harfSayilarıMap.put("A",20);

        harfSayilarıMap.put("C", harfSayilarıMap.get("C")*2);

        System.out.println(harfSayilarıMap); // {A=20, C=30, D=3, K=5}

        // D'nin miktarını 5 arttıralım

        harfSayilarıMap.compute("D", (k,v) -> v+5);

        // eger map'te T varsa kullanım miktarını 3 eksiltin

        harfSayilarıMap.computeIfPresent("T",(k,v)-> v-3);

        // K harfi varsa arttır kullanımını 2 azaltın

        harfSayilarıMap.computeIfPresent("K",(k,v)-> v-2);
        System.out.println(harfSayilarıMap); // {A=20, C=30, D=8, K=3}

        // T harfi yoksa kullanım miktarı 3 olarak ekleyin

        harfSayilarıMap.computeIfAbsent("T", v->3); //
        System.out.println(harfSayilarıMap); // {A=20, C=30, D=8, K=3, T=3}


    }
}
