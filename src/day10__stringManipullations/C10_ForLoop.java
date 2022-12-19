package day10__stringManipullations;

public class C10_ForLoop {
    public static void main(String[] args) {
        /*
        input olarak verilen sayidan baslayarak 7ser 7ser artırarak input verilen bitise kadar
        tüm sayıları
        kaç adet sayı olduğunu
        ve toplamının kaç olduğunu yazdırın.
         */
        int inputBas=34;
        int inputBit=563;

        int sayiAdet=0;
        int sayiToplami=0;

        for (int i = inputBas; i <=inputBit ; i+=7) {
            System.out.println(i+ " ");
            sayiAdet++;
            sayiToplami+=i;
        }
        System.out.println(sayiAdet+ "verilen aralıktaki sayi adedi.");
        System.out.println(sayiToplami+ "verilen araliktaki sayiların toplamı");
    }
}
