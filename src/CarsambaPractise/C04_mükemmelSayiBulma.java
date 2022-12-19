package CarsambaPractise;

import java.util.Scanner;

public class C04_mükemmelSayiBulma {
    public static void main(String[] args) {
        /*
        Bir sayinin mükemmel olup olmadiğini bulan bir method yaziniz.
        Mükemmel sayi : bir sayinin kendisi hariç bölenlerinin toplamı, kendisine eşitse o sayi mükemmeldir.
        ORNEK:
        INPUT     : 6
        OUTPUT : 1,2,3
                      1+2+3 = 6 = 6 (Mükemmel)
         */

        Scanner scanner=new Scanner(System.in);
        System.out.println("Bir sayı giriniz ");
        int sayi=scanner.nextInt();


        if(mükemmelSayi(sayi)){
            System.out.println(sayi+" mükemmel sayidir.");
        }else {
            System.out.println(sayi+ " mükemmel sayi degildir.");
        }

    }


    public static boolean mükemmelSayi(int sayi) {

        int toplam=0;
        for (int i = 1; i <sayi ; i++) {
            if (sayi%i==0){
                toplam+=i;
            }
        }
        if(toplam==sayi){
            return true;
        }else {
            return false;
        }



    }
}

