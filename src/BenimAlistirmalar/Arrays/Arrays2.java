package BenimAlistirmalar.Arrays;

public class Arrays2 {

    /*
    Verilen bir array’deki pozitif tamsayilari toplayip sonucu bize donduren bir
method yaziniz
     */

    public static void main(String[] args) {

        int [] arr={1,2,-43,-5,2,-76,87};

        int toplam=0;

        for (int i = 0; i < arr.length ; i++) {
        if (arr[i]>0){
            toplam+=arr[i];
        }


        }
        System.out.println(toplam);
    }
}
