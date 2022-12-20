package BenimAlistirmalar;

import java.util.Scanner;

public class Örnek2 {
    public static void main(String[] args) {
        /*
        1'den 100'e kadar olan doğal sayıların toplamını bulmak için bir Program yazın.
İpucu: Loop kulanabilirsiniz
         */
        Scanner scanner=new Scanner(System.in);
        System.out.println("Toplamın son bulmasını istediginiz sayıyı giriniz . ");
        int sonSayı=scanner.nextInt();



        int toplam=(sonSayı*(sonSayı+1))/2;

        System.out.println(toplam);

      /*
        for (int i = 1; i <=sonSayı ; i++) {
            toplam +=i;
        }
        System.out.println("1'den "+sonSayı +" a kadar olan sayıların toplamı : "+ toplam); // 498501

       */



    }
}
