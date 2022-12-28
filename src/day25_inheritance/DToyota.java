package day25_inheritance;

public class DToyota extends CCar{

    DToyota(){
        System.out.println("Parametresiz Toyota constructor'i çalıştı.");
    }
    DToyota(String param1){
        System.out.println("Parametreli Toyota cons çalıştı.");
    }
    String marka="Toyota";
    String üretimYeri="Toyota farklı ülkelerde üretilmektedir.";
}
