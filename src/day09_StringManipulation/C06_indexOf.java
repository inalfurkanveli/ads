package day09_StringManipulation;

import java.util.Scanner;

public class C06_indexOf {
    public static void main(String[] args) {

        // kullanıcıdan bir cümle alın
        // "cok" ile baslayan ilk cümleyi yazdırın.
        // cümlede cok kelimesi geçmiyorsa "cümlede çok ile baslayan kelime yok"

        Scanner scan= new Scanner(System.in);
        System.out.println("Lütfen bir cümle giriniz.");
        String cümle=scan.nextLine();

        if (!cümle.contains("cok")){
            System.out.println("Cümlede cok ile baslayan kelime yok.");
        }
        else {
            int cokIndexi=cümle.indexOf("cok");
            int boslukIndexi=cümle.indexOf(" ",cokIndexi+1);


            System.out.println(cümle.substring(cokIndexi, boslukIndexi));
        }

    }
}
