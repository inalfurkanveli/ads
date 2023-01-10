package day32_Sets_Maps;

import java.util.*;

public class C01_Set {
    public static void main(String[] args) {
        // Collection objelerden oluşan bir toplulugu bir arada tutan yapilardir.
        // Data turu olarak obje seçilirse içerisine her data türünden element konulabilir.
        // ancak bu durmda elementlere ulasmak, onlari update etmek gibi işlemler normalden daha zor olabilir.
        // Hatta bazen mümkün olmayabilir.
        Set<Object> karisikSet= new HashSet<>();

        karisikSet.add(12);
        karisikSet.add("Java");
        karisikSet.add('S');
        karisikSet.add(false);

        int arr[]= new int[3];
        arr[2]=23;
        arr[1]=15;

        karisikSet.add(arr);
        List<Object> karisikList = new ArrayList<>();
        karisikList.add("Hava");
        karisikList.add(44);

        karisikSet.add(karisikList);

        System.out.println(karisikList); // [Hava, 44]

        System.out.println(karisikSet); // [Java, S, false, 12, [Hava, 44], [I@568db2f2]

        System.out.println(karisikSet.contains(44)); // false
        System.out.println(karisikSet.contains(12)); // true

        System.out.println(karisikSet.size()); // 6
    }
}
