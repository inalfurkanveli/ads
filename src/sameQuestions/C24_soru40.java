package sameQuestions;

public class C24_soru40 {
    public static void main(String[] args) {

        int[] arr= {1,2,3,4,5,6,7,8};

        arrayinElemanlarınıToplama(arr);
    }

    private static void arrayinElemanlarınıToplama(int[] array) {

         int  toplam=0;
        for (int i = 0; i < array.length ; i++) {
            toplam+= array[i];
        }
        System.out.println("Arrayin elemanlarının toplamı : "+ toplam+ " dır.");


    }
}
