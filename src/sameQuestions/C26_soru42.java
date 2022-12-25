package sameQuestions;

public class C26_soru42 {
    public static void main(String[] args) {



        varargsMethodu(9,8,5,4,32,13,1,12);
    }

    private static void varargsMethodu(int ...hepsinitopla) {
        int toplam=0;

        for (Integer each:hepsinitopla
             ) {
            toplam+=each;
        }

        System.out.println("Verilen sayıların toplamı : "+ toplam +" dır.");
    }
}
