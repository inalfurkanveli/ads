package sameQuestions;

import java.util.Locale;
import java.util.Scanner;

public class C02_testClass {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);

        Scanner scan=new Scanner(System.in);
        System.out.println(" Lutfen kilonuzu giriniz: kg");
        double agirlik= scan.nextDouble();
        System.out.println(" Lutfen boyunuzu giriniz: m");
        double boy= scan.nextDouble();

        double vki=agirlik/(boy*boy);
        System.out.println("Vucut kitle Endeksiniz: "+vki+ " 'dir");

        if (vki>=30){
            System.out.println("Obezsiniz");
        } else if (25<=vki && vki<30) {
            System.out.println("Sismansiniz");

        }
        else if (18.5<=vki && vki<25) {
            System.out.println("Kilonuz idealdir");
        }
        else if (vki<18.5) {
            System.out.println("Zayifsiniz");
        }




    }
}
