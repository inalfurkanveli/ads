package day16_Arrays;

import java.util.Arrays;

public class C04_Soru2 {
    public static void main(String[] args) {
        // verilen bir string array'de istenen bir harfi içeren kelimeleri silip  yerine null yazdırın

        String[] isimler={"yusuf","mehmet","hüseyin","akile","said"};

        String silinecekHarf="u";

        for (int i = 0; i < isimler.length ; i++) {
            if(isimler[i].contains(silinecekHarf)){
                isimler[i]=null;
            }
        }
        System.out.println(Arrays.toString(isimler)); // [null, mehmet, hüseyin, akile, said]
    }
}
