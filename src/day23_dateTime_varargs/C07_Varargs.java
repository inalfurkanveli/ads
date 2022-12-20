package day23_dateTime_varargs;

public class C07_Varargs {
    public static void main(String[] args) {
        // kaç tane String argument yazılırsa yazılsın
        // Argumentlerin en uzun olanını yazdıran bir method olusturun
        // Not: en uzun kelime olarak birden fazla kelime varsa ilkini yazdırsın


        enUzunuYazdir("Ilyas","Berivan","Murat");
        enUzunuYazdir("Furkan","Mehmet","Abdullah");
    }

    private static void enUzunuYazdir(String... kelimeler) {

        String enUzunkelime=kelimeler[0];
        for (String eachKelime:kelimeler
             ) {
            if (eachKelime.length()>enUzunkelime.length()){
                enUzunkelime=eachKelime;
            }

        }
        System.out.println(enUzunkelime);

        }
    }

