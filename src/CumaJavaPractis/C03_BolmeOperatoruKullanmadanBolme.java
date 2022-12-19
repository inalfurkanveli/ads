package CumaJavaPractis;

import java.util.Scanner;

public class C03_BolmeOperatoruKullanmadanBolme {
    // Kullanicidan bolunen ve bolen seklinde 2 sayi alalim ve bolme operatoru
// kullanmadan bolme islemini gerceklestirip bolumu hesaplayan method create ediniz.
    public static void main(String[] args) {


        Scanner scanner=new Scanner(System.in);
        System.out.println("Lütfen bolmek istediginiz sayıyı girin.");
        int bolunen=scanner.nextInt();
        System.out.println("Lütfen kaca bolmek istediginiz girin");
        int bolen=scanner.nextInt();


        System.out.println(bolmeMethod(56, 9));


    }

    public static int bolmeMethod(int bolunen, int bolen){

        int bolum=0;
        while(bolunen>=bolen){

            bolunen-=bolum;


            bolum++;
        }

    return bolum;
    }



}
