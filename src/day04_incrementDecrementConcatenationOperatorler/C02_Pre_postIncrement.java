package day04_incrementDecrementConcatenationOperatorler;

public class C02_Pre_postIncrement {

    public static void main(String[] args) {

        int sayi=20;

        sayi +=3;

        sayi=sayi+3;

        sayi++;
        sayi++;
        sayi++;

        System.out.println(sayi); //29

        sayi -=2;
        sayi=sayi-2;
        sayi--;
        sayi--;

        System.out.println(sayi); //23

        sayi=10;
        //sayinin değerini 1 azaltın ve yazdırın

        sayi--;
        System.out.println(sayi);//9


        sayi=10;
        System.out.println(sayi);

        sayi--;

        sayi=10;
        System.out.println(sayi++);

        //Javc aynı satırda iki işlem oldugundan sıralama yapar
        // eğer ++ veriable'dan sonra is artırma işlemini sonra yapar.
        // bu durumda önce yazdırma sonra arıtrma işlemi yapar.


        sayi=10;
        System.out.println(++sayi);
        // ++ veriable'dan önce ise artırma işlemini önce yapar
        // bu durumda java çnce artırma sonra yazdırma işlemi yapar.






    }

}
