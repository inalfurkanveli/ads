package BenimAlistirmalar;

public class C03_arrayAlistirma3 {
    public static void main(String[] args) {
        int[][] array1 = new int[10][10];

        for (int i = 0; i < 10 ; i++) {
            for (int j = 0; j <10 ; j++) {


                System.out.print("*" + array1[i][j]);
            }
            System.out.println();

        }



    }
}

/*
for(int i = 0; i < 10; i++)
   {
      for(int j = 0; j < 10; j++)
      {
         System.out.printf("%2d ", a[i][j]);
      }
      System.out.println();
   }
 */