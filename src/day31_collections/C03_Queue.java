package day31_collections;

import java.util.LinkedList;
import java.util.Queue;

public class C03_Queue {
    public static void main(String[] args) {

        Queue<String> harfler = new LinkedList<>();

        harfler.add("H");
        harfler.add("K");
        harfler.add("B");
        harfler.add("K");

        System.out.println(harfler); // [H, K, B, K]

        //1.index'e F ekleyin
        // Queue özelliginden dolayı ekleme sona olmali , ortaya ekleme olmaz

        System.out.println(harfler.remove()); // H
        System.out.println(harfler);
        System.out.println(harfler.remove("K")); // true
        System.out.println(harfler); // [B, K]

        System.out.println(harfler.element());
        System.out.println(harfler);
        System.out.println(harfler.peek());
        System.out.println(harfler);


        Queue<String> karakterler = new LinkedList<>();
         // System.out.println(karakterler.element()); // exception NoSuchElementException
        System.out.println(karakterler.peek()); // null

        System.out.println(harfler.poll()); //
        System.out.println(harfler); // [K]

       // System.out.println(karakterler.remove()); // .NoSuchElementException
        System.out.println(karakterler.poll()); // null

        harfler.offer("C");
        System.out.println(harfler);
        /*
        add ile offer arasındaki fark offer varsa kapasiteyi kontrol eder
        kapasite varsa ekler
        add kapasiteye bakmadan direkt olarak ekleme yapar.
         */

    }
}
