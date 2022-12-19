package day22_immutableClasses;

public class C04_StringEquals {
    public static void main(String[] args) {

        /*
        Java Stringlerde her seferinde yeni obje oluşturmamak için String havuzu kullanır.

        eger string olusturulurken
        bugune kadar yaptıgımız gibi basit bir şekilde oluşturulursa
        havuzu kontrol eder ve ayni deger varsa bunları özleştirir

        Ancak new keyword kullanilir veya bir işlem sonucunda String elde edilecek olursa
        havuza bakmaz,objeyi oluşrurur ve atama yapar.

         */
        String str1="Java";
        String str2="Java";


        String str3=new String("Java"); // Java

        String a = "Ja";
        String b= "va";
        String str4=a+b; // Java
        String str5=a.concat(b); // Java
        String str6=str5+"";

        System.out.println(str1.equals(str2)); // true
        System.out.println(str1.equals(str3)); // true
        System.out.println(str1.equals(str4)); // true
        System.out.println(str1.equals(str5)); // true
        System.out.println(str1.equals(str6)); // true

        // sadece degereler bakıyor
        System.out.println("******************************************");

        System.out.println(str1==str2);// true
        System.out.println(str1==str3); // false
        System.out.println(str1==str4);// false
        System.out.println(str1==str5);// false
        System.out.println(str1==str6);// false
        System.out.println(str1=="Java");// true
        System.out.println(str2=="Java"); // true
        // = = hem referansa hemde degere bakar !!!!


    }
}
