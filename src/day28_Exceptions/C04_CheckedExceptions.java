package day28_Exceptions;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class C04_CheckedExceptions {
    public static void main(String[] args) throws FileNotFoundException {


        FileInputStream fis= new FileInputStream("src/day28_Exceptions/metin.txt");
        /*
        Bazi kodları yazdıgımızda java Compile time sırasında
        o kodlarda exceptions riskini görür ve bizden bir çözüm bekler


        Ozellikle dosya okuma ve yazma ile ilgili
        IO ( İnput/output) islemlerinde ya okuyamazsam ya yazamazsam diyerek
        bizden compile time'da çözüm ister

        Bu durumda biz exception ile karşılaşıldıgında
        kod dursun diyorsak : method satırına throws keyword kullanarak
                             beklenilen exception(lar)i deklare edebiliriz.
                            Bu sadece olayın farkında oldugumuzu deklare eder
                            Exception firlatmanin ve kodu durdurmanin onune gecmez

       Kod calismaya devam etsin : try-catch-(finally) blogu kullanabiliriz.
         */
    }
}
