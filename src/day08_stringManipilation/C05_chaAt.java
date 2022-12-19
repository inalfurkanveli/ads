package day08_stringManipilation;

public class C05_chaAt {
    public static void main(String[] args) {
        String str="Java güzeldir"; // 13 tane karakter barındırır.

        // Java'da index 0 dan başlar.
        // J == 0 ncı index
        // charAt(index) ile istediğimiz indexteki char ' a ulaşabiliriz.

        // ilk a 'yı yszdıralım.
        System.out.println(str.charAt(1));

        //sondan 2nci karakter
        System.out.println(str.charAt(13-2));
        //karakter sayısı -2nci index teki eleman

        //sondan 4.karakteri buyuk harf olarak yazdırın
        System.out.println(str.toUpperCase().charAt(13-4));

        //charAt() method'u bize char döndürdüğü için toUpperCase() çalışmaz.
        // String methodlarını charAt () ile kullanmak isterseniz
        //charAt()'den önce kullanmalısınız.

        //System.out.println(str.charAt(18)); // StringIndexOutOfBoundsException
        // Eğer index olarak karakter sayısından büyük bir index girersek o index i bulamayacağı için
        //hata verir.

    }
}
