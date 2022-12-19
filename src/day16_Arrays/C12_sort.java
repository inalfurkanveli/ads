package day16_Arrays;

import java.util.Arrays;

public class C12_sort {
    public static void main(String[] args) {

        // verilen bir array'i Natural Order'a göre sıralayıp yazdırın.


        String[] isimler={"yusuf","mehmet","hüseyin","akile","said","Mehmet","ahmet","adnan"};

        System.out.println(Arrays.toString(isimler));

        Arrays.sort(isimler);

        System.out.println(Arrays.toString(isimler)); // [akile, hüseyin, mehmet, said, yusuf]



        // Eger büyükten kücüge sıralamak istersek önce sort kullanarak natural order'a göre sıralar
        // sonra gecici bir array kullanarak siralamayı terse ceviririz.




    }
}
