package sameQuestions;

public class C01_tersUcgen {
    public static void main(String[] args) {
        
        /*
        ********* ---9
         *******  ----7 
          *****  ----5 
           ***   ----3
            *    ----1 
             
             
           satır sayısı, bosluk,   yıldız basımı. , sonraki satıra geçme.

           
           
           
         */
        int satirSayısı = 5;


        for (int i = satirSayısı; i >= 1; i--) {

            for (int j = 1; j <=satirSayısı-i ; j++) {
                System.out.print(" ");


            }
            for (int j = 1; j <=2*i-1 ; j++) {
                System.out.print("*");
            }
            System.out.println("");
        }
    }
}
