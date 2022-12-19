package CarsambaPractise;

import java.util.Arrays;

public class C09_MountionArraySorusu {
    /*
     MOUNTAIN ARRAY SORUSU : *Verilen herhangi bir arrayin Mountain Array olup olmadıgını kontrol etmek için bir kod yazınız.
Not:
Mountain Array ==> [0, 2, 5, 3, 1]
Bir array elemanları en büyük degerine kadar sürekli artan, en büyük degerinden sonra sürekli azalan deger alıyorsa Mountain Array' dir.
Mountain Array Degil ==> [5, 2, 7, 1, 4]
Bir array elemanları en büyük degerine kadar sürekli azalan, en büyük degerinden sonra sürekli artan deger alıyorsa Mounta!n Array degildir
    */
    public static void main(String[] args) {
        int[] arr1={0, 2, 5, 3, 1};
        int[] arr2={5, 2, 7, 1, 4};

        mountainArray(arr1);
        mountainArray(arr2);


    }

    private static void mountainArray(int[] arr) {

        int enBüyük=0;
        int enBüyükIndex=0;

        for (int i = 0; i < arr.length ; i++) {
            if (arr[i]>enBüyük){
                enBüyük=arr[i];
                enBüyükIndex=i;
            }
        }
        boolean kontrol=true;

        for (int i =enBüyükIndex; i < arr.length-1 ; i++) { // 5,3,1
            if (arr[i]>arr[i+1]){
                continue;
            }else {
                kontrol=false;
                break;
            }
        }
        if (kontrol){
            for (int i = enBüyükIndex; i > 0 ; i--) { // 0,2,5
                if (arr[i]>arr[i-1]){
                    continue;
                }else {
                    kontrol=false;
                    break;
                }
            }

        }


        if (kontrol){
            System.out.println(Arrays.toString(arr)+ "arrayi montain arraydir");
        }else {
            System.out.println(Arrays.toString(arr)+ "arrayi montain array degildir.");
        }





    }
}
