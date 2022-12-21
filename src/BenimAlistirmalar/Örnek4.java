package BenimAlistirmalar;

import java.util.Scanner;

public class Örnek4 {
    public static void main(String[] args) {
        /*
        n'nin kullanıcı tarafından girildiği aşağıdaki serilerin toplamını hesaplayan bir program yazınız.
        1 + 1/2 + 1/3 + 1/4 + 1/5 +1/…………1/n
         2     3    4     5      6

         */

        Scanner scanner=new Scanner(System.in);
        System.out.println("Lütfen Son rakamı giriniz. ");
        int sonSayı = scanner.nextInt();

        int toplam = 0;

        for (int i = 1; i <=sonSayı ; i++) {
            toplam += i+1;
        }
        System.out.println("Toplam : " +toplam);



    }
}
