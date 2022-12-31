package day13_methodOverLoadingWhileLoop;

public class C02_MethodOverLoading {
    public static void main(String[] args) {

        String str="Java cok guzel";

        System.out.println(str.substring(5)); // cok guzel
        System.out.println(str.substring(3, 5)); // a

        // Eğer seçtiğimiz isimde birden fazla method varsa buna overloading denir ve aynı isimdeki methodlardan
        // hangisinin çalışacağına argument/parametre uyumu karar verir.

        // Buna da over loading denir.


        toplama(5,6); //

        toplama(6,5,3); // 14

        /*
        Java aynı class içerisinde ayni isim ve ayni data turunden iki parametre sayisi ile 2 method
        oluşturmanıza izin vermez.

        1- ismini değiştirebiliriz , ancak bu durumda overloading olmaz.

        Overloading ayni isimde ama farkli isleve sahip methodlar olusturmak demektir.

        2-Parametre sayısını değistirebiliriz.

        3- ayni sayıda parametre yazıp parametrelerin data türünü değiştirebiliriz.
        veya farklı data türündeki parametrelerin yerini değiştirebiliriz.

         */
        toplama(5,9);// 2 tam sayının toplamı 14
        toplama(6.35,31);
        toplama(6,3,14);
        toplama(6,32.7);

    }




    public static void toplama(int sayi1,int sayi2){
        System.out.println("2 tam sayının toplamı "+(sayi1+sayi2));

    }

    public static void toplama(int a,int b,int c ){

        System.out.println("3 tam sayının toplamı : "+ (a+b+c));
    }
    public static void toplama(double sayi1,int sayi2){
        System.out.println("Double ve int toplamı : "+ (sayi1+sayi2));
    }

    public static void toplama(int sayi1,double sayi2){
        System.out.println("Integer ve double toplamı : "+(sayi1+sayi2));
    }
    public static void toplama(double sayi1, double sayi2){
        System.out.println("Ikı double sayı toplamı "+ (sayi1+sayi2));
    }
}
