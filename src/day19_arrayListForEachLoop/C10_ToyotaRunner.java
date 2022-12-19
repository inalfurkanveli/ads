package day19_arrayListForEachLoop;

public class C10_ToyotaRunner {

    public static void main(String[] args) {

        C09_Toyota toyota1= new C09_Toyota();

        System.out.println(toyota1.marka+ ", "
                            + toyota1.model+", "
                            +toyota1.yıl+", "
                            +toyota1.km+","
                            +toyota1.renk+", ");

        toyota1.model="Avensis";
        toyota1.yıl=2022;
        toyota1.km=1200;
        toyota1.renk="Kırmızı";

        System.out.println(toyota1.marka+ ", "
                + toyota1.model+", "
                +toyota1.yıl+", "
                +toyota1.km+","
                +toyota1.renk+", ");   // Toyota, Avensis, 2022, 1200,Kırmızı

    }
}
