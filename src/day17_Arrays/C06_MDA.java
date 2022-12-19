package day17_Arrays;

public class C06_MDA {
    public static void main(String[] args) {
         // Verilen iki katlı bir string array'de
        // istenen metni iceren elementleri yazdiran bir method olusturun

        String[][] arr={{"Ali","Zafer"},{"Betül","Hasan","Mehmet"},{"Furkan"}};

        String arananMetin="e";

        istenenElementleriYazdir(arr,"e");
    }
    public static void istenenElementleriYazdir(String[][] arr, String arananMetin){

        for (int i = 0; i <arr.length ; i++) {
            for (int j = 0; j <arr[i].length ; j++) {

                if (arr[i][j].contains(arananMetin)){
                    System.out.print(arr[i][j]+ " ");
                }
            }
        }

        System.out.println("");

    }
}
