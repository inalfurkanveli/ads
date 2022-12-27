package day24_StringBuilder;

public class C03_StringBuilder {
    public static void main(String[] args) {

        StringBuilder sb1= new StringBuilder("Java");

        StringBuilder sb2= new StringBuilder("Java");

        String str="Java";

        System.out.println(sb1==sb2); // false

        System.out.println(sb1.equals(sb2)); // false

        // StringBuilder equals  metin eşitliğini sorgulamak için equals kullanmaz.


        System.out.println(sb1.compareTo(sb2)); // 0   Hiç fark yok ise 0 yazar

        StringBuilder sb3=new StringBuilder("Hava");  //

        System.out.println(sb1.compareTo(sb3)); // 2  --> 2

        sb3=new StringBuilder("Tava");

        System.out.println(sb1.compareTo(sb3)); //-10  J K L M N O P Q R S T   J K'dan 10 harf geride olduğu için -10 yazdırdı

        sb3= new StringBuilder("Jaka");

        System.out.println(sb1.compareTo(sb3)); // 11

        sb3=new StringBuilder("Javax");

        System.out.println(sb1.compareTo(sb3)); // -1

        sb3= new StringBuilder("Java Candır");

        System.out.println(sb1.compareTo(sb3)); //-7

     //   System.out.println(sb1==st1); // data turleri farklı CTE verir

        System.out.println(sb1.equals(str)); // false

       // System.out.println(sb1.compareTo(str));
        // compareTO Sb'lar arasında çalışır, farklı data türünü kabul etmez.


    }
}
