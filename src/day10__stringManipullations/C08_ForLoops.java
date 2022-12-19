package day10__stringManipullations;

public class C08_ForLoops {
    public static void main(String[] args) {

        int tumSayilarinToplami=0;


        for (int i = 1; i <1000 ; i++) {
            System.out.println(i+" ");
            tumSayilarinToplami+=i;
        }

        System.out.println("Tum sayilarin toplami = "+ tumSayilarinToplami);
    }
}
