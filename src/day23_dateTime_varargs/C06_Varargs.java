package day23_dateTime_varargs;

public class C06_Varargs {
    public static void main(String[] args) {

        // oyle bir method olusturayım ki
        // kac tane argument yazarsam yazayım
        // argumentlerin toplamını yazsın

        topla(5,6); // 11
        topla(3,4,5,6,7,1,2,3); // 31

        /*
        Varargs array alt yapısını kullanır
        Temel hedef argument sayısı değişse bile
        aynı data turundeki tum argumentleri alabilecek bir parametre olusturmaktır.
         */
    }

    private static void topla(int... sayılar) {
        int toplam1=0;
        for (int i = 0; i < sayılar.length ; i++) {
            toplam1 += sayılar[i];
        }
        System.out.println(toplam1);

        int toplam2=0;
        for (Integer each:sayılar
             ) {
            toplam2+=each;

        }
        System.out.println(toplam2);
    }
}
