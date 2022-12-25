package sameQuestions;

import java.util.Arrays;

public class C25_soru41 {
    public static void main(String[] args) {
        int[] arr1 ={1,2,3,4};
        int[] arr2 ={5,6};
        System.out.println("İlk Array:  "+ Arrays.toString(arr1));
        System.out.println("İkinci Array:  "+ Arrays.toString(arr2));

        arraylariBirlestir(arr1,arr2);

    }

    private static void arraylariBirlestir(int[] arr1, int[] arr2) {

        int arr3[]= new int[arr1.length+ arr2.length];

        for (int i = 0; i < arr1.length ; i++) {

            arr3[i] = arr1[i];
        }
            for (int j = 0; j < arr2.length ; j++) {
                arr3[arr1.length+j]=arr2[j];
            }
        System.out.println("İki Arrayin birleştirilmiş hali: " +Arrays.toString(arr3));
        }


    }

