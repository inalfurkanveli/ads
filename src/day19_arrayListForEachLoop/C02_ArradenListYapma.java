package day19_arrayListForEachLoop;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class C02_ArradenListYapma {
    public static void main(String[] args) {

       Integer[] arr={2,3,4,5,34,5,4,6,};

        /*
        Verilen bir array'i Liste cevirmek için 2 yöntem vardır.
        1 loop ile tüm elementleri list'e kopyalamak.
        2.yöntemde asList() kullanmak - çok tavsiye edilmez.
        Çünkü iki büyük dez avantajı var.

        asList ile olusturulan list array'den dönüştürüldüğü için add,remove gibi size'ı değiştiren methodlar
        kullanılamaz.

        asList ile oluşturulan list ile bağlı olduğu array birbirinden ayrılmıyor .
        Birinde yapacagımız degisilik diğerini etkiliyor.


         */

        List<Integer> list1=new ArrayList<>();
        for (int i = 0; i <arr.length ; i++) {
            list1.add(arr[i]);
        }
        System.out.println("Loop ile taşınan list "+ list1);


        List<Integer> list2= Arrays.asList(arr);

        System.out.println("asList ile olusutrulan list : "+ list2);

        //  list2.add(6);

        arr[0]=10;
    }
}
