package day19_arrayListForEachLoop;

public class C06_ForEachLoopÖrnek2 {
    public static void main(String[] args) {
        /*
        Soru 4- Kullanicidan bir cumle ve bir harf alin,
        harf cumlede kullanilmissa kac kere kullanildigini yazdirin, kullanilmadiysa “harf cumlede kullanilmamis” yazdirin
         */

        String cumle="Java ogrenmek çok guzel";
        String harf="a";

        String[] cumlearr=cumle.split("");
        int sayac=0;
        for (String each:cumlearr
             ) {
            if (each.equals(harf))
                sayac++;
        }
        if (sayac>0 ) System.out.println("Harf cümlede "+ sayac +" adet kullanılmıştır");
        else System.out.println("Harf cümlede kullanılmamıştır.");
    }
}
