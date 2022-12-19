package day10__stringManipullations;

public class C01_NullPointer {
    public static void main(String[] args) {
        String str1="";

        String str2="   ";

        String str3;

        String str4= null;

        System.out.println(str1.length()); // 0
        System.out.println(str2.length()); // 4

        System.out.println(str1.isEmpty()); // true
        System.out.println(str2.isEmpty()); // false

        System.out.println(str1.isBlank()); //true
        System.out.println(str2.isBlank()); // true


        // null nir değer değil işaretçidir. (null pointer)
        // null pointer : non-primitive bir objenin  oluşturuldupunu
        // ancak bilinçli olarak deger atanmadigini isaretler .
        // str4*un değeri null'dur cümlesi YANLIŞ.
        // str4 null olarak işaretlenmiştir cümlesi DOĞRU.


        // System.out.println(str3.length());
        // System.out.println(str3.concat("Ali Can"));
        // System.out.println(str3.substring(3,4));

        /*
        Java bir variable'i oluşturup değer atamasına izin verir.
        bir veriable' i değere atamadan OLUŞTURABİLİRSİNİZ anccak KULLANAMAZSINIZ.
        değere atanmayan veriable'i kullanmaya kalkarsanız JAVA CTE verir.

         */
        // Null pointer ise bu variable'a bir değer atanmadığını ve bunun bilinçli
        // bir tercih olduğunu java'ya söyler dolayısıyla Java kodların calışmaya devam etmesine izin verir
        //Ancak değer atanmadığı için methodlarla kullanmaya çalışırsanız NullPointerException verir.

        str4=null;

        System.out.println(str4.length()); // NullPointerException
        System.out.println(str4.substring(3, 4)); // NullPointerException
    }
}
