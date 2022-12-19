package sameQuestions;

import java.util.Scanner;

public class C05_soru19 {
    public static void main(String[] args) {
        /*
        Soru 19-)
Kullanıcıdan doğum tarihini alınız. Burcunu hesaplayan bir method yazınız.
ipucu:
Switch Case kullanabilirsiniz. Veya Method yazarak Method aracılıgı ile de yapabilirsiniz.

         */
        Scanner scanner=new Scanner(System.in);
        System.out.println("Lütfen gününüzü giriniz.");
        int gün=scanner.nextInt();
        System.out.println("Lütfen dogum ayınızı yazınız.");
        int ay=scanner.nextInt();

        burcHesaplama(gün,ay);
    }

    private static void burcHesaplama(int gun , int ay ) {

        if ((gun>=20 && ay==2) || (gun<=20 && ay==3))
            System.out.println("Burcunuz balık'tır");
        if ((gun>=21 && ay==1) || (gun<=19 && ay==2))
            System.out.println("Burcunuz kova'dır");
        if ((gun>=22 && ay==12) || (gun<=20 && ay==1))
            System.out.println("Burcunuz oglak'tır");
        if ((gun>=23 && ay==11) || (gun<=21 && ay==12))
            System.out.println("Burcunuz  yay'dır");
        if ((gun>=24 && ay==10) || (gun<=22 && ay==11))
            System.out.println("Burcunuz  Akrep'tir");
        if ((gun>=24 && ay==9) || (gun<=23 && ay==10))
            System.out.println("Burcunuz terazi'dir");
        if ((gun>=24 && ay==8) || (gun<=23 && ay==9))
            System.out.println("Burcunuz  Basak'tır");
        if ((gun>=23 && ay==7) || (gun<=23 && ay==8))
            System.out.println("Burcunuz Aslan'dır");
        if ((gun>=22 && ay==6) || (gun<=22 && ay==7))
            System.out.println("Burcunuz Yengec'dir");
        if ((gun>=21 && ay==5) || (gun<=21 && ay==6))
            System.out.println("burcunuz ikizler'dir");
        if ((gun>=21 && ay==4) || (gun<=20 && ay==5))
            System.out.println("burcunuz boga'dır");
        if ((gun>=21 && ay==3) || (gun<=20 && ay==4))
            System.out.println("Burcunuz koc'tur.");

    }
}
