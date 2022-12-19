package day16_Arrays;

import java.util.Arrays;

public class C02_ArraysII {
    public static void main(String[] args) {
        // verilen bir string array'in tüm elemenetlerini yazdırın.

        String[] isimler={"yusuf","mehmet","hüseyin","akile","said"}; //

        System.out.println(Arrays.toString(isimler)); // [yusuf, mehmet, hüseyin, akile, said]

        for (int i = 0; i < isimler.length ; i++) {
            System.out.print(isimler[i] +" ");

        }
    }
}
