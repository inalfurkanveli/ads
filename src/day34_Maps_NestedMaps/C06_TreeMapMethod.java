package day34_Maps_NestedMaps;

import java.util.Map;
import java.util.TreeMap;

public class C06_TreeMapMethod {
    public static void main(String[] args) {
        TreeMap<String,Integer> harfsayilariMap = new TreeMap<>();
        harfsayilariMap.put("A",10);
        harfsayilariMap.put("C",15);
        harfsayilariMap.put("D",3);
        harfsayilariMap.put("K",5);

        System.out.println(harfsayilariMap.subMap("C", "F")); // {C=15, D=3}
        System.out.println(harfsayilariMap.subMap("C", "K")); // {C=15, D=3} C dahil , K haric
        System.out.println(harfsayilariMap.descendingMap()); // {K=5, D=3, C=15, A=10}

        System.out.println(harfsayilariMap.lowerKey("E")); // D
        System.out.println(harfsayilariMap.lowerKey("D")); // C

        System.out.println(harfsayilariMap.floorKey("E")); // D


    }
}
