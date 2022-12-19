package day20_Constructor;

public class Car {

   /*
   Bir class'dan olusturulabilecek objelerin özelliklerini
   veriable veya method'larla belirleyebiliriz.
    */

    String marka = "Marka belirtilmemiş";
    String model = "Model belirtilmemiş";
    int yıl = 1900;
    int km ;
    String renk ="Renk belirtilmemiş";

    public Car(){

    }

    public Car(String marka,String model,int yıl){
        this.marka=marka;
        this.model=model;
        this.yıl=yıl;

    }

    public Car(String marka, String model, int yıl, String renk) {
        this.marka = marka;
        this.model = model;
        this.yıl = yıl;
        this.renk = renk;
    }

    public Car(String mrk, String mdl, int yl, int kmetre, String rnk) {

        // KULLANICININ VERDİĞİ DEĞERLERİ İNSTANCE DEGERELER ATAMA YAPTIK.
        marka = mrk;
        model = mdl;
        yl = yıl;
        km = kmetre;
        renk = rnk;

    }


    public static void hareket(){
        System.out.println("Tum arabalar hareket eder.");

    }


    @Override
    public String toString() {
        return "Car{" +
                "marka='" + marka + '\'' +
                "\n, model='" + model + '\'' +
                "\n, yıl=" + yıl +
                "\n, km=" + km +
                "\n, renk='" + renk + '\'' +
                '}';
    }

}

