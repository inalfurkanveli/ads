package day24_StringBuilder;

public class EncapsuleClass {
    public void setSatis(int satis) {
        this.satis = satis;
        toplamSatis+= this.satis;
    }



    /*
        // Java class uyelerine erisimin write and read olarak
        ayrilması istendiğinde Encapsulation kullanilir.

        Bunun için oncelikle bu class uyelerine normal yollarla erisim
        kapatılır.

        sonra istedigimiz yetkiyi verecek public method oluştururuz.
    */



    public int getToplamSatis() {
        return toplamSatis;
    }

    private int satis ; // satis bölümünden değer girilebilsin ama değeri gorunmesin -- setter
    private int toplamSatis=0; // gorulebilsin ama degistirilmesin -- getter

    public int getHalkaAcikSayi() {
        return halkaAcikSayi;
    }

    public void setHalkaAcikSayi(int halkaAcikSayi) {
        this.halkaAcikSayi = halkaAcikSayi;
    }

    private int halkaAcikSayi=10; // herkese açık olsun.

}
