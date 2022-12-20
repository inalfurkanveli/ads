package BenimAlistirmalar;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Örnek3 {
    /*
    Bir Stringdeki yinelenen karakterleri Array String olarak döndüren bir kod yazın.
( mülakat sorusu )
Örnek:
String str="Javacokkolay"
Yinelenen karakterler : [a, o, k]
İpucu: İçiçe for looplar, String Manupulations ve ifler kullanrak çözebilrsiniz.
            Stringdeki bir harfi Stringde bulunan diger harfler ile karşılaştırıp
            konteynırak atacaksınız bu yüzden iç içe loop kullanmak mantıklı duruyor
     */

    public static void main(String[] args) {
  /*   String str="Javazorlasmayabasladı";
    String yinelenenKarakterler="";


        for (int i = 0; i <str.length() ; i++) {
            for (int j = i+1; j <str.length() ; j++) {
                if (str.substring(i,i+1).equalsIgnoreCase(str.substring(j,j+1))&&!yinelenenKarakterler.contains(str.charAt(i)+ ""))


            }
        }

        System.out.println((hiclik));
    */

        String str = "Javagittikçezorlaşıyor";

        String tekrarlayanlar = "";

        for (int i = 0; i < str.length(); i++) {
            for (int j = i + 1; j < str.length(); j++) {
                if (str.charAt(i) == str.charAt(j) )
                {
                    tekrarlayanlar = tekrarlayanlar + str.charAt(i);
                }
            }
        }
        String[] tekrarlayanKarakterler = tekrarlayanlar.split("");
        System.out.println(Arrays.toString(tekrarlayanKarakterler));
        }

    }



