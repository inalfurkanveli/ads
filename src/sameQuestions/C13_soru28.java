package sameQuestions;

import java.util.Scanner;

public class C13_soru28 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Lütfen bir sayı giriniz.");
        String girilenSayi=scanner.nextLine();

        for (int i = girilenSayi.length(); i >0 ; i--) {

            System.out.print(girilenSayi.charAt(i-1));

        }




    }
}
