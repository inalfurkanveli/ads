package day16_Arrays;

import java.util.Arrays;

public class C10_ArrayeBirElementEkleme {
    public static void main(String[] args) {
        String[] isimler={"Ali","Veli","Can"};
        String eklenecekIsim="Kemal";


      isimler=arrayeEkleme(isimler,eklenecekIsim);

        System.out.println(Arrays.toString(isimler));
    }

    public static String[] arrayeEkleme(String[] eklenecekArray,String eklenecekElement){
        String[] temp=new String[eklenecekArray.length+1];

        for (int i = 0; i <eklenecekArray.length ; i++) {
            temp[i]=eklenecekArray[i];
        }
        temp[temp.length-1]=eklenecekElement;

         return temp;
    }
}
