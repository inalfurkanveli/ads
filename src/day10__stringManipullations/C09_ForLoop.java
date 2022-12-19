package day10__stringManipullations;

import java.util.Scanner;

public class C09_ForLoop {
    public static void main(String[] args) {
        // kullanıcıdan baslangic ve biits değerlerini alıp
        // bu sınırlar dahil olarak bu sayilar arasinda 5in kati olan sayiları yazdırın.

        Scanner scan=new Scanner(System.in);
        System.out.println("Bir Baslangic degeri giriniz");
        int baslangic= scan.nextInt();
        System.out.println("Bitis degerini giriniz");
        int bitis= scan.nextInt();


        for (int i = baslangic; i <=bitis ; i++) {
            if(i%5==0){
                System.out.println(i+" ");
            }

        }
    }
}
