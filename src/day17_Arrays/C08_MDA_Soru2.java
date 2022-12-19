package day17_Arrays;

import java.util.Arrays;

public class C08_MDA_Soru2 {
    public static void main(String[] args) {
        /*
        - Verilen 2 katli bir array’de ayni index’e sahip elementleri toplayip, yeni
olusturacagimiz tek katli bir array’e bu toplamlari atayin.
input : int[][] arr = {{3,4,5}, {2,3,6,7}};
output: [5, 7, 11
         */

        int[][] arr = {{3,4,5}, {2,3,6,7}, {5,3,}};


        // dinamik hale getirebilmek için önce inner array'lerden en kısa olanı bulmamız gerekir.


        int enKisaInnerArrayLength= arr[0].length;

        for (int i = 0; i <arr.length ; i++) {

            if(arr[i].length<enKisaInnerArrayLength){
                enKisaInnerArrayLength=arr[i].length;



            }

        }

        // aynı indexteki elementleri topladıgımızda koyacagımız tek katlı bir array olusturalım

        int[] toplamlar=new int[enKisaInnerArrayLength];

        int toplam=0;
        for (int i = 0; i < toplamlar.length ; i++) {
            for (int j = 0; j <arr.length ; j++) {
                toplam+=arr[j][i];
            }
                toplamlar[i]=toplam;
            toplam=0;
            }

        System.out.println(Arrays.toString(toplamlar));
    }







    }

