package day16_Arrays;

import java.util.Arrays;

public class C09_ArrayeYeniDegerAtama {
    public static void main(String[] args) {

        int []arr1={1,2,3};

        // arr1={3,6,1,8};
        //arr1=[5,6,4};


       // arr1=new int[5];

        System.out.println(Arrays.toString(arr1));

        //14.satırdaki atama ile java arr1'in pointerini eski array'den silip
        // new keyword ile olusturdugumuz yeni array'a yonlendirir.


        // eski elementleride korumak istersek
        // o zaman atama yapmadan yeni array'i hazırlamalıyız
        // bunun icin bos bir yeni array olusturup
        // eski array'deki elementleri yeni array'e tasıyıp
        // sonra atamayı yapabiliriz.

        int[] temp=new int[5];

        for (int i = 0; i < arr1.length ; i++) {
            temp[i]=arr1[i];

        }

        System.out.println(Arrays.toString(arr1));
        System.out.println(Arrays.toString(temp));

        arr1=temp;
        System.out.println(Arrays.toString(arr1));
        System.out.println(Arrays.toString(temp));

    }
}
