package day09_StringManipulation;

public class C07_ilkTest {
    public static void main(String[] args) {
        // Gittigimiz web sayfasindan aldigimiz
        // String arama sonuclarinda
        // arama sayisinin 50'den fazla oldugunu test edin

        String input= "1-48 of 87 results for \"nutella\"";

        int indexOf=input.indexOf("of");
        int indexResults=input.indexOf("results");

        String sonucSayisiString=input.substring(indexOf+3,indexResults-1);

        int sonucSayisiInteger=Integer.parseInt(sonucSayisiString);

        if(sonucSayisiInteger>50){
            System.out.println("Nutella arama testi Passed");
        }
        else {
            System.out.println("İstenen kadar arama yok.Test Fail.");
        }



    }
}
