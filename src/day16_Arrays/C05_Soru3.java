package day16_Arrays;

public class C05_Soru3 {
    public static void main(String[] args) {
        // Verilen bir array’deki pozitif tamsayilari toplayip sonucu bize donduren bir
        //method yaziniz

   int [] sayilar={3,7,9,-3,-11,-50};

        System.out.println(arrayToplamaMethodu(sayilar));
    }



    public static int arrayToplamaMethodu(int [] arr){

        int toplam=0;

        for (int i = 0; i <arr.length ; i++) {
            if(arr[i]>0){
                toplam+=arr[i];
            }
        }

        return toplam;
    }
}
