package sameQuestions;

import java.util.Arrays;
import java.util.Scanner;

public class C17_soru32 {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);

        System.out.println("Lütfen Arrayin uzunlugunu giriniz : ");
        int uzunluk=scanner.nextInt();

        int[] arrReverse=new int[uzunluk];
        System.out.println("Lütfen elementleri giriniz.");

        for (int i = 0; i <arrReverse.length ; i++) {
            int element=scanner.nextInt();

            arrReverse[(uzunluk-i)-1]=element;
        }
        System.out.println(Arrays.toString(arrReverse));



    }
}
