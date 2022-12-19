package day21_staticKeyword;

import java.util.Arrays;

public class C05_PassByValueCokluElement {
    public static void main(String[] args) {

        int[] arr ={3,6,9,1,7};

        // bir method olusturup arr yi methoda yolluyalım
        // method da array elementeleri üzerinde degisiklik ypaalım
        // array i yazdıralım


        elementleriDegistir(arr);
    }

    public static void elementleriDegistir(int[] b){

        b[0]=13;
        b[2]=19;

        System.out.println(Arrays.toString(b));

    }
}
