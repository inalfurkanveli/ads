package day18_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class C05_soru {
    public static void main(String[] args) {
        /*
        verilen bir array deki tekrar eden elementleri silip array i unique degerlerden olusan bir
        array haline getirin
         */


        int[] arr={1,2,3,2,4,3,1,1,2,4,5,56,6,7,8,9,0,11,12};


        List<Integer> benzersizList= new ArrayList<>();

        for (int i = 0; i <arr.length ; i++) {
            if(!(benzersizList.contains(arr[i]))){
                benzersizList.add(arr[i]);
            }
        }
        System.out.println(benzersizList);


        /*
        soruda bu degerleri arr'ye atamamız isteniyor.
         */


        arr=new int[benzersizList.size()]; // [0, 0, 0, ,0 ,0]

        for (int i = 0; i < arr.length ; i++) {
            arr[i]=benzersizList.get(i);          // Her index'teki elementi Array'in index'ine
                                                    // eşitledik ve atamasını yaptık

        }

        System.out.println(Arrays.toString(arr));

    }
}
