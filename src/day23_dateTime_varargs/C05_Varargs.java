package day23_dateTime_varargs;

public abstract class C05_Varargs {

    public static void main(String[] args) {
        // verilen iki sayıyı toplayıp yazdıran bir method oluşturun

   topla(5,8)  ; // 13
   topla(5,7,8); // 20
        topla(3,2,1); // 6
        topla(2,5,6,7); // 20
    }

    private static void topla(int sayi1, int sayi2, int sayi3, int sayi4) {
        System.out.println("Dört sayının toplamı : "+ sayi1+sayi2+sayi3+sayi4);
    }

    private static void topla(int sayi1, int sayi2, int sayi3) {
        System.out.println("Uc sayının toplamı : " +sayi1+sayi2+sayi3);
    }

    private static void topla(int i, int i1) {
        System.out.println("İki sayının toplamı : " +i+i1);
    }


}
