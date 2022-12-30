package CumaJavaPractis;

import java.util.Random;
import java.util.Scanner;

public class C09_TasKagitMakas {

    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        Random random=new Random();

        int userChoise=0;
        int compChoise=0;
        int user=0;
        int comp=0;

        do {
            // kullanicinin secimini alıyoruz
            System.out.println("Asagidakilerden birini seciniz \n"+
                    "1-Tas\n" +
                    "2-Kagit\n" +
                    "3-Makas");

            userChoise=scan.nextInt();

            // bilgisarayin secimini aliyoruz

            compChoise=random.nextInt(3)+1;

            switch (compChoise) {
                case 1 -> System.out.println("*****Bilgisaray = Tas*****");
                case 2 -> System.out.println("*****Bilgisaray= Kagit*****");
                case 3 -> System.out.println("*****Bilgisaray= Makas*****");
            }

            // Karşılastirmasi ve puanlamasi

            if (userChoise ==1 && compChoise==2){
                System.out.println("Kagit kazandi. Bilgisaray +1");
                comp++;
                System.out.println("Oyuncu = "+ user + "Bilgisaray = "+ comp);
            }
            else if (userChoise==1 && compChoise==3){
                System.out.println("Tas Kazandi. Oyuncu +1");
                user++;
                System.out.println("Oyuncu = "+ user + "Bilgisaray = "+ comp);
            }else if (userChoise==2 && compChoise==1){
                System.out.println("Kagit Kazandi. Oyuncu +1");
                user++;
                System.out.println("Oyuncu = "+ user + "Bilgisaray = "+ comp);
            }else if (userChoise==2 && compChoise==3){
                System.out.println("Makas Kazandi. Bilgisaray +1");
                comp++;
                System.out.println("Oyuncu = "+ user + "Bilgisaray = "+ comp);
            }
            else if (userChoise==3 && compChoise==1){
                System.out.println("Tas Kazandi. Bigisaray +1");
                comp++;
                System.out.println("Oyuncu = "+ user + "Bilgisaray = "+ comp);
            }else if (userChoise==3 && compChoise==2){
                System.out.println("Makas Kazandi. Oyuncu +1");
                user++;
                System.out.println("Oyuncu = "+ user + "Bilgisaray = "+ comp);
            }else {
                System.out.println("Berabere!");

                System.out.println("Oyuncu = "+ user + "Bilgisaray = "+ comp);
            }
              }while(user!=5 && comp!=5 );{
                  // Kazanani gosterelim

            if (user>comp){
                System.out.println("Oyuncu kazandı. Tebrikler!!!");
            }else {
                System.out.println("Bilgisaray Kazandı.Tekrar Deneyiniz.");
            }

        }



    }
}
