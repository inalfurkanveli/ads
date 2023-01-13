package BenimAlistirmalar.MDA;

public class MDA2 {
    /*
   Verilen 2 katli bir array’de her bir inner array’in son elementlerinin
toplaminini yazdiran bir method olusturun
     */
    public static void main(String[] args) {

        int[][] arr = {{3,1,2,4},{1,2,3,5,6},{3,4,5},{10,2,3,4},{2,7,1,2}};
        innerArraySonElemanTopla(arr);
    }

    private static void innerArraySonElemanTopla(int[][] arr) {
        int toplam=0;
        for (int i = 0; i < arr.length ; i++) {
            toplam+= arr[i][arr[i].length-1];

            }
            System.out.println(toplam);
        }



    }

