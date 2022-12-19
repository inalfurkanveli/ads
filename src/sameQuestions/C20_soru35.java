package sameQuestions;

import java.util.Arrays;
import java.util.Scanner;

public class C20_soru35 {
    public static void main(String[] args) {
        /*
        	  /* 35-) Parametre olarak bir isim kabul eden ve ismi bir char Array dizisi olarak yazdıran bir method Return edin.
 --> toCharArray() yöntemini kullanmayın
 Örnek:
 String isim:    Yakup
 char arr[]:     [Y,a,k,u,p]
 İpucu: Bir method içerisinde Array oluşturun ve aldıgınız ismi methoda gönderin.
 Bu ismi parçalayarak, her bir harfi, Arraye yerleştirin*/


        String isim = "Furkan";
        char[] arr=charArr(isim);

        System.out.println(Arrays.toString(arr));

    }
    public static char[] charArr(String isim){

        char [] arr = new char[isim.length()];
        for (int i = 0; i < arr.length ; i++) {
            arr[i]=isim.charAt(i);

        }

    return arr;
    }

}
