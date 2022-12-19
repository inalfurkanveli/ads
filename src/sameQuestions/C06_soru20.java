package sameQuestions;

import javax.swing.*;
import java.util.Scanner;

public class C06_soru20 {
    public static void main(String[] args) {
        /*
        Soru 20-) Kullanıcıdan bir isim yazmasını isteyin, İsim uzunluğu 3 olmalıdır.
                  Daha sonra ismin aynı karakterlere sahip olup olmadığını kontrol edin.
                  Dize aynı karakterlere sahipse ;
                  "Dizede yinelenen karakterler var" ;
                  aynı karakterlere sahip degilse ;
                  "String benzersiz karakterlere sahip" yazdırın.
                  İsim 3 karakterden uzunsa ;
                  "Bu kadar uzun cümleyi anlayamam ben agam" yazdırın.
                Örnek:
                giriş: ama
                çıkış: Dizede yinelenen karakterler var
                İpucu: İf Else ve Char kullanarak çözebiliriz.
         */
        Scanner scanner= new Scanner(System.in);

        System.out.println("Lütfen 3 harfli bir kelime giriniz ");
        String kelime=scanner.nextLine();

        if (kelime.length()<3) System.out.println("Kelime uzunlugu 3 olmalıdır.");
        else if (kelime.length()==3) {
            if (kelime.charAt(0)==kelime.charAt(1) ||
                    kelime.charAt(0)==kelime.charAt(2) ||
                    kelime.charAt(1)==kelime.charAt(2))
                System.out.println("Kelimede yineleyen karakterler vardır.");
            else System.out.println("Dizide tekrarlanan harf yoktur.");
        } else System.out.println("Bu kadar uzun kelimeyi anlayamam agam. ");

        }


    }

