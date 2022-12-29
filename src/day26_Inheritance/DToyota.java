package day26_Inheritance;

public class DToyota {

    /*
Bir objenin data türü,constructor olarak kullanılan
class veya o class'in parent class'ları olabilir

Data türü olarak parend class seçilmesindeki  amaç
child class'tan oluşturulan objenin parent Class'in tum child class'larinin tasidiği
ortak özellikleri vurgulamaktadır.
(personel toplantısına katılan doktor kemal , bashemsire ayse gibi)

Data türü ile constructor farklı olduğubda veriable ile methodlar farklı davranırlar.


Veriable'larin alacaği değeri bulmak için aramaya data turu olan Classdan başlarız
o class'da yoksa parendlerina bakarız.
Ve ilk buldugumuz degeri atama yapariz .

Data turu olan class veya parentlerinde bulunamazsa CTE olur.

     */

    String marka="Toyota";
    String model="Model Belirtilmedi.";
    String motor="Motor Belirtilmedi";
    String yakit="Yakit Belirtilmedi";

}
