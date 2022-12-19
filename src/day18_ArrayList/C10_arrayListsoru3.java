package day18_ArrayList;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class C10_arrayListsoru3 {
    public static void main(String[] args) {
        /*
        Soru 3- Verilen String bir listede istenmeyen harf iceren elementleri silip,
        kalan kismini list olarak bize donduren bir method olusturun
         */

        List<String> isimler=C09_arrayListSoru2.isimListesiOlusturma();

        System.out.println("İstenmeyen harfin oldugu isimler silindi \n Kalan isimler: " + elementSilme(isimler));

    }

    public static List<String> elementSilme(List<String> isimler){

        Scanner scanner=new Scanner(System.in);
        System.out.println("Lütfen içeren isimleri silmek için bir harf giriniz.");
        String istenmeyenHarf=scanner.next().substring(0,1);

        List<String> yeniListe=new ArrayList<>();
        for (int i = 0; i <isimler.size() ; i++) {


            if (!(isimler.get(i).contains(istenmeyenHarf))){
                yeniListe.add( isimler.get(i));
            }

        }
        return yeniListe;
    }
}
