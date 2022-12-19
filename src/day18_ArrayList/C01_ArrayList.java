package day18_ArrayList;

import java.util.ArrayList;
import java.util.List;

public class C01_ArrayList {
    public static void main(String[] args) {
        /*
        Arraylist esnek uzunlukta bir array'dir.
        Ancak ArrayList,array alt yapısını kullandıgından
        elementleri tek tek eklemek gerekir.
         */
        List<String> harfler= new ArrayList<>();

        System.out.println(harfler); // []

        harfler.add("A");
        harfler.add("B");
        harfler.add("K");

        System.out.println(harfler); // [A ,B ,K]

        harfler.add(1,"V");

        System.out.println(harfler); // [A, V, B, K ]  B ile K arasına D ekleyelim.

        harfler.add(3,"D");

        List<String> karakterler = new ArrayList<>();
        karakterler.add("*");
        karakterler.add("/");

        System.out.println(harfler.addAll(karakterler));
        System.out.println(harfler); // [A, V, B, D, K, *, /]

        harfler.addAll(2,karakterler);

        System.out.println(harfler);// [A, V, *, /, B, D, K, *, /]


    }
}
