package day32_Sets_Maps;

import java.util.HashSet;
import java.util.Random;
import java.util.Set;
import java.util.TreeSet;

public class C02_HashSet_TreeSet {
    public static void main(String[] args) {
        // Bir HashSet ve bir treeSet olusturun
        // bir loop ile içlerine rastgele 100bin sayı ekleyin
        // işlem sürelerini karşılaştırın

        Random rnd = new Random();

        int sayi;
        Set<Integer> hashSet= new HashSet<>();
        Set<Integer> treeSet= new TreeSet<>();

        Long hashBaslangic=System.currentTimeMillis();
        for (int i = 0; i <100000 ; i++) {
            sayi=rnd.nextInt(1000000);
            hashSet.add(sayi);
        }
        Long hashBitis=System.currentTimeMillis();

        Long treeBaslangıc=System.currentTimeMillis();
        for (int i = 0; i <100000 ; i++) {
            sayi= rnd.nextInt(1000000);
            treeSet.add(sayi);
        }
        Long treeBitis=System.currentTimeMillis();

        System.out.println("Hash süre  :" +(hashBitis-hashBaslangic));
        System.out.println("Tree süre : "+(treeBitis-treeBaslangıc));
    }
}
