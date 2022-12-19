package day03_dataCasting_matematikselIslemler;

public class C02_explicitDataCasting {
    public static void main(String[] args) {

        /*
        Eğer geniş kapasiteli bir data türünden dar kapasiteli bir data turune
        casting yapmak isterseniz
        Java bunu otomatik olarak gerçekleştirmez,sizden sorumluluk almanizi bekler
        İşlemin gerçekleşmesi için cast yapmak istediğiniz değerin önünde
        (donustumek istediğimiz data turu) yazılmalıdır.

        Explicit narrowing yapildiginda data kayıpları
        veya datanın beklenmedik bir sonuca donusmesi mumkundur.
         */
        double dbl=23.5;

        int sayi=(int)dbl;
        System.out.println(sayi); //23


        byte byt=(byte) sayi;

        System.out.println(byt); //23

        sayi=130;
        byt=(byte)sayi;  //int daha kapsamlı olduğu için otomatik atama yapmaz.bizden müdahale ister

        System.out.println("int 130'un byte hali "+byt); // -126

        sayi=256;
        byt=(byte)sayi;  //int daha kapsamlı olduğu için otomatik atama yapmaz.bizden müdahale ister

        System.out.println("int 256'un byte hali "+byt); // 0
        sayi=13000;
        byt=(byte)sayi;  //int daha kapsamlı olduğu için otomatik atama yapmaz.bizden müdahale ister

        System.out.println("int 13000'un byte hali "+byt); // -56
    }
}
