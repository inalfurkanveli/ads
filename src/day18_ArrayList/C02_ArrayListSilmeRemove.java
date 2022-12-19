package day18_ArrayList;

import java.util.ArrayList;
import java.util.List;

public class C02_ArrayListSilmeRemove {
    public static void main(String[] args) {

        List<String> harfler= new ArrayList<>();

        harfler.add("A");
        harfler.add("B");
        harfler.add("C");
        harfler.add("D");

        System.out.println(harfler.remove("D")); // D ' yi bulup siler ve görevi tmaamladıgı için true döner.
        System.out.println(harfler);


        System.out.println(harfler.remove(0)); // 0.indexteki elementi siler ve görevi tamamlayıp silinen elementi
        // bize yazdırır.

        List<String> yeniList=new ArrayList<>();
        yeniList.add("F");
        yeniList.add("G");
        yeniList.add("T");

        System.out.println(yeniList.removeAll(harfler));
        // harfler listesindeki tüm elementleri yeniList'tern siler görevi tamamlarsa true,yoksa false döner.
    }
}
