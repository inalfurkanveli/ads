package day09_StringManipulation;

import java.util.Scanner;

public class C05_indexOf {
    public static void main(String[] args) {
        String str="Java ile kodlama cok kolay";

        // str "cok" iceriyor mu?

        System.out.println(str.contains("cok"));

        //kullanıcıdan aldığımız cümle "cok" ile başlayan ilk kelimeyi yazdırın.

        System.out.println(str.indexOf('a')); //1
        System.out.println(str.indexOf("v")); //2
        System.out.println(str.indexOf("cok")); //17
        System.out.println(str.indexOf("a", 5)); //13
        System.out.println(str.indexOf("o", 13)); // 18
/*


        Scanner scan= new Scanner(System.in);
        System.out.println("Lütfen bir cümle giriniz.");
        String kelime=scan.nextLine();

 */

        //2.o'nun indeksini yazdırınız.
        // önce ilk o ' nun index i ni bulunuz.
        // sonra o index'ten sonrasinda 2. o'yu aratiriz.
        // Java ile kodlama cok kolay

        int ilkİndex=str.indexOf("o");
        int ikinciOIndexi=str.indexOf("o",ilkİndex+1);

        System.out.println(ilkİndex+ " " + ikinciOIndexi);

    }
}
