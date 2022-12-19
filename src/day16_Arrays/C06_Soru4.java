package day16_Arrays;

public class C06_Soru4 {
    public static void main(String[] args) {
        // Bir marketin fiyatlarını tutan bir array var
        // Bu marketteki en yüksek ve en düşük fiyatları yazdıran bir method oluşturun

        double[] fiyatlar={23,34.5,41.1,5.7,3.7,23.5};

        enYuksekEnDusukFiyatYazdir(fiyatlar);
    }

    public static void enYuksekEnDusukFiyatYazdir(double[] fiyatlar){

        double enDüsükFiyat=fiyatlar[0];
        double enYuksekFiyat=fiyatlar[0];

        for (int i = 0; i < fiyatlar.length ; i++) {

           if(fiyatlar[i]<enDüsükFiyat){
               enDüsükFiyat=fiyatlar[i];
           }
           if ((fiyatlar[i]>enYuksekFiyat)){
               enYuksekFiyat=fiyatlar[i];
           }

        }
        System.out.println("Listedeki en düsük fiyat : "+ enDüsükFiyat);
        System.out.println("Listedeki en yüksek fiyat: "+ enYuksekFiyat);

    }
}
