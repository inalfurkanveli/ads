package day30_intefaces_iterator;

public interface I01_interface {

    /*
    Interface'lerde tüm methodlar public ve abstract'tir.

    Interface'lerde tüm veriable lar public static ve final dır.
    final oldugundan sonradan deger atamak mümkün olmaz.
    Olustururken deger ATANMALIDIR.
     */

    int SAYI=10;
    String OKUL_ISMI="Yildiz Koleji";
    int SAYI2=20;

    void method1();
    public int method2();
    abstract String method3();
    public abstract void method4();

    /*
    Bir inteface'e sonradan bir method eklemek istedigimizde
    o interface'i daha once implement eden tum class'lar
    yeni eklenen method'u implament etmek zorunda olur.

    Java'ya yapılan talepler sonucunda
    Java8 ile birlikte bu konuda bir istisna getirilmiştir.

    Eger sonradan ekelenen method'un tüm eski class'lar tarafından implement edilme
    mecburiyeti olmasın istiyorsanız

    Yeni olusturdugunuz method'a DEFAULT veya STATİC keyword ekleyip
    body 'de olusturursanız
    o zman bu method'un child class'lar tarafindan
    İmplement edilme MECBURİYETİ OLMAZ.
     */
    public default void method44(){
        System.out.println("Interface'deki default olarak isaretlenen method calisti.");
    }
    public static void method34(){
        System.out.println("Interface'deki static olarak isaretlenmis method calisti.");
    }
}
