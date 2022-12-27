package day24_StringBuilder;

public class C02_StringBuilder {
    public static void main(String[] args) {

        StringBuilder sb = new StringBuilder("Java");

        System.out.println(sb.capacity()); // 20
        System.out.println(sb.length()); // 4


        sb.trimToSize();

        // atama yapmadığımız halde bu değişiklik kalıcı olur mu?
        // StringBuilder mutable oldugundan method'larla yapılan
        // değişiklikler kalici olur .

        sb.toString().toUpperCase();

        System.out.println(sb); // Java
        // StringBuilder'i String'e çevirirseniz veya String döndürecek
        // methodlar kullanırsanız String'in inmutable özelliği devreye girer
        // ve yapılan değişiklikler kalıcı olmaz.


       // sb=sb.toString().toUpperCase();
        // non-primitive data turlerinde farklı data turunden atama yapamazsınız.

       // Short sayi1=20;
       // Integer sayı2=sayi1;



    }
}
