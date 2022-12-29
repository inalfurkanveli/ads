package day26_Inheritance;


class Okul{
   String okulIsmi="Yıldız Koleji";
   String telefon="3123456543";

}

public class C01_Sınıf extends Okul{

    String sinif="11-F";
    String telefon="3123456543";
    C01_Sınıf(String telefon){
        System.out.println(telefon); // scope daki telefona bak
        System.out.println(this.telefon); // scope'u atla class'dan aramaya başlar
        System.out.println(super.telefon); // scope ve class'taki telefonu atla parent class'daki veriable yazdırır.


        System.out.println(okulIsmi); // yıldız koleji
        System.out.println(this.okulIsmi); // yıldız koleji
        System.out.println(super.okulIsmi); // yıldız koleji

        System.out.println(sinif); // 11 -c
        System.out.println(this.sinif); // 11-C
      //  System.out.println(super.sinif); // Eğer aranan veriable parend Class'da yoksa child class'a dönmez .
        // parent class'da aranan sinif veriable'i yoksa CTE verir.
    }

    public static void main(String[] args) {
        C01_Sınıf obj = new C01_Sınıf("4226542323");
    }
}
