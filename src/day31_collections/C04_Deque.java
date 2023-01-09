package day31_collections;

import java.util.*;

public class C04_Deque {
    // Deque double ended queue demektir
    // iki yönlü kuyruk
    // Bu iki yönlü yapısından dolayı pek cok methodun first ve last versiyonu vardır.

    public static void main(String[] args) {
        Deque<String> harfler= new LinkedList<>();
        harfler.add("J");
        harfler.add("L");

        System.out.println(harfler); // [J, L]
        harfler.addFirst("B");
        System.out.println(harfler); // [B, J, L]

        System.out.println(harfler.removeFirst()); // B
        System.out.println(harfler); // [J, L]

        harfler.addFirst("A");
        harfler.addLast("A");
        harfler.add("K");
        System.out.println(harfler); // [A, J, L, A, K]

        // sona dogru  olan A'yi silin
        System.out.println(harfler.removeLastOccurrence("A")); // true
        System.out.println(harfler); // [A, J, L, K]

        System.out.println(harfler.removeLastOccurrence("T")); // false

        LinkedList<String > karakterler = new LinkedList<>();
        karakterler.push("A");
        karakterler.push("B");
        System.out.println(karakterler); // [B, A]

        System.out.println(karakterler.clone()); // [B, A]


     }

}
