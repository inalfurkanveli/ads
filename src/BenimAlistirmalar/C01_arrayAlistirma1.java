package BenimAlistirmalar;

import java.util.Arrays;

public class C01_arrayAlistirma1 {
    public static void main(String[] args) {
        String[] arrayString={"Ali","Ayşe","fatma","furkan","gizem"};
        int[] arrayInt={5,6,7,3,6,8,9,0,2,23,4,55,44,31,14,524352345};

        Arrays.sort(arrayString);
        Arrays.sort(arrayInt);

        System.out.println(Arrays.toString(arrayString));
        System.out.println(Arrays.toString(arrayInt));


    }
}
