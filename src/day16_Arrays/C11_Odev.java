package day16_Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class C11_Odev {
    public static void main(String[] args) {


        // Kullanıcıdan yeni isimler alip var olan bir array'e ekleyen bir method olusturun.
        // Kullanıcı yeni deger verdigi müddetce c10'daki methodu kullanarak eklemeye devam edin
        // kullanıcı q 'ya bastıgında array'in son halini döndürün.

        Scanner scan = new Scanner(System.in);
        String YeniIsim = "";
        String[] isimler = {"Neymar", "Ronaldo", "Messi"};
        String dur = "Q";
        while (!YeniIsim.equals(dur)) {
            System.out.println("Lutfen isim giriniz");
            YeniIsim = scan.nextLine();
            isimler = C10_ArrayeBirElementEkleme.arrayeEkleme(isimler, YeniIsim);


        }
        System.out.println(Arrays.toString(isimler));
    }
}

