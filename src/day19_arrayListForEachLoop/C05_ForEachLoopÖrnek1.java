package day19_arrayListForEachLoop;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class C05_ForEachLoopÖrnek1 {
    public static void main(String[] args) {
        /*
        Soru 1- Verilen bir array’de tekrar eden elementler icin, mukerrer olanlari silip,
        tum elemanlardan sadece 1 tane yapip eski array’e yeni halini atayip yazdirin
         */

        Integer[] arr={2,3,4,5,34,5,4,6,};
        List<Integer> list1= new ArrayList<>();


        for (Integer each: arr    // arr array'indeki degerleri gözden geçirip tekrarlamayanları list1'e ekledik.
             ) {
            if(!list1.contains(each)){
                list1.add(each);
            }
        }
        // list olarak unique degerelerden bir tane list olusturduk

        arr=new Integer[list1.size()];   // list1'deki elementleri array e kopyalamak için yeni bir array oluşturduk.

        // şimdi listteki elementleri array'e kopyalayım.
        // array'e atama yapmak için index'e ihtiyacımız oldugundan
        // for-each loop kullanmak pratik degildir.

        for (int i = 0; i < arr.length ; i++) {  // list1'deki unique elementleri yeni array'e kopyaladık.
            arr[i]=list1.get(i);
        }
        System.out.println(Arrays.toString(arr)); // array'in son halini yazdırdık.
    }
}
