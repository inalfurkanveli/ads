package sameQuestions;

import java.util.Arrays;
import java.util.Scanner;

public class C21_soru36 {
    public static void main(String[] args) {
        /*
        Verilen bir Array dizisindeki ortadaki degeri döndüren bir kod/method yazın. ( Yapabilirseniz Dinamik kod yazmaya çalışın, Arrayin uzunlugu degişse de ortadaki elemanı getirsin)
        Örnek:
        inputarr[]=   {1,2,3,4,5,6,7}
        output:         4
İpucu:  Arrayin indexini hesaplayarak bulabilirsiniz. Kendinizi geliştirme adına sorunun cevabını degişik yollardan yapabilir, Arrayi kullanıcıya oluşturabilirsiniz (Öneri..)
         */

        Scanner scanner= new Scanner(System.in);

        System.out.println("Lütfen array'in uzunlugunu giriniz. ");
        int arrUzunluk=scanner.nextInt();



        int arr[]=new int[arrUzunluk];

        for (int i = 0; i <arr.length ; i++) {
            System.out.println("Lütfen array'in elementlerini giriniz.");
            int girilen=scanner.nextInt();
            arr[i]=girilen;

        }
        int orta=0;

        if (!(arr.length%2==0)) {
            orta = arr[(arr.length / 2) ];
        }
        System.out.println(orta);

        System.out.println(Arrays.toString(arr));

    }
}
