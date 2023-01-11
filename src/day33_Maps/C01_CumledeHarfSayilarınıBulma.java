package day33_Maps;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class C01_CumledeHarfSayilarınıBulma {
    public static void main(String[] args) {
        // verilen bir cümlede kullanılan her bir harfi
        // ve kacar kez kullanildigini yazdirin

        // Ornek : Java candir.


        String cumle="Java candir";

        // oncelikle boslugu  ve noktolama işaretlerini yok edelim

        cumle=cumle.replaceAll("\\W",""); // Javacandir

        String [] cumleArr= cumle.split("");
        System.out.println(Arrays.toString(cumleArr)); // [J, a, v, a, c, a, n, d, i, r]

        Map<String,Integer> harfTekrarMap=new HashMap<>();

        for (int i = 0; i <cumleArr.length ; i++) {
            // her bir elementi ele alıp
            // map'te key olarak yoksa value =1 olarak ekleriz.
            // map'de key olarak varsa value 1 artılırmalidir.
            if (!harfTekrarMap.containsKey(cumleArr[i])){
                harfTekrarMap.put(cumleArr[i],1);
            }else {
                int eskiValue=harfTekrarMap.get(cumleArr[i]);
                harfTekrarMap.put(cumleArr[i],eskiValue+1);

            }
        }
        System.out.println(harfTekrarMap);
        // {a=3, r=1, c=1, d=1, v=1, i=1, J=1, n=1}
    }
}
