package day15_scope_arrays;

public class C04_Arrys {
    public static void main(String[] args) {
        int [] arr={1,2,3}; // bu sekilde yazildiginda kac element yazildi ise onu length olarak kabul eder.
        int arr2[]={4,5,6};

        String [] harfler=new String[4];


        System.out.println(arr.length); // 3
        System.out.println(arr2.length); // 3
        System.out.println(harfler.length);// 4000

        // Stringde kullandığımız harfler.length() bir method iken
        // Arry deki length method degil veriable'dir.   arr.length
    }
}
