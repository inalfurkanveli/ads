package sameQuestions;

import java.util.Arrays;

public class C18_soru33 {
    public static void main(String[] args) {
        /*
         Soru =33
        Array kullanarak String bir cümleyi Reverse eden (tersine çeviren) bir Java programı yazın (boşluklar ve özel karakterler dahil).
Örnek:
String str=''Kodlama harika.''
String arr[]: ".etaerg si gnidoC"
İpucu: Önce Split kullanarak Arraye çevirin ardından Loop kullanarak son karakterden başlayıp tersten yazdırın
         */

        String str="Kodlama harika.";

 String[] karakterler1 =(str.split(""));


        for (int i = 0; i <karakterler1.length ; i++) {
            karakterler1[(str.length()-1)-i]=str.substring(i,i+1);

        }
        System.out.println(Arrays.toString(karakterler1));


    }
}
