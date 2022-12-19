package day15_scope_arrays;



public class C01_Hastane {
    static
    String hastaneIsmi = "Yıldız Hastanesi";
    static String hastaneAdresi = "Çankaya/Ankara";

    String personalAdi;
    String personalAdresi;
    String personalTel;


    public static void main(String[] args) {
        /*
        Eger tum method'lardan kullanılabilecek veriable'lar olusturmak isterseniz bu veriable'lari
        class level'da olustururuz .

        Class Level'da olusturulacak veriable'lar icin 2 ihtimal vardir
        1- static veriable(class veriable)
        2-instance (static olmayan) veriable (obje veriable)

        Kural1_ static veriable'lar tüm objeler için tek bir deger alır
                instance veriable'lar her obje icin java tarafından cogaltılır.

        Kural2_ Class level veriable'lara deger atamasakda kullanabiliriz.
                biz deger atamasak bile Java class level veriable 'lara defaul degerler atar.
                non-primitive icin == null (String) ;
               Sayisal primitiveler icin = 0 ;
               char icin = hiclik '' ;
               boolean = false ;

        kural3_ static olmayan methodlar'dan static olmayan veriable ve methodlara direk ulasılmaz.
                instance veriable ve static olmayan method'lari static olanlardan kullanmak isterseniz
                obje uzerinden kullanabilirsiniz .
        kural4_ class'ta olusturulan instance veriabler'lar ilk deger atamasını yapar.
                yani bir obje ilk olusturuldugunda otomatik olaran instance veriable atanan degeri alır.
                değer atanmamıs ise default degerleri alır.
                Sonrasında obje olusturulduktan sonra obje üzerinden yapılan atamalar
                class level'daki instance veriable'la değil , java tarafından olusturulup
                objeye kopyalanan veriable'a yapılır.
        kural5_ Static veriable'lar tüm objeler için ortaktir.
                static veriable'lara tüm classtan direkt ulasılabilir.
                Static veriable'in degeri degisirse tüm objeler için değişmiş olur.
         */
        C01_Hastane per1=new C01_Hastane();

        System.out.println(per1.personalAdi); // null
        System.out.println(per1.personalAdresi); // null
        System.out.println(per1.personalTel); // null


        per1.personalAdi="Fidan";
        per1.personalAdresi="Germany";
        per1.personalTel="+49565656565655";

        C01_Hastane per2= new C01_Hastane();

        System.out.println(per2.personalAdi);
        System.out.println(per2.personalTel);
        System.out.println(per2.personalTel);

        per1.personalAdi="Yusuf";

        System.out.println(per2.personalAdi); // null;
        per2.personalAdi="Ayten";

        System.out.println(hastaneIsmi);

        System.out.println(per1.hastaneIsmi);

        per2.hastaneIsmi="Java Hastanesi";

        System.out.println(per2.hastaneIsmi);


    }

    public static void method1(){
        System.out.println(hastaneAdresi);
    }
    public void method2(){
        System.out.println(hastaneIsmi);
    }
}
