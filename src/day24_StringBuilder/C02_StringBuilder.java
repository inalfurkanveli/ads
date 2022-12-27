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



        StringBuilder sb2= new StringBuilder(sb.toString().toUpperCase());
        System.out.println(sb2); // JAVA

        sb=sb2;
        System.out.println(sb);

        sb.setCharAt(0,'H');
        System.out.println(sb); // HAVA

        System.out.println(sb.substring(2, 3)); // V

        System.out.println(sb.reverse()); // AVAH

        System.out.println(sb.insert(1, "H")); // AYVAH

        sb.insert(5," ETMEK YOK CALISMAK VAR",0,10);

        System.out.println(sb);

        System.out.println(sb.indexOf("A", 3)); // 3

        System.out.println(sb.indexOf("VAH")); // 2

        System.out.println(sb.lastIndexOf("VAH")); //2

        System.out.println(sb.lastIndexOf("E", 9)); // 9

        sb.replace(0,15,"Sorun Yok");
        System.out.println(sb); // Sorun Yok

        sb.delete(5,sb.length()); // Baslangic index'i dahil bitis index'i dahil değil
        System.out.println(sb);



    }
}
