package day21_staticKeyword;

public class C03_PassByValue {
    public static void main(String[] args) {

        int s=20;

        //int sayi=30;
        // String s = "Hasan";
        //  bir scope'da tenimlanan variable'in yeniden tanımlama imkani yoktur.
        // data turunun degistirerek yeniden tanımlamak da mumkun degildir.
        // cunku kullanirken variable'in ismini yazdığımızda hangi sayi variable'ini kullanacagi mechul olur.

        method1();
    }

    public static void method1(){
        method2(5);

        String s = "Hasan";
        System.out.println(s.toLowerCase()); // hasan

    }
    public  static void method2(int s){
        s=s*s;
        System.out.println(s);
    }

}
