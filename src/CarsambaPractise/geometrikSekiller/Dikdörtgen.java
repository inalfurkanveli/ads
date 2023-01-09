package CarsambaPractise.geometrikSekiller;

import java.util.Scanner;

public class Dikdörtgen implements Islemler{
    Scanner scan=new Scanner(System.in);
    int kenar1=0;
    int kenar2=0;
    @Override
    public void alan() {

        System.out.println("1.kenar uzunlugunu giriniz: ");
        kenar1= scan.nextInt();
        System.out.println("2.kenar uzunlugunu giriniz: ");
        kenar2= scan.nextInt();

        System.out.println("Alan : "+ (kenar1*kenar2));


    }

    @Override
    public void cevre() {
        System.out.println("Çevre : "+ (2*(kenar1+kenar2)));

    }
}
