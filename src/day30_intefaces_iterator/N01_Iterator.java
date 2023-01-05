package day30_intefaces_iterator;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class N01_Iterator {
    public static void main(String[] args) {
        List<Integer> sayilar=new ArrayList<>();

        sayilar.add(5);
        sayilar.add(23);
        sayilar.add(2);
        sayilar.add(9);
        sayilar.add(11);

        System.out.println(sayilar); // 5,23,2,9,11

        // index yapisini kullanmadan tum elemanları 3 artirin

        for (Integer each:sayilar
             ) {
            System.out.print(each+3+ " ");
        }

        System.out.println("");
        System.out.println(sayilar);

        // index yapısını kullanmadan  tüm elementleri yazdırın


        Iterator itr =sayilar.iterator();

        System.out.println(itr.next());
        System.out.println(itr.next());
        System.out.println(itr.next());
        System.out.println(itr.next());
        System.out.println(itr.next());

        // tek tek yapmayıp loop ile yapalım


        // 5,23,2,9,11


        System.out.println(itr.hasNext()); // false


        // iterator da geri dönüş yok.
        // iterator nereye gittiyse orada kalır , geri dönemez
        // tum listeyi loop ile yeniden yazdırmak için yeniden bir itretor olusturmalıyız.
        // veya iteraro yeni deger atamalıyız.
        itr= sayilar.iterator();

        System.out.println(itr.hasNext()); // true
        while(itr.hasNext()){
            System.out.println(itr.next()+ " ");
        }

        // iterator kullanarak Listedeki 5'den buyuk sayıları silin

        itr = sayilar.iterator();

        while (itr.hasNext()){

            Integer sayi=(Integer) itr.next();
            if (sayi>5){
                itr.remove();
            }
        }
        System.out.println("");
        System.out.println(sayilar); // [5,2]





    }
}
