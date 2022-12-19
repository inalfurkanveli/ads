package day15_scope_arrays;

public class C03_BaskaClassaErisme {
    public static void main(String[] args) {
        /*
        JAva  oop concept cercevesinde baska classlar'daki class uyelerini (veriable/method) kullanabiliriz.
        Baska class'dai herhangi bir class uyersine erismek istedigimizde
        static keyword onemli bir rol oynar.

        Static olarak isaretlenen class uyelerine
        ClassIsmi.staticUyeIsmi seklinde ulasilabilir .

        instance olan class level veriable'lara  ulasabilmek için obje olursturmak gerekir .

        Java Run time program'dir.
        basınca çalışır, calıstıgı sürece yapılan islemleri KALICI olarak tutar.
        Calısma bittiginde HER SEY YOK olur.


         */

        System.out.println(C02_Hastane.hastaneAdresi);

        C01_Hastane.method1();  // Cankaya / Ankara ;

        System.out.println(C01_Hastane.hastaneIsmi); // Yildiz Hastanesi

        C01_Hastane per1=new C01_Hastane();
    }
}
