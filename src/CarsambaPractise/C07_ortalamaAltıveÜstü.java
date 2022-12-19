package CarsambaPractise;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class C07_ortalamaAltıveÜstü {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Lütfen dizinin büyüklüğünü belirleyiniz.");
        int uzunluk= scanner.nextInt();

        arrayOlustur(uzunluk);

    }

    private static void arrayOlustur(int uzunluk) {
        int[] arr= new int[uzunluk];
        Random random=new Random();
        int toplam=0;
        for (int i = 0; i < arr.length ; i++) {
            arr[i]=random.nextInt(100);
            toplam+=arr[i];

        }
        double ortalama=toplam/arr.length;
        int alt = 0,üst=0,esit=0;
        for (int i = 0; i <arr.length ; i++) {
            if (arr[i]<ortalama){
                alt++;
            } else if (arr[i]>üst) {
                üst++;
            }else {
                esit++;
            }
        }
        System.out.println(Arrays.toString(arr));
        System.out.println("Ortalama :   \n"+ ortalama +"\n"
                + alt+ " adet sayı ortalamadan düşük \n"+
                üst+"adet sayı ortlamadan yüksek \n "+
                esit+ "adet sayı ortalamayla esit ");



    }


}
