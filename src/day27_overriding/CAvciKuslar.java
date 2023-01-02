package day27_overriding;

public class CAvciKuslar extends BKuslar{
    protected void hareket( ){
        System.out.println("ucarlar");
    }
    protected void beslenme( ) {
        System.out.println(" et yerler");
    }
    protected void pence( ) {
        System.out.println("pencelidir");
    }
    protected void gaga( ) {
        System.out.println("sivri gagali");
    }

    public static void main(String[] args) {
        CAvciKuslar kartal1 = new CAvciKuslar();

        kartal1.hareket(); // c  ucarlar
        kartal1.beslenme(); // c  et yerler
        kartal1.pence();// c  pencelidir
        kartal1.gaga();// c  sivri gagalıdır
        kartal1.kanat(); // b kanatlıdırlar
        kartal1.solunum(); // b  akciger ile nefes alırlar
        kartal1.cogalma();// b yumurtayla cogalırlar
        kartal1.omur(); // A  yasar ve olurler

        // Eğer constructor ile data türü aynı ise
        // özelligin veriable veya method olmasına bakılmaksızın o class'a gidilir
        // o class veya parent class'larda bulunan ILK DEGER  kullanılır.


        BKuslar kartal2 = new CAvciKuslar();
        kartal2.hareket(); // c  ucarlar
        kartal2.beslenme(); // c  et yerler
      //  kartal2.pence();// c  BKuslar veya parent class'ta yok. O yüzden CTE.
        kartal2.gaga();// c  sivri gagalıdır
        kartal2.kanat(); // b kanatlıdırlar
        kartal2.solunum(); // b  akciger ile nefes alırlar
        kartal2.cogalma();// b yumurtayla cogalırlar
        kartal2.omur(); // A  yasar ve olurler


        AHayvanlar kartal3= new CAvciKuslar();

        kartal3.hareket(); // c  ucarlar
        kartal3.beslenme(); // c  et yerler
     //   kartal3.pence();//.AHayvanlar'da yok  o zmaan CTE
     //   kartal3.gaga();// AHayvanlar'da yok  o zmaan CTE
     //   kartal3.kanat(); //AHayvanlar'da yok  o zmaan CTE
        kartal3.solunum(); // b  akciger ile nefes alırlar
        kartal3.cogalma();// b yumurtayla cogalırlar
        kartal3.omur(); // A  yasar ve olurler







    }
}
