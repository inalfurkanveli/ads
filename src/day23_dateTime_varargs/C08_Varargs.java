package day23_dateTime_varargs;

public class C08_Varargs {
    public static void main(String[] args) {
        /*
        Argument olarak tam sayılar alıp
        ilk argument hariç geriye kalanları
        toplayıp bulunan toplamı ilk argument ile
        çarpıp sonucu yazdıran bir method olusturun
       (Not argument sayısı degisken olabilir)
         */

        islemYap(3,4,5,8,1,2);
        islemYap(5,1); // 5
        islemYap(4); // 0
        islemYap(3,4,5,6); // 45
    }

    private static void islemYap(int ilksayi,int... geriyeKalanlar ) {
        int toplam=0;
        for (Integer each:geriyeKalanlar
             ) {
            toplam +=each;

        }
        System.out.println(toplam*ilksayi); // 60
    }
}
