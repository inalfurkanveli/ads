package day17_Arrays;

import java.util.Arrays;

public class C02_Equals {
    public static void main(String[] args) {
        int[] arr={3 , 8, 0};
        int[] arr2={8 , 3, 0};

        System.out.println(Arrays.equals(arr, arr2)); // false

        // equals methodu hem elementleri hemde indexleri kontrol eder, aynı indexlerde
        // aynı elementler varsa true , yoksa false döner.

        // eger sıralamadan dolayı false dönmesini istemiyorsak
        // önce iki array'ide sort yapabiliriz sonra equals() ile karsılastırabiliriz.


        Arrays.sort(arr);
        Arrays.sort(arr2);

        System.out.println(Arrays.equals(arr, arr2));


    }
}
