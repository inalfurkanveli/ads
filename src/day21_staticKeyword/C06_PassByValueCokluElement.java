package day21_staticKeyword;

import java.util.Arrays;

public class C06_PassByValueCokluElement {
    public static void main(String[] args) {

        int[] arr={3,6,8};

        // bir method olusturun method'da array'e 5 elementli yeni bir array atayın ve yazdırın
        // main methoda döndükten sonra yine array'i yazdırın.

        arrayiDegistir(arr);

        System.out.println(Arrays.toString(arr)); // [3, 6, 8]
    }
    public  static void arrayiDegistir(int[] arr){

        arr=new int[5];

        System.out.println(Arrays.toString(arr)); //[0, 0, 0, 0, 0]

    }


}
