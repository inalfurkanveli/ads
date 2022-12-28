package day25_inheritance;

public class APersonel {

  protected   String isim="Isim atanmadı";
  protected   String soyIsim="Soyisim atanmadı";
  protected   String telefon="Telefon atanmadı";

    protected void maas(){
        System.out.println("Hastanemizde uygulanan asgari ücret : "+1700);

    }
    protected void ozelSigorta(){
        System.out.println("tum personel ozel saglik sigortası yaptırılır.");
    }
    private void praviteMethod(){
        System.out.println("Private Method");
    }
}
