package day19_arrayListForEachLoop;

public class C03_ForEachLoop {
    /*
    Eğer çoklu element içeren bir yapıdaki tüm elementlere
    aynı işlemi yapmak istiyorsk index'ten bağımsız olarak for-each Loop kullanılabilir
     for-each loopta 3 şeyi belirtmemiz gerekir

     1-getirelecek elementlerin data türü
     2- getirilen elemente verilecek isim genelde "each" veya "w" kullanılır
     3-nereden getirileceği
     */



    // bu array'in tüm elementlerini yazdıralım

    public static void main(String[] args) {

        int[] arr={2,4,6,8,10};
        for (int each: arr
             ) {
            System.out.println(each+ " ");
        }

        // tum elementleri toplayalım
        int toplam=0;
        for (int each:arr
             ) {
            toplam+=each;

        }
        System.out.println("Sayiların toplamı "+ toplam);


        // tum sayıların karelerini toplayalım
        toplam=0;
        for (int each:arr
             ) {
            toplam+=each*each;
        }
        System.out.println("Elemanların karesinin toplamı : " + toplam);
    }
}
