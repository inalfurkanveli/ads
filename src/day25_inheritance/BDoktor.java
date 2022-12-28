package day25_inheritance;

public class BDoktor extends APersonel{
    /*
    Olusturdugumuz doktor class'inda
    isim,soyisim gibi personel class'inda olusturulan
    tüm özelliklerin olmasını istiyoruz
    Bu durumda 2 tercih var
    1-istenen tüm özellikleri doktor class'ında yeniden
    olusturabilirsiniz
    2- Doktor Class'ini personelin child'i yapmak

    Doktor Class'ini personel class'inin child'i yaptıgımızda
    Doktor Class'indan oluşturulan objeler
    sadece kendi class'larında ki özelliklere sahip olmaz
    ayni zamanda parent class'i olan personeldeki
    ozelliklerede sahip olurlar.

    Bir child class'dan obje oluşturdugumuzda o objenin ozelliklerini
    belirlerken once kendi class'ına bakılır.
    O ozellik varsa kullanılır.
    Eger kendi class'inda yoksa parent class'a bakılır.

    Bir class extends keyword kullanarak baska bir class'i
    kendisine parent edinirse
    1-parent class'daki tüm özellikleri direk kullanabilir
    (isim,soyisim,telefon,ozel sigorta)
    2- Isterse parent class'da olan bir özelliği kendisine uyarlayabilir
    (maas)
    3- isterse parent class'da olmayan kendisine özel
    yeni özellikler oluşturabilir
    (nobet)
     */

    public static void main(String[] args) {
        BDoktor doktor1=new BDoktor();
        doktor1.isim="Kemal";
        doktor1.soyIsim="Bulut";

        System.out.println(doktor1.isim+","+doktor1.soyIsim+","+doktor1.telefon);
        // Kemal,Bulut,Telefon atanmadı

        doktor1.maas(); // Doktor maasi 30*8*25 6000
        doktor1.ozelSigorta(); // tum personel ozel saglik sigortası yaptırılır.
    }
    public void maas(){
        System.out.println("Doktor maasi 30*8*25 " +6000);

    }
    public void nobet(){
        System.out.println("Doktorlar haftada bir gun nobet tutar.");
    }
}
