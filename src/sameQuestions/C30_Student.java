package sameQuestions;

public class C30_Student {
    String ad;
    String soyAd;
    int yas ;
    String Cinsiyet;
    String Okul="";
    public C30_Student(String ad,String soyAd,int yas,String Cinsiyet,String Okul) {
        this.ad = ad;
        this.soyAd = soyAd;
        this.yas = yas;
        this.Cinsiyet = Cinsiyet;
        this.Okul = Okul;



    }
    public String toString() {
        return "Student{" +
                "ogrencininAdi='" + ad + '\'' +
                ", age=" + yas +
                ", gender=" + Cinsiyet +
                ", school='" + Okul + '\'' +
                '}';
    }




    public static void main(String[] args) {

    }
}
