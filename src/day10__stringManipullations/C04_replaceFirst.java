package day10__stringManipullations;

public class C04_replaceFirst {
    public static void main(String[] args) {

        String str="Java heyecandir.";

     //   str.replaceFirst("a","A");

        // ilk harf veya rakamı * yap

        System.out.println(str.replaceFirst("\\w", "*"));

        String str1=str.replaceFirst("\\w","*");
        System.out.println(str1);

    }
}
