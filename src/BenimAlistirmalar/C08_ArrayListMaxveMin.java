package BenimAlistirmalar;

import java.util.ArrayList;

import java.util.List;
import java.util.Scanner;


public class C08_ArrayListMaxveMin {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Lütfen listeye eklemek istediginiz 5 sayıyı yazın. ");
        int sayi1 = scanner.nextInt();
        int sayi2 = scanner.nextInt();
        int sayi3 = scanner.nextInt();
        int sayi4 = scanner.nextInt();
        int sayi5 = scanner.nextInt();


        List<Integer> sayılar = new ArrayList<>();
        sayılar.add(sayi1);
        sayılar.add(sayi2);
        sayılar.add(sayi3);
        sayılar.add(sayi4);
        sayılar.add(sayi5);

        int enKücük = 0;
        int enBüyük= 0;


        for (int i = 0; i < sayılar.size(); i++) {

            if (sayılar.get(i) < sayi1)
                enKücük = sayılar.get(i);


        }

        for (int i = 0; i < sayılar.size(); i++) {

            if (sayılar.get(i) > sayi1)
                enBüyük = sayılar.get(i);


        }
        System.out.println(sayılar+ "Girdiginiz sayıların listesidir.");
        System.out.println(enBüyük+ " sayısı Listedeki en büyük sayıdır.");
        System.out.println(enKücük+ " sayısı listedeki en kücük sayıdır.");

    }
}
