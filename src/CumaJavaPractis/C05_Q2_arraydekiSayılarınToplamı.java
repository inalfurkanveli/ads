package CumaJavaPractis;

public class C05_Q2_arraydekiSayılarınToplamı {
    public static void main(String[] args) {

        /*
        //Create an array of 5 floats and calculate their sum.
         */

        float[] array1={3.3f,4.6f,5.9f,6.0f,7.2f};

        float sum=0;

        System.out.println("***************** FOR LOOP COZUMU *******************");
        for (int i = 0; i <array1.length ; i++) {

            sum+=array1[i];

        }
        System.out.println("The Sum of numbers: "+ sum);

        System.out.println("******************** WHILE İLE COZUMU 1 ********************");

       float toplam=0;
        int index=0;
        while (index<array1.length){


            toplam+=array1[index];

            index++;



        }
        System.out.println(toplam);


        System.out.println("******************* WHILE LOOP COZUMU 2********************** ");
        float toplam1=0;
        int ind= array1.length-1;
        while (ind>=0){


            toplam1+=array1[ind];

            ind--;



        }
        System.out.println(toplam1);

    }
}
