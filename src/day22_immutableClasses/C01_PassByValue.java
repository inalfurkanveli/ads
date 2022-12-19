package day22_immutableClasses;

import java.util.ArrayList;
import java.util.List;

public class C01_PassByValue {
    public static void main(String[] args) {
         /*
         Verilen bir list'de degisiklik yaparn 2 method olusturun
         1.method listin elementlerini yeni deger atayıp yazdırsın
         2.method List'e yeni bir List degeri atayıp , yeni List'e elementleri ekleyip yazdırsın
         her iki method'u cagırdıktan sonra main method'daki List'i yazdıralım
          */
        List<Integer> sayilar=new ArrayList<>();
        sayilar.add(10);
        sayilar.add(34);
        sayilar.add(45);

        System.out.println(sayilar); // 10,34,45

        elemanlariDegistir(sayilar);

        System.out.println("1.method call'dan sonra sayılar : "+ sayilar); // [25,54,67]

        yeniListAta(sayilar);

        System.out.println("2.method call'dan sonra sayılar : "+ sayilar); // [98,15,64]

        /*
        Java PassByValue Kullanır

        PassByValue, method'a gönderilern variable'in kendisini degil , degerini gondermek demektir.
        primitive data turleri veya string gonderdigimizde , method'da yapilan degisiklik method'da kalır .
        main method'da atama yapılmadıkça main method'daki variable'in degeri degismez.

        PassByValue çoklu element içeren array ve list gibi yapılar için de geçerlidir
         Ancak çoklu elementi value olarak method'a gönderemediğinden
          array veya List'in adresini gönderir.
         Eğer method'da elementlere atama yapılırsa,main method'da ki elementler de degismis olur.
         Eğer list veya array'e yeni bir list veya array degeri atanır bu atama o method'da kalır.
         main method'da ki list veya array degismez.
         */



    }

    public static void elemanlariDegistir(List<Integer> sayilar){
        sayilar.set(0,25);
        sayilar.set(1,54);
        sayilar.set(2,67);
        System.out.println("elemanlari degistir memthodunda list : " +sayilar);
    }

    public static  void yeniListAta(List<Integer> sayilar){
        sayilar=new ArrayList<>();
        sayilar.add(98);
        sayilar.add(15);
        sayilar.add(64);

    }
}
