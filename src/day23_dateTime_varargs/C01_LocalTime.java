package day23_dateTime_varargs;

import java.time.LocalTime;

public class C01_LocalTime {
    public static void main(String[] args) {
        LocalTime zaman=LocalTime.now();
        System.out.println(zaman); // 12:06:57.455875800

        System.out.println(zaman.getMinute()); //  7

        System.out.println(zaman.withSecond(0).withNano(0)); // 12:09

        System.out.println(zaman.withSecond(1).withNano(1)); // 12:09:01.000000001

        System.out.println(zaman.plusHours(100).plusMinutes(200)); // 19:30:29.001941600

        // bir for loop ile 1 den 10bine kadar olan sayıları yan yana yazdırın
        // bu işlem için geçen  zamanı bulun
        LocalTime baslangicZamani=LocalTime.now();
        System.out.println("başlangıç : "+ baslangicZamani );
        for (int i = 0; i <10000 ; i++) {
            System.out.print(i + " ");
        }
        System.out.println(" ");
        LocalTime bitisZamani=LocalTime.now();
        System.out.println("Bitiş :"+ bitisZamani);

        System.out.println("işlem süresi: " +
                (bitisZamani.getNano()-baslangicZamani.getNano())+
                " nano saniye");

        /*
                Oluşturduğumuz time veya date güncel zamanı tutmaya devam eden bir sayac degil
                oluşturdugumuz satırdaki zamani veya tarih'i sistemden alip kaydeden bir variable'dir.

                İlerleyen satirlarda guncel zaman veya tarihe ihtiyacımız oldugunda
                yeni bir time veya date objesi olusturup o andaki degeri alabiliriz.
         */





    }
}
