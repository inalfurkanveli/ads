package day22_immutableClasses;

import java.util.Arrays;

public class C02_MutableInmutable {
    public static void main(String[] args) {

        String str= "Java";

        System.out.println(str.toLowerCase()); // java

        str.toUpperCase();

        System.out.println(str);// Java

        // String inmutable oldugundan methodlar kalıcı değişiklik yapamaz


        int [] arr = {3,5,1,2};

        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));

        // Array mutable bir class oldugu için method ile yaptığımız degişiklikler kalıcı olur.


    }
}
