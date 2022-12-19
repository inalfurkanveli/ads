package BenimAlistirmalar;

public class C04_arrayAlistirma4 {
    public static void main(String[] args) {
        int[] arr1={1,23,4,5,6,666,32,545,7676,2134};
        int toplam=0;
        int ortalama=0;
        for (int i = 0; i < arr1.length ; i++) {
            toplam+=arr1[i];

            ortalama=toplam/arr1.length;


        }
        System.out.println("Dizideki elemanların ortalama değeri: " + ortalama);
    }
}
