package day35_genelTekrar;

import java.util.InputMismatchException;
import java.util.Scanner;

public class C01_printfCarpimTablosu {
    // kullanicindan bir rakam aliniz ve carpim tablosu olsuturun

    public static void main(String[] args) {

        Scanner scan= new Scanner(System.in);
        int girilenSayi=0;

        while (girilenSayi<=1 || girilenSayi>=10) {
            try {
                System.out.println("Carpim tablosu olusturmak icin rakam  giriniz" );
                girilenSayi= scan.nextInt();

                if (girilenSayi>1 && girilenSayi<10 ){
                    break;
                }
                System.out.println("Çarpım tablosu için 1'de büyük pozitif bir rakam girmelisiniz ");
            } catch (InputMismatchException e) {
                System.out.println("Çarpım tablosu için 1'de büyük pozitif bir rakam girmelisiniz ");
                scan.next();

            }

        }

        for (int i = 1; i <=girilenSayi ; i++) {
            for (int j = 1; j <=girilenSayi ; j++) {
                int carpim=i*j;
                System.out.printf("%2d  ",carpim);
            }
            System.out.println(" ");

        }






    }
}
