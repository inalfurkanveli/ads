package sameQuestions;

import java.util.Arrays;

public class C23_soru39 {
    public static void main(String[] args) {
        /*
        Bir tamsayı dizisini (Int Array) girdi olarak kabul eden ve verilen bu (Arrayden) diziden
         minimum ve maksimum sayıları yazdıran bir yöntem yazın
Örnek:
Input : {3,2,5,4,1,6}
Output :
min: 1
max: 6

         */


        int [] arr = {3,2,4,5,1,6};

        Arrays.sort(arr);
        int min = arr[0];
        int max = arr[arr.length-1];

        System.out.println(Arrays.toString(arr));
        System.out.println("Arrayin min değeri : "+ min);
        System.out.println("Arrayin max değeri : "+ max );




    }
}
