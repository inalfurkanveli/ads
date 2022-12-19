package day14_doWhile_Scope;

public class C06_Hastane {
    static  String hastaneIsmi="Yıldız Hastanesi";
    static String hastaneAdresi="Çankaya/Ankara";

    String personalAdi;
    String personalAdresi;
    String personalTel;


    public static void main(String[] args) {

        C06_Hastane p1=new C06_Hastane();

        p1.personalAdi="Hatice";

        C06_Hastane p2=new C06_Hastane();
        p2.personalAdi="Dr.Furkan";

    }
}
