package day18_ArrayList;

import java.util.ArrayList;
import java.util.List;

public class C06_set {
    public static void main(String[] args) {

        List<String> harfler=new ArrayList<>();

        harfler.add("A");
        harfler.add("Z");
        harfler.add("M");

        /*
        2.index'e F elemanını ekleyin
        add method'u var olan listeden herhangi bir elementi degistirmeden
        istediginiz elementi ekleyip diger elementleri yana kaydırır.
         */

        harfler.add(2,"F");
        System.out.println(harfler);

        harfler.set(1,"D");  // harfler listesindeki 1.index'deki elementin degerini D yapar.
        System.out.println(harfler);
    }
}
