package day15_scope_arrays;

public class C02_Hastane {
    String hastaneIsmi = "Yıldız Hastanesi";
    static String hastaneAdresi = "Çankaya/Ankara";

    String personalAdi="Personal";
    String personalAdresi="Adres";
    String personalTel="Telefon";

    public static void main(String[] args) {
        C02_Hastane per1=new C02_Hastane();


        C02_Hastane per2=new C02_Hastane();

        per1.personalAdi="Furkan";

        per2.personalAdresi="Kusadasi";


        per1.hastaneIsmi="Java Hastanesi";

    }
}
