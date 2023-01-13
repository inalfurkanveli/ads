package day34_Maps_NestedMaps;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class C02_NestedMap {
    /*

    Asagidaki body'yi map olarak oluşturun
    {
"firstname" : "Ahmet",
"lastname" : "Bulut",
"totalprice" : 500,
"depositpaid" : false,
"bookingdates" : {
       "checkin" : "2021-06-01",
       "checkout" : "2021-06-10"
          },
"additionalneeds" : "wi-fi" }
     */

    public static void main(String[] args) {

        Map<String,String> bookingDates = new HashMap();

        bookingDates.put( "checkin" , "2021-06-01");
        bookingDates.put("checkout" , "2021-06-10");

        Map<String, Object> otelRez= new HashMap();
        otelRez.put("firstname", "Ahmet");
        otelRez.put("lastname", "Bulut");
        otelRez.put("totalprice", 500);
        otelRez.put("depositpaid", false);
        otelRez.put("bokingdates", bookingDates);
        otelRez.put("additionalneeds", "wifi");

        // isim bilgisini yazdırın
        System.out.println(otelRez.get("firstname")); // Ahmet

        // additionalneeds yazdırın

        System.out.println(otelRez.get("additionalneeds")); // wi-fi

        // check-in bilgisini yazdirin
        // booking map'indeki value data türünü object sectik
        // dolayısıyla bookingdates key'ine ait value'yu objeckt olarak bize getirir.
        // ama biz onun map oldugunu biliyoruz
        // o zman casting yapabiliriz.

        System.out.println(((Map) otelRez.get("bookingdates")).get("checkin")); // 2021-06-01

        // check out  tarihini yazdiralim

        System.out.println(((Map) otelRez.get("bookingdates")).get("checkout")); // "2021-06-10"
    }

}
