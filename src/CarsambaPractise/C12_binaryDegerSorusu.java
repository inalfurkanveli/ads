package CarsambaPractise;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class C12_binaryDegerSorusu {
    /*
    //Girilen desimal değeri binary değere çeviren metodu oluşturunuz.
//Örnek: 12 = 1 1 0 0
     */
    public static void main(String[] args) {
        System.out.println("Binary degere çevirilcek decimal degeri giriniz.");
        Scanner scanner=new Scanner(System.in);
        int desimalSayi=scanner.nextInt();

        System.out.println(desimalSayi+" sayısının karşılığı "+ binaryCevir(desimalSayi));
    }

    private static List<Integer> binaryCevir(int desimalSayi) {
        List<Integer> binary=new ArrayList<>();

     while(desimalSayi>=1){
         binary.add(desimalSayi%2);
         desimalSayi/=2;
     }
       // Collections.reverse(binary);

        List<Integer> binaryTest= new ArrayList<>();
        for (int i = binary.size()-1; i >=0 ; i--) {
            binaryTest.add(binary.get(i));
        }
        return binaryTest;
    }

}
