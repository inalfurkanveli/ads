package day20_Constructor;

public class C02_Constructor {
    public static void main(String[] args) {
        /*
        Bir obje oluşturulurken istediğimiz özellikleri direk atayabilirsek sonradan tekrar bir atama
        işlemi yapmama gerek kalmaz.

        Bu durumda atamayı tek tek bizim yapmamız yerine constructorun atama yapmasını istemeliyiz.

        Atama yapmak için constructor a parametre göndermeliyiz.
         */



        Car car1=new Car("mercedes","e200",2012,20000,"siyah");
        /*
              Car{marka='mercedes'
                , model='e200'
                , yıl=1900
                , km=20000
                , renk='siyah'}
         */

        System.out.println(car1);


        Car car2=new Car("Tofaş","Şahin",2010);
        System.out.println(car2);


        /*
        Bir class'ta görünür bir constructor yazdığımda veya oluşturduğumuzda
         Java default constructoru siler.
         Bu durumda daha önceden default constructor'u kullanarak obje oluşturan classlarda CTE oluşur.
         Bu tür sorunlara sebep olmamak için biz her hangi constructor oluşturduğumuzda bir tane de
         parametresiz constructor oluştururuz.

         Constructor'da parametre olarak kullanıcıdan gelen degeri class'level daki instance veriable'a
         atamalıyız.
         Eğer parametre ismi ile instance veriable ismi farklı ise sorun yok.
         Java otomatik olarak atamayı anlayacaktır.

         public Car(String mrk,String mdl,int yl,int kmetre,String rnk){
         marka = mrk;
        model = mdl;
        yl = yıl;
        km = kmetre;
        renk = rnk;
         }

         Eğer parametre isimlerini anlaşılabilir olması için instance veriable ile aynı yaparsak
         Java hangisinin parametre hangisinin instance veriable oldugunu bilmesi gerekir.
         Bu durumda instance veriable'i belirtmek için basina this. koymamız gerekir.

          public Car(String marka,String model,int yıl){
        this.marka=marka;
        this.model=model;
        this.yıl=yıl;


         */

        Car car3=new Car("Toyota","Supra",2015,"gri");

        System.out.println(car3);
        /*
        Car{marka='Toyota'
            , model='Supra'
            , yıl=2015
            , km=0
            , renk='gri'}
         */
    }
}
