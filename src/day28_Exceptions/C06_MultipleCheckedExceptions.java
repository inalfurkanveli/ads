package day28_Exceptions;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class C06_MultipleCheckedExceptions {
    public static void main(String[] args) {


        // metin.txt dosyasındaki yazıları yazdıralım
        /*
        Eger birden fazla catch cümlemiz varsa ve exception'lar arasında
        parent-child iliskisi varsa

        1-ikisinide yazmak istiyorsak , once child exception,sonra parent yazilmalidir.
        aksi taktirde parent ustte olursa , tum exception'lari yakalacagindan child exception'i yazmak anlamsız olur


        2- İkisini yazmak istemezsek, sadece parent exception yeterli olacaktir
        cunku parent daha kapsayicidir ve daha cok exception yakalar.
         */

        try {
            FileInputStream dosya=new FileInputStream("src/day28_Exceptions/metin.txt");
            int k=0;
            while ((k=dosya.read())!=-1){
                System.out.println((char) k);
            }
        } catch (FileNotFoundException e) {
            System.out.println("Dosya okunamadı.");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }


    }
}
