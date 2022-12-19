package sameQuestions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class C15_soru30 {
    /*

    Bir Stringdeki yinelenen karakterleri Array String olarak döndüren bir kod yazın.
            ( mülakat sorusu )
    Örnek:
    String str="Javacokkolay"
    Yinelenen karakterler : [a, o, k]
    İpucu: İçiçe for looplar, String Manupulations ve ifler kullanrak çözebilrsiniz.
    Stringdeki bir harfi Stringde bulunan diger harfler ile karşılaştırıpkonteynıra atacaksınız bu yüzden iç içe loop kullanmak mantıklı duruyor

     */
    public static void main(String[] args) {

        String str="javacokkolay";

        String hiclik="";

        List<String> tekrarlayanKarakter = new ArrayList<>();

        for (int i = 0; i <str.length() ; i++) {
            for (int j = i+1; j <str.length() ; j++) {
                if(str.substring(i,i+1).equalsIgnoreCase(str.substring(j,j+1))){
                    tekrarlayanKarakter.add(str.substring(i,i+1));
                }if(!hiclik.contains(str.substring(j,j+1))){
                    hiclik+=str.substring(j,j+1);

                }
            }

            }
        String [] tekrarlayanKarakterArray= tekrarlayanKarakter.toArray(new String[0]);
        System.out.println(Arrays.toString(tekrarlayanKarakterArray));

    }


    }

