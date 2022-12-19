package sameQuestions;

import java.util.Arrays;
import java.util.Scanner;

public class C16_soru31 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Lütfen Arrayin uzunluğunu giriniz: ");
        int arrayUzunluk=scanner.nextInt();

        int [] arr = new int[arrayUzunluk];

        for (int i = 0; i <arr.length ; i++) {

            System.out.println("Lütfen arrayin elemanlarını giriniz: ");
            int girilen = scanner.nextInt();
            arr[i]=girilen;
            if (arr[i]==arrayUzunluk)
                break;
        }
        System.out.println(Arrays.toString(arr));

    }
}
