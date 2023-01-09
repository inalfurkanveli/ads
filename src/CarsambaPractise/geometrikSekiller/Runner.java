package CarsambaPractise.geometrikSekiller;

import day24_StringBuilder.D;

import java.util.Scanner;

public class Runner {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.print("============= İŞLEMLER =============\n" +
                "\t\t 1-KARE\n" +
                "\t\t 2-DİKDÖRTGEN\n" +
                "\t\t 3-DAİRE\n"+
                "\tSEÇİMİNİZ:");

        int secim=scan.nextInt();
        switch (secim){
            case 1:{
                Kare kare=new Kare();
                kare.alan();
                kare.cevre();
                break;
            }
            case 2:{
                Dikdörtgen dikdörtgen=new Dikdörtgen();
                dikdörtgen.alan();
                dikdörtgen.cevre();
                break;

            }
            case 3:{
                Daire daire = new Daire();
                daire.alan();
                daire.cevre();
            }

        }


    }
}
