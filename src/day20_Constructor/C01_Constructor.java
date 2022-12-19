package day20_Constructor;

import day19_arrayListForEachLoop.C09_Toyota;

public class C01_Constructor {
    public static void main(String[] args) {

        Car car1=new Car();

        C09_Toyota toyota= new C09_Toyota();

        System.out.println(car1);
        // Car{marka='Marka belirtilmemiş', model='Model belirtilmemiş', yıl=1900, km=0, renk='Renk belirtilmemiş'}

        System.out.println(toyota); // day19_arrayListForEachLoop.C09_Toyota@30dae81

        // Toyota bir obje olduğunda özellikleri direk YAZDIRAMAYIZ . referansı yazdırır.

        // bir class'tan oluşturulan objelerin belirli özelliklerini kolayca yazdırabilmek için
        // o class'ta istenen özellikleri kapsayan bir toString methodu oluşturulabilir.

        // toString method'undaki yazılanları istediğimiz şekil ve formata uyarlayabiliriz.
        /*
        Car{marka='Marka belirtilmemiş'
        , model='Model belirtilmemiş'
        , yıl=1900
        , km=0
        , renk='Renk belirtilmemiş'}
         */

        car1.marka="Audi";
        car1.model="A4";
        car1.yıl=2022;
        car1.km=0;
        car1.renk="siyah";

        System.out.println(car1);
        /*
             Car{marka='Audi'
            , model='A4'
            , yıl=2022
            , km=0
            , renk='siyah'}

         */
    }
}
