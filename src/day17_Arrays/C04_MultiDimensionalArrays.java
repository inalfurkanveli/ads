package day17_Arrays;

import java.util.Arrays;

public class C04_MultiDimensionalArrays {
    public static void main(String[] args) {
        int[][] arr={{1,7},{2,3},{4,5,7,0},{5},{7,8,9,13}};

        System.out.println(arr.length); // 5
        System.out.println(arr[2].length); // 4
        System.out.println(arr[2][1]); // 5

        // Multi Dimensional Array ile calısırken dikkat etmemiz gereken en önemli konu
        // yazdıgımız kodun bir array mi yazdırabilecegimiz bir element döndürdüğüdür.


        System.out.println(Arrays.toString(arr[3])); // [2]   ---> Bu bir ARRAY !!!

        //21.satırdaki 2 elementini yazdırmak istersek
        System.out.println(arr[3][0]);  // ---> Bu bir ELEMENTTİR !!!


        // Multi Dimenisional Array'in tümünü isterseniz tek katlı Arrayleri yazdormak
        // için kullandıgımız yontem yeterli olmaz

        System.out.println(Arrays.toString(arr)); // elementlerin referansını yazdırır.

        System.out.println(Arrays.deepToString(arr)); // arrayin tamamını yazdırır.
        // [[1, 7], [2, 3], [4, 5, 7, 0], [5], [7, 8, 9, 13]]


    }
}
