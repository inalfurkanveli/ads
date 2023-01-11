package day32_Sets_Maps;

import java.util.*;

public class MapMethodDepo {

    // bize ögrenciMap döndüren bir method olusturun

    public static Map<Integer, String> ogrenciMapOlustur() {

        Map<Integer, String> ogrenciMap = new HashMap<>();
        ogrenciMap.put(101, "Ali-Can-11-H-MF");
        ogrenciMap.put(102, "Furkan-Veli-12-B-EA");
        ogrenciMap.put(103, "Mustafa-Kemal-11-C-MF");
        ogrenciMap.put(104, "Ayse-Can-10-H-MF");
        ogrenciMap.put(105, "Sevgi-Cem-11-T-TM");
        ogrenciMap.put(106, "Sevgi-Can-10-K-MF");

        return ogrenciMap;
    }

    public static boolean isimIleOgrenciArama(Map<Integer, String> ogrenciMaps, String isim) {
        //1-tum value'leri bir collection olarak kaydedelim
        //  // [Ali-Can-11-H-MF, Furkan-Veli-12-B-EA, Mustafa-Kemal-11-C-MF, Ayse-Can-11-H-MF, Sevgi-Cem-11-T-TM, Sevgi-Can-11-K-MF, Cemal-Han-12-M-MF]
        Collection<String> valuesCollection = ogrenciMaps.values();
        //2-  for-each kullanarak her bir value'yu ele alalım
        //3- -'yi kullanarak split yapalım [Ali, Can, 11, H, MF]
        //4- split yaptıgımız array'den isim bilgisini alalım   0.index
        //5- eger valueden aldıgımız isim, aranan isim ile aynı ise
        // true döndürüp for-each bitirelim
        // 6- eger for- each bittiginde true olmadıysa  false döndürelim.

        for (String eachValue : valuesCollection
        ) {
            String[] valueArr = eachValue.split("-");
            String valuedekiIsim = valueArr[0];
            if (valuedekiIsim.equalsIgnoreCase(isim)) {
                return true;
            }
        }
        return false;

    }


    public static void soyIsimIleOgrenciListesiYazdırma(Map<Integer, String> ogrenciMap, String soyIsim) {
        //1- map'deki value leri bir collection olarak kaydedelim
        // [Ali-Can-11-H-MF, Furkan-Veli-12-B-EA, Mustafa-Kemal-11-C-MF, Ayse-Can-11-H-MF, Sevgi-Cem-11-T-TM, Sevgi-Can-11-K-MF, Cemal-Han-12-M-MF]
        // 2- for-each ile her bir value bilgisini ele alalım  Ali-Can-11-H-MF
        //3- value'yu - ile split yapıp bir array elde edelim  [Ali, Can, 11, H, MF]
        //4- Array'in 1.index'indeki soyİsme bakıp aranan soyİsimle aynı ise
        // İsim,Soyisim,Sinif ve sube bilgilerini yazdıralım.

        Collection<String> ogrenciValueCollection = ogrenciMap.values();
        // Liste'nin ilk satırı olarak başlıkları yazdıralım
        System.out.println("Isim Soyisim Sınıf Sube ");

        for (String eachValue : ogrenciValueCollection
        ) {
            String[] valueArr = eachValue.split("-");
            String valueSoyIsim = valueArr[1];
            if (valueSoyIsim.equalsIgnoreCase(soyIsim)) {
                System.out.println(valueArr[0] + " " +
                        valueArr[1] + " " +
                        valueArr[2] + " " +
                        valueArr[3] + " ");


            }
        }


    }

    public static void OgrenciSoyIsimIleYazdırma(Map<Integer, String> ognenciSoyİsim, String sube, String sinif) {
        Collection<String> ValueCollection = ognenciSoyİsim.values();
        System.out.println("İsim Soyisim");
        for (String eachValue : ValueCollection
        ) {
            String[] valueArr = eachValue.split("-");
            if (valueArr[2].equalsIgnoreCase(sinif) && valueArr[3].equalsIgnoreCase(sube)) {
                System.out.println(valueArr[0] + " " + valueArr[1]);
            }
        }
    }

    public static Map<Integer, String> numaraIleSubeDegistir(Map<Integer, String> ogrenciMapNumara, int numara, String sube) {
        // 1- okul numarasını biliyoruz, direk ögrenci Value'ye ulasabilirz

        String ogrenciValue = ogrenciMapNumara.get(numara); // "Sevgi-Cem-11-T-TM"

        String[] valueArr = ogrenciValue.split("-"); // "Sevgi-Cem-11-T-TM"
        // 2- sube ismini güncelleyelim
        valueArr[3] = sube; //  Sevgi-Cem-11-K-TM
        // 3- Array'deki güncel bilgileri yeniden value formatında bir String Yapalım

        String yeniValue = valueArr[0] + "-" + valueArr[1] + "-" + valueArr[2] +
                "-" + valueArr[3] + "-" + valueArr[4];

        //4- ogrenci no ile yani key ile yeni value'yu map'e ekleyelim

        ogrenciMapNumara.put(numara, yeniValue);

        return ogrenciMapNumara;


    }

    public static void sinifListesiYazdirma(Map<Integer, String> ogrenciMap, String sinif) {

        // verilen siniftaki ogrencilerin no,isim,soyisim,bolumlerini
        // bir liste olarak yazdiran bir method olusturun

        System.out.println("No   İsim   Soyisim  Bolumler");
        System.out.println("==============================");

         Set<Map.Entry<Integer, String>> entrySeti= ogrenciMap.entrySet();
        for (Map.Entry<Integer,String> eachEntry:entrySeti
             ) { // 101=Ali-Can-11-H-MF
            // 1- entry'den value'yu alalım

           String entryValue =eachEntry.getValue();
           // 2- Bu value'yu parcalayıp bir array'e store edelim
           String[] valueArr=entryValue.split("-"); // [Ali, Can, 11, H, MF]
            //3- Sınıf bilgisini kontrol edip istenen sınıf ile aynı ise istenen bilgileri yazdıralım
           if (valueArr[2].equalsIgnoreCase(sinif)){
               System.out.println(eachEntry.getKey() + " "+
                                    valueArr[0]+ " " +
                                    valueArr[1]+ " "+
                                    valueArr[4]+ " ");
           }
        }




    }

    public static void bolumListesiOlusturma(Map<Integer, String> ogrenciMap, String bölüm ) {
        // verilen bölümdeki ogrencilerin
        // no isim soyisim ve siniflarıni yazdırın
        // bir method olusturun

         Set<Map.Entry<Integer, String>> entrySeti = ogrenciMap.entrySet();



        for (Map.Entry<Integer,String> eachValue:entrySeti
             ) {
            String valueEntry=eachValue.getValue();

            String[] entryValueArr= valueEntry.split("-"); // [Ali, Can, 11, H, MF]
            if (entryValueArr[4].equalsIgnoreCase(bölüm)){
                System.out.println(eachValue.getKey() + " "+
                                    entryValueArr[0]+ " " +
                                    entryValueArr[1]+ " "+
                                    entryValueArr[2]);
            }


        }

    }

    public static   Map<Integer, String> soyisimleriBuyukHarfYap(Map<Integer, String> ogrenciMap) {

        //  Map’deki soyisimleri buyuk harfe cevirin
        // 1- EntrySet olusturalım

        Set<Map.Entry<Integer, String>> entrySeti = ogrenciMap.entrySet();
        // 2- For-each lopp ile her bir entry'i elden geçirip , soyisimleri büyük harf yapalım

        for (Map.Entry<Integer,String> eachEntry:entrySeti
             ) {
            // 3- entry'den value alalım

            String entryValue= eachEntry.getValue();
            // 4- soyisim bilgisine ulaşıp değiştirmek için parçala
            String [ ] entryValueArr=entryValue.split("-"); // [Ali, Can, 11, H, MF

            entryValueArr[1]=entryValueArr[1].toUpperCase(); // [Ali, CAN, 11, H, MF]

            // 6- değişikliği yaptıktan sonra yeniden birleştirmeleri yapıp
            // map'i update yapmalıyız
            //7- setValue() kullanarak value'yu  yeni haline  update edelim

            eachEntry.setValue(entryValueArr[0]+"-"+
                                entryValueArr[1]+"-"+
                                entryValueArr[2]+"-"+
                                entryValueArr[3]+"-"+
                                entryValueArr[4]);


        }





        return ogrenciMap;
    }

    public static void tumListeyiYazdır(Map<Integer, String> ogrenciMap) {

        Set<Map.Entry<Integer,String>> ogrenciEntrySet= ogrenciMap.entrySet();
        System.out.println(" No        Ogrenci Bilgileri");
        System.out.println("==============================");

        for (Map.Entry<Integer,String> eachEntry:ogrenciEntrySet
        ) {
            System.out.println(eachEntry);
        }
    }

    public static Map<Integer, String> siniflariArtir(Map<Integer, String> ogrenciMap) {
        // map'de istedigimiz degisikligi yaptiktan sonra
        // map'i update yapmanın en kolay yolu setEntry()
        // ogrenci map'indeki tum sınıf degerlerini 1 artirin
        // 12.sınıf varsa sınıf bilgisini mezun yap

        Set<Map.Entry<Integer, String>> entrySeti = ogrenciMap.entrySet();

        for (Map.Entry<Integer,String> eachEntryi: entrySeti // 101=Ali-Can-11-H-MF"
             ) {
            String entryValue= eachEntryi.getValue();  // Ali-Can-11-H-MF

            String [] enrtyArr=entryValue.split("-");  // [Ali, CAN, 11, H, MF]


            int sinifInt=Integer.parseInt(enrtyArr[2]);
            if (sinifInt==12){
                enrtyArr[2]="Mezun oldu.";
            }else {
                enrtyArr[2]=sinifInt+1+"";
            }

            // sinif bilgisini guncelledik
            // bu guncellemeyi map'e islememiz lazim
            eachEntryi.setValue(enrtyArr[0]+"-"+
                    enrtyArr[1]+"-"+
                    enrtyArr[2]+"-"+
                    enrtyArr[3]+"-"+
                    enrtyArr[4]);





        }



        return  ogrenciMap;
    }

    public static void sinifSiraliListeOlustur(Map<Integer, String> ogrenciMap) {
      //  101=Ali-Can-11-H-MF"
      // 11 H Ali Can 101


        Set<Map.Entry<Integer, String>> entrySet = ogrenciMap.entrySet();
        Set<String> siraliOgrenciSeti= new TreeSet<>();

        for (Map.Entry<Integer,String> eachEntry:entrySet
             ) {
            String entryValue= eachEntry.getValue();
            String [] entryArr=entryValue.split("-"); // [Ali, CAN, 11, H, MF]
            // Entry'den istenen bilgileri alıp yeni bir String olusturucagız
            // bu stringleri yazdıracagız
            // 11 H Ali Can 101
            //

            String istenenFormattakiBilgi = entryArr[2]+ " "+
                                            entryArr[3]+ " "+
                                            entryArr[0]+ " "+
                                            entryArr[1]+ " "+
                                            eachEntry.getKey();
            siraliOgrenciSeti.add(istenenFormattakiBilgi);
            System.out.println("sinif sube isim soyisim no ");
            System.out.println("===========================");

        }
        for (String each:siraliOgrenciSeti
        ) {

            System.out.println(each);
        }


    }

    public static void isimSoyisimSiraliListeYazdir(Map<Integer, String> ogrenciMap) {
        // tum ogrenci Listesini isim soyisim no sinif sube bolum
        // seklinde sirali olarak yazdiran method olusturun

        Set<Map.Entry<Integer, String>> entrySeti = ogrenciMap.entrySet();
        Set<String> isimSoyisimSiraliSet=new TreeSet<>();
        for (Map.Entry<Integer,String> eachEntry:entrySeti
             ) {
            String value=eachEntry.getValue();
            String [] valueArr=value.split("-");

            String istenenFormattakiBilgi=  valueArr[0]+ " "+
                                            valueArr[1]+ " "+
                                            eachEntry.getKey()+" "+
                                            valueArr[2]+ " "+
                                            valueArr[3]+ " "+
                                            valueArr[4];

            isimSoyisimSiraliSet.add(istenenFormattakiBilgi);


        }
        // sirali seti yazdiralım
        System.out.println("sinif sube isim soyisim no ");
        System.out.println("===========================");
        for (String each:isimSoyisimSiraliSet
             ) {
            System.out.println(each);
        }


    }
}
