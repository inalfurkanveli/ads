package sameQuestions;

import java.util.Scanner;

public class C09_soru23 {
    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);
        System.out.println("Lütfen Faktoriyelini hesaplaman istediginiz sayiyi giriniz.");
        int sayi=scanner.nextInt();

        System.out.println(faktoriyelHesabı(sayi));
    }
    public static int faktoriyelHesabı(int sayi){

        int faktoriyel=1;
        for (int i = sayi; i >0 ; i--) {
            faktoriyel*=i;

        }
        return faktoriyel;

        }


    }

