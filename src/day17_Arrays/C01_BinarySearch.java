package day17_Arrays;

import java.util.Arrays;

public class C01_BinarySearch {
    public static void main(String[] args) {

        int[] arr={2,8,4,1,9,3,6};

        System.out.println(Arrays.binarySearch(arr, 2)); // -5

        Arrays.sort(arr);

        System.out.println(Arrays.toString(arr)); // [1, 2, 3, 4, 6, 8, 9]

        System.out.println(Arrays.binarySearch(arr, 2)); // 1
        System.out.println(Arrays.binarySearch(arr, 8)); // 5

        System.out.println(Arrays.binarySearch(arr, 0)); // -1
        System.out.println(Arrays.binarySearch(arr, 5)); // -5
        System.out.println(Arrays.binarySearch(arr, 18));// -8

        /*
        Olmayan bir elementi binarySearch() ile aratırsanız
        once listede olsaydı kacıncı sırada olurdu sorusunun cevabnı bulur
        olmadıgını belirtmek icin basına - koyar.
         */

        System.out.println(Arrays.binarySearch(arr, 7)); // -6


    }
}
