package day24_StringBuilder;

public class C05_Encapsulation {
    public static void main(String[] args) {
        /*
     Access modifiers bir class uyesine erisimi sinirlandirirken
            gorme yetkisi(read) ve degistirme yetkisini(write) ayirt edemez
            Ama gercek hayatta bu ihtiyac vardir
            Bazi class uyelerinin readable olmasi istenirken
            Bazi class uyelerinin sadece writeable olmasi istenir
            Ve bazi class uyeleri icin iki yetki de istenir
            Java bu yetkilendirme islemini Encapsulation ile cozmustur.

            Sadece yazma yetkisi icin setter()
            sadece okuma yetkisi için getter()

            Kodlarımızın daha anlasilir bir şekilde atama ve yazma islemlerini yapmasii içinde
            getter() ve setter() method'ları birlikte kullanılır.
            Bazı developer'lar boyle yapmayı tercih eder.

         */

        EncapsuleClass obj1 = new EncapsuleClass();

      obj1.setSatis(100);
      obj1.setSatis(200);
      obj1.setSatis(300);

        System.out.println(obj1.getToplamSatis()); // 600


        obj1.setHalkaAcikSayi(400);
        System.out.println(obj1.getHalkaAcikSayi()); // 400
    }
}
