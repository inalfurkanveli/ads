package sameQuestions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class C34_ManavGünlükHesaplama {

    /*
    Bir bakkalın 7 günlük tüm kazançlarını günlük olarak gösteren bir program
yazınız.
 Ayrıca bakkalın bu hafta ortalama kazandığı miktarı gösteren bir
method yazınız. 
Ayrıca bakkalın hangi günler ortalamanın üstüne kazandığını
gösteren bir method yazınız. 
Ayrıca bakkalın hangi günler ortalamanın altında
 kazandığını gösteren bir method yazınız.

 * 1. Adım : Günleri içeren bir tane ArrayList oluşturun. (gunler)
   2. Adım : Günlük kazançları ekleyeceğimiz bir tane ArrayList oluşturun. (gunlukKazanclar) 
   3. Adım : While döngüsü ile kullanıcıdan 7 günlük kazançları tekek teker alıp gunlukKazanclar ArrayList'e ekle. 
   4. Adım : getOrtalamaKazanc() adlı method ile ortalama kazancı alın. 
   5. Adım : getOrtalamaninUstundeKazancGünleri() adlı method oluşturun. for döngüsü ile tüm günleri ortalama kazanç ile karşılaştır ortalama      
             kazançtan yüksekse o günleri return yap. 
   6. Adım : getOrtalamaninAltindaKazancGünleri() adlı method oluşturun. for döngüsü ile tüm günleri ortalama kazanç ile karşılaştır
             ortalama kazançtan aşağıysa o günleri return yap.a
     */
    
static   ArrayList <String> gunler = new ArrayList<>(Arrays.asList("Pazartesi", "Salı","Çarşamba","Perşembe","Cuma","Cumartesi","Pazar"));
static  ArrayList <Double> gunlukKazanc = new ArrayList<>();
static double toplam=0;
static double haftalıkOrtalama=0;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < gunler.size() ; i++) {
            System.out.println(gunler.get(i) + " günkü kazancınızı giriniz: ");
            double kazanc = scanner.nextDouble();
            gunlukKazanc.add(kazanc);
        }
        for (int i = 0; i <gunlukKazanc.size() ; i++) {

            System.out.println(gunler.get(i)+" günü toplam kazanç "+  gunlukKazanc.get(i) + " $'dır");
            toplam+= gunlukKazanc.get(i);

        }


        getOrtalamaKazanc(toplam);

        kazancSorgulama(haftalıkOrtalama,gunlukKazanc);

    }

  private static void getOrtalamaKazanc(double toplam) {


        haftalıkOrtalama= toplam/7;

      System.out.println("Haftalık kazanç ortalaması  : "+ haftalıkOrtalama + " $'dır.");

    }
    private static void kazancSorgulama (double haftalıkOrtalama, List<Double> gunlukKazanclar){
        for (int i = 0; i <gunlukKazanclar.size() ; i++) {
            if (haftalıkOrtalama<gunlukKazanclar.get(i)){
                System.out.println("Haftalık ortalamanın üstünde kazandığınız günler : "+ gunler.get(i));
            }

            else {

                System.out.println("Haftalık ortalamanın altında kazandıgınız günler : "+ gunler.get(i));
            }

        }

    }


}

