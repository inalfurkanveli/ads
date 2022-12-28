package day25_inheritance;

public class ECorolla extends DToyota{
    ECorolla(){
        System.out.println("Parametresiz corolla Constructor'u calisti");
    }

    ECorolla(String param1){
        super("Gri");
        System.out.println("String parametreli cons. çalıştı.");
    }

    String model="Corolla";
    String üretimYeri="Türkiye";

    public static void main(String[] args) {
        ECorolla corolla1=new ECorolla("mavi");


    }
    /*
    Bir obje oluşturulduğunda ilk değer ataması yapılabilmesi için
    constructor calışmalıdır.

    İnheritance'de biliyoruz ki child class'tan oluşturulan her obje
    parent class'daki özelliklere sahip olur.

    Parent class'daki özelliklere sahip olabilmesi için parent class'daki
    constructor'lar da çalışmalıdır.

    Java bu çalışmayı super() sayesinde sağlar

    Java'da her oluşturulan class'da gorunmesede default constructor oldugu gibi
    extends keyword kullanılan her class'da oluşturulan her constructur'un ilk satırında
    görünmesede super() vardır.
     */
}
