package day30_intefaces_iterator;

public class M01_ChildOfInterface  implements I01_interface, I02_interface{

    // bİr class baska bir class'a extends keyword ile parent edinebilir
    // ancak birden fazla class'i parent EDİNEMEZ.
    // Interface'ler için böyle bir sınırlama yoktur.
    // Bir class istedigi kadar Interface'i implement edebilir.

    public static void main(String[] args) {
        System.out.println(I01_interface.SAYI); // 10
        System.out.println(I02_interface.SAYI); // 30

        //Interface'de olusturulan static veya default olarak isaretlenen method'lari farkı
        // static olana interfaceIsmı.staticMethodIsmi seklinde olusturabilirken.
        // default olana child class'dan olusturulacak obje uzerinden erisilebilir.
        I01_interface.method34();
    }
    // Eger birden fazla interface implament edildiginde
    // aynı isimde methodlar farklı Interface'lerde varsa
    // return type'a bakılır.
    // Return type aynı ise sorun olmaz , cünkü ikisini de implement edebiliriz
    // ancak return type'ları farklı ise birini tercih ettigimizde digeri CTE verir.
    // Bu durumda parent interface'lere müdahale etmek mümkün ise müdahale edilir .
    // Veya bu inteface'lerden birini implement etmekten vazgecebiliriz.
    @Override
    public void method1() {


    }

    @Override
    public int method2() {
        return 0;
    }

    @Override
    public String method3() {
        return null;
    }

    @Override
    public void method4() {

    }

    @Override
    public void method5() {

    }

    @Override
    public int method6() {
        return 0;
    }
}
