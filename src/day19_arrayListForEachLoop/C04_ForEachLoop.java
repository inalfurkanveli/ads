package day19_arrayListForEachLoop;

import java.util.ArrayList;
import java.util.List;

public class C04_ForEachLoop {
    public static void main(String[] args) {


        Integer[] arr={2,3,4,5,34,5,4,6,};

        List<Integer> list1=new ArrayList<>();

        // array'deki tüm elemanları list'e kopyalayım.

        for (int each:arr
             ) {
            list1.add(each);
        }
        System.out.println(list1);

        // array'deki çift sayıları liste ekle.

        List<Integer> ciftSayilarList = new ArrayList<>();
        for (Integer each: arr
             ) {
            if (each%2==0)
                ciftSayilarList.add(each);
        }
        System.out.println(ciftSayilarList);

    }
}
