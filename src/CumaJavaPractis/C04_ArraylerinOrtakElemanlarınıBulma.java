package CumaJavaPractis;

import java.util.ArrayList;
import java.util.Arrays;

public class C04_ArraylerinOrtakElemanlarınıBulma {
    public static void main(String[] args) {
        /*
         * iki array arasinda ayni olan elemanlari bir liste ekleyen program yazin
         * (buyuk kucuk harf onemsiz)
         *
         * Input1 : {John,Brad,Ange,Sofia,Emily} Input2 : {sofia,brad,grace,emily,hazel}
         *
         * Output : [sofia,brad,emily]
         */





        String[] array1={"John","Brad","Ange","Sofia","Emily"};
        String[] array2={"Sofia","Brad","Grace","Emily","hazel"};
        System.out.println("array1 = " + Arrays.toString(array1));

        System.out.println("array2 = " + Arrays.toString(array2));

        ortakElemanlar(array1,array2);
    }

    private static void ortakElemanlar(String[] arr1,String[] arr2 ) {

        ArrayList<String> arrList = new ArrayList<>();

        for (int i = 0; i <arr1.length ; i++) {

            for (int j = 0; j <arr2 .length ; j++) {

                if (arr1[i].equalsIgnoreCase(arr2[j])){
                    arrList.add(arr1[i]);
                }

            }



        }
        System.out.println(arrList);



    }


}
