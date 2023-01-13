package day34_Maps_NestedMaps;

import java.util.Map;
import java.util.TreeMap;

public class C04_Compute {

    public static void main(String[] args) {

        // verilen bir int arry'de her bir sayının kaçar defa kullanıldıgını yazdırın
        // int [] arr = {2,3,4,5,1,2,3,4,5,6,1,2}
        // output= 1= 3 , 2=3, 3=2, 4=2

        // verilen bir int array'de her bir sayinin kacar defa kullanildigini yazdirin
// Ornek : String[] arr = {"A","C","B","N","A","N","A"}
// Output : A=3, B=1, C=1, N=2,

        // 1- yöntem
        String[] arr = {"A","C","B","N","A","N","A"};
        Map<String,Integer> harfSayilari = new TreeMap<>();

        for (int i = 0; i <arr.length ; i++) {
            if(!harfSayilari.containsKey(arr[i])){
                harfSayilari.put(arr[i],1);
            }else {
                Integer eskiKullanimMiktari = harfSayilari.get(arr[i]);
                harfSayilari.put(arr[i],eskiKullanimMiktari+1 );
            }

        }
        System.out.println(harfSayilari); // {A=3, B=1, C=1, N=2}

        // 2.yöntem Compute

        Map<String,Integer> harfSayilari2 = new TreeMap<>();
        for (int i = 0; i < arr.length ; i++) {
            harfSayilari2.computeIfPresent(arr[i], (k,v)-> v+1);
            harfSayilari2.computeIfAbsent(arr[i] ,v ->1 );


            System.out.println(harfSayilari2);


        }
    }
}
