package day31_collections;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class C06_ArraydekiTekrarlardanKurtulma {
    /*
    verilen bir arraydeki tekrar eden elementleri
    sadece 1 kere yazarak array2i kısaltan kod yazınız
     */
    public static void main(String[] args) {
        int [] arr={1,2,4,5,65,2,3,1,2,3,4,5,3,4,6,6};

        Set<Integer> arrSet= new HashSet<>();
        // arraydeki tüm elementleri set'e ekliyelim

        for (int each:arr
             ) {
            arrSet.add(each);
        }
        System.out.println(arrSet);

        // Set'deki element sayisina esit bir array olusturup
        // set'deki elementleri array'e tasiylaım

        arr=new int[arrSet.size()];

        int index=0;
        for (int each:arrSet
             ) {
            arr[index]=each;
            index++;
        }
        System.out.println("Array'in son hali : "+ Arrays.toString(arr));

    }

}
