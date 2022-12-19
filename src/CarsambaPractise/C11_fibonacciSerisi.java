package CarsambaPractise;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class C11_fibonacciSerisi {
    public static void main(String[] args) {
        /*
         * Kullanıcıdan alınan bir tamsayıya kadar FIBONACCI dizisi oluşturun.
         * 1-1-2-3-5-8-13-21-34....
         */

        Scanner scanner=new Scanner(System.in);
        System.out.println("Lütfen fibonacci serisinin uzunluğunu giriniz.");
        int fibonacciUzunluk= scanner.nextInt();

        List<Integer> fibonacci= new ArrayList<>();
        fibonacci.add(1);
        fibonacci.add(1);
        int toplam=0;
        for (int i = 2; i <fibonacciUzunluk ; i++) {
            toplam =( fibonacci.get(fibonacci.size()-2)+(fibonacci.get(fibonacci.size()-1)));
            fibonacci.add(toplam);
        }
        System.out.println(fibonacci);
    }
}
