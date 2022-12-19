package day10__stringManipullations;

public class C03_replaceAll {
    public static void main(String[] args) {
        /*
        String str="J1va 56guz.zel-dir";

        str=str.replace("1","a")
        .replace("5","").replace("6","")

        .replace(".","").replace("-","");
        System.out.println(str);

         */

        /*
        replace() methodu zaten istenilen değişikliği verilen özelliğe uyan tüm değerler için yapar.
         eğer genellemeyi bütün sayılraı bütün space'leri bütün özel karakterleri gibi genişletmek istersek
         replace() yerine replaceAll() kullanırız.

         Java bu genellemeleri yazabilmemiz için
         REgex(regular expressions ) tanımlamıştır.

         \\d : bütün digitler
         */
      String  str1= "Ja7va,; og436ren,./dikce guzelle=-098siyor";
        str1=str1.replaceAll("\\d","");
        System.out.println(str1);

        // ozel karakterlerden de kurtulun
        // space de özel karakter olduğundan space'in yok olmaması için metinde olamayan bir değer atıyalım

        str1=str1.replace(" ","1");

        str1=str1.replaceAll("\\W","");

        str1=str1.replace("1"," ");

        System.out.println(str1);
    }
}
