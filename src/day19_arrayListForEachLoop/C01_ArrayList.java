package day19_arrayListForEachLoop;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class C01_ArrayList {
    public static void main(String[] args) {
        /*
        Soru 6- Kullanicidan pozitif bir tamsayi alip, o tamsayiyi tam bolebilen
        tum pozitif tamsayilari bir liste olarak bize donduren bir method olusturun.
         */

        Scanner scanner=new Scanner(System.in);
        System.out.println("Lütfen tam bölenlerini listelemek için pozitif bir tam sayı girin: ");
        int sayi= scanner.nextInt();

        if (sayi<=0) System.out.println("Bu sayı negatif veya sıfıra eşit olamaz.");
        else  {
            List<Integer> tamBolenlerListesi= tamBolenlerListesiOlustur(sayi);

            System.out.println(tamBolenlerListesi);
        }

    }

    public static List<Integer> tamBolenlerListesiOlustur(int sayi){
       List<Integer> tamBolenlerListesi = new ArrayList<>();

        for (int i = 1; i <=sayi ; i++) {
            if (sayi%i==0)
            tamBolenlerListesi.add(i);
        }

    return tamBolenlerListesi;
    }

}
