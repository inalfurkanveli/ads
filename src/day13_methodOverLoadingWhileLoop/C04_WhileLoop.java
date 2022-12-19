package day13_methodOverLoadingWhileLoop;

public class C04_WhileLoop {
    public static void main(String[] args) {

      //  2 basamaklı sayılardan 7 ile bölünebilenleri yazdırın.

        for (int i = 10; i <100 ; i++) {
            if(i%7==0){
                System.out.print(i + " ");
            }

        }
        System.out.println("");

        // aynı soruyu while loop ile yapın

        int sayi=10;

        while (sayi<100){
            if ((sayi%7==0)){
                System.out.print(sayi + " ");
            }
            sayi++;
        }
        System.out.println("");

        // For Loop ile yapılabilecek bir soruyu illa da while loop ile yapmak biraz zahmetli.

    }
}
