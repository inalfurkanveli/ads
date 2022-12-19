package day13_methodOverLoadingWhileLoop;

public class C03_MethodOverLoading {
    public static void main(String[] args) {
        toplama(5.6,6.9);// 2 double sayinin toplamı

        toplama('a','b');  //

        // ilk olarak % 100 uyan parametreleri arar
        // %100 uyumlu method yoksa calısabilecek method var mı diye sorar
        // calısacak method birden fazla ise
        // en az casting  yaptıgını çalıştırır.

        toplama(8.4,6); // iki double sayının toplamı 14.4 dür.
    }


    public static void toplama(int sayi1,double sayi2){
        System.out.println("Integer ve double toplamı : "+(sayi1+sayi2));
    }
    public static void toplama(double sayi1, double sayi2){
        System.out.println("Ikı double sayı toplamı "+ (sayi1+sayi2));
    }
}
