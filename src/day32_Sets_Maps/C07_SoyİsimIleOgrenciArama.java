package day32_Sets_Maps;

import java.util.Map;

public class C07_SoyİsimIleOgrenciArama {
    // ogrenci map'te aradıgımız soyisim'deki ögrencilerin
    // isim soyİsim sınıf ve şube bilgilerini
    // bir tablo olarak yazdıran bir method olusuturun

    public static void main(String[] args) {

        Map<Integer,String> ogrenciMap= MapMethodDepo.ogrenciMapOlustur();


        MapMethodDepo.soyIsimIleOgrenciListesiYazdırma(ogrenciMap,"Can");

    }

}
