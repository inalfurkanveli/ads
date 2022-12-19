package CarsambaPractise;

public class C08_stringArrayÖrnegi {
    public static void main(String[] args) {
        /*
        String' lerden oluşan bir arrayde öğeler 'n' veya 'k' ile bitiyorsa, o öğelerin baş harflerini ekrana yazdıran metodu yazınız.
Örnek: { "Kemal", "Jonathan", "Mark", "Jackson", "Ali" } ==> Çıktı JMJ
         */
      String[] isimler= { "Kemal", "Jonathan", "Mark", "Jackson", "Ali" };

        System.out.println("İlk Harfler:  " +basHarfYazdir(isimler));

    }

    private static String basHarfYazdir(String[] isimler) {
        String harfler="";
        for (int i = 0; i < isimler.length ; i++) {
            if(isimler[i].endsWith("n") || isimler[i].endsWith("k")){
               harfler+=isimler[i].charAt(0);
            }
        }
return harfler;
    }
}
