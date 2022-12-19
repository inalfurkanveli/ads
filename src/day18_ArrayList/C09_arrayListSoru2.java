package day18_ArrayList;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class C09_arrayListSoru2 {
    public static void main(String[] args) {
        /*
        Soru 2- Kullanicidan istedigi kadar isim alip, Q’ya bastiginda girdigi isimleri bize liste
         olarak dondurecek bir method olusturun.
         */

         List<String> isimlerListesi=  isimListesiOlusturma();

        System.out.println(isimlerListesi);

    }
    public static List<String> isimListesiOlusturma(){
        List<String> isimListesi=new ArrayList<>();

        String girilenİsim="";
        Scanner scanner=new Scanner(System.in);

        while(!(girilenİsim.equalsIgnoreCase("q"))){

            System.out.println("Listeye eklemek için bir isim girin : ");
            System.out.println("Bitirmek için q ' ya basın ");
            girilenİsim=scanner.nextLine();
            if (!girilenİsim.equalsIgnoreCase("q"))
            isimListesi.add(girilenİsim);
        }
return isimListesi;
    }
}
