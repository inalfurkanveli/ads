package BenimAlistirmalar.MDA;

public class MDA1 {
    /*
     Verilen 2 katli bir array’de bulunan tum sayilarin carpinini bize donduren bir
method olusturun.
     */
    public static void main(String[] args) {

        int[][] arr = {{3,1,2,4},{1,2},{3,4,5},{10},{2,7}};
        mdaElemanlarınıCarp(arr);
    }

    private static void mdaElemanlarınıCarp(int [][] arr) {
        int carpimlar=1;
        for (int i = 0; i < arr.length ; i++) {
            for (int j = 0; j <arr[i].length ; j++) {
                carpimlar*=arr[i][j];
            }
        }
        System.out.println(carpimlar);

    }
}
