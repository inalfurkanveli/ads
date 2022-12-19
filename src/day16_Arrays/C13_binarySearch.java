package day16_Arrays;

import java.util.Arrays;

public class C13_binarySearch {
    public static void main(String[] args) {

        // binary tree javanın kullandıgı özel bir siralama yöntemidir.
        // binarySearch method'u binaryTree ozelligini kullandigindan
        // sirali olmayan array'lerde dogru sonuc dondurmeyebilir
        //Eger binarySearch() kullanilacaksa
        // oncesinde MUTLAKA sort() kullanilmalidir.


        int[] arr={2,6,9,3,15,1,7};

        Arrays.sort(arr);

        System.out.println(Arrays.toString(arr));

        // bir elementin var olup olmadıgına bakmadan önce mutlaka sıralamak gerekir.

    }
}
