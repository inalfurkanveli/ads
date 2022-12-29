package day26_Inheritance;

public class FDizelCorolla extends ECorolla{
    String motor="1.6 dizel";
    String yakit="Dizel";
    String renk="Renk Belirtilmedi";
    String guvenlik="ABS";

    public static void main(String[] args) {

        /*
        Bazen child class'dan obje oluşturmakla beraber
        bu child class'in parent class'indaki hangi özellikleri
        aldigini bilmek isteriz
        Bu durumda data turunu constructor'i kullanılan class'in
        parent class'larından secebiliriz.

         */

        DToyota c3=new FDizelCorolla();
        System.out.println(c3.motor); // --T
        System.out.println(c3.yakit); // T
        //System.out.println(c3.guvenlik);// cte
        //System.out.println(c3.renk); // cte
        System.out.println(c3.model); // cte
        //System.out.println(c3.üretimYeri);// cte
        //System.out.println(c3.teker);//cte
        //System.out.println(c3.vites);// cte


        System.out.println(c3.marka); // Toyota-- T


        ECorolla c2=new FDizelCorolla();
        System.out.println(c2.motor); // --T
        System.out.println(c2.yakit); // T
        //System.out.println(c2.guvenlik);//
        //System.out.println(c2.renk); //
        System.out.println(c2.model); // Corolla -- C
        System.out.println(c2.üretimYeri);// Türkiye-- C
        System.out.println(c2.teker);// 200.55 -- C
        System.out.println(c2.vites);// Vites belirtilmedi -- C


        System.out.println(c2.marka); // Toyota-- T

        FDizelCorolla c1=new FDizelCorolla();
        System.out.println(c1.motor); // 1.6 motor--DC
        System.out.println(c1.yakit); // Dize -- DC
        System.out.println(c1.guvenlik);// ABS -- DC
        System.out.println(c1.renk); // Renk belirtilmedi -- DC
        System.out.println(c1.model); // Corolla -- C
        System.out.println(c1.üretimYeri);// Türkiye-- C
        System.out.println(c1.teker);// 200.55 -- C
        System.out.println(c1.vites);// Vites belirtilmedi -- C


        System.out.println(c1.marka); // Toyota-- T

        // Bazen child class'tan obje oluşturmakla beraber
        // Bu child class'in parent classindaki hangi özellikleri
        // aldıgını bilmek isteriz.
    }
}
