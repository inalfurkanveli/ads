package day19_arrayListForEachLoop;

import java.util.ArrayList;
import java.util.List;

public class C07_ForEachLoopÖrnek3 {
    public static void main(String[] args) {
        /*
        Soru 5- Verilen iki array’in elementlerini karsilastirip,
        ikisinde ortak olan elementleri ayri bir liste olarak veren bir program yazin.
         */

        int[] arr1 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int[] arr2 = {2, 4, 6, 8, 10};

        List<Integer> ortakElementler = new ArrayList<>();

        for (int eachArr1 : arr1
        ) {
            for (int eachArr2 : arr2
            ) {
                if (eachArr1 == eachArr2) {
                    if (!ortakElementler.contains(eachArr1)) {
                        ortakElementler.add(eachArr1);
                    }
                }
            }
        }
        System.out.println(ortakElementler);
    }
}
