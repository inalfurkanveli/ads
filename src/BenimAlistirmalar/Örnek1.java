package BenimAlistirmalar;

import java.util.Arrays;

public class Örnek1 {
    public static void main(String[] args) {
        /*
        Soru-28)
Kullanıcının girdiği sayıyı tersine çeviren bir program yazın.
Örnek:
      Sayı: 1238
      Sayının Tersi: 8321
İpucu:  Loop kullanabilirsiniz.
         */



        String sayi= "12345";


        // output: 54321

        for (int i = sayi.length(); i >0 ; i--) {
            System.out.print(sayi.charAt(i-1));

        }


    }
}
