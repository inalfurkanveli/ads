package day18_ArrayList;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class C11_arrayListsoru4 {
    public static void main(String[] args) {
        /*
        Soru 4- Verilen pozitif bir n tamsayisini alarak,
        bize ilk n tane tane Fibonacci sayisini bir list olarak donduren bir method olusturun.
         */

        System.out.println(fibonacciListesiOlustur());
    }

    public static List<Integer> fibonacciListesiOlustur(){

        List<Integer> fibonacciList = new ArrayList<>();
        Scanner scanner=new Scanner(System.in);
        System.out.println("Lütfen kaç tane sayisi istediginizi giriniz.");
        int n =scanner.nextInt();
        //0,1,1,2,3,5,8,13,21,34,55...

        if(n<1){
            System.out.println("Gecersiz Sayı");
            return null;
        } else if (n==1) {
            fibonacciList.add(0);
            return fibonacciList;

        } else if (n==2) {
            fibonacciList.add(0);
            fibonacciList.add(1);
            return fibonacciList;
        }else {
            int sayi1=0;
            int sayi2=1;
            int sayi3=1;

            fibonacciList.add(sayi1);
            fibonacciList.add(sayi2);


            do {
                fibonacciList.add(sayi3);
                sayi1=sayi2;
                sayi2=sayi3;
                sayi3=sayi1+sayi2;



            }while (fibonacciList.size()<n);


            return fibonacciList;
        }

    }


}
