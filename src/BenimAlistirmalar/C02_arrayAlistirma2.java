package BenimAlistirmalar;

import java.util.Arrays;

public class C02_arrayAlistirma2 {
    public static void main(String[] args) {
        int[] array={1,3,6,2,8,20,27,18,2002,1997};


         int toplam=0;
        for (int i = 0; i < array.length ; i++)

            toplam+=array[i];
        System.out.println("Dizide ki elementlerin toplamı :  "+ toplam);
    }
}
