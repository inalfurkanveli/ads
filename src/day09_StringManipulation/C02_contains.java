package day09_StringManipulation;

public class C02_contains {
    public static void main(String[] args) {
        String str= "Java ogren mutlu ol";

        // str mutlu içeriyor mu

        str.contains("mutlu");

        System.out.println(str.contains("mutlu")); // true

        // charSequence : char dizisi , char zinciri


        System.out.println(str.contains("j")); // false
        System.out.println(str.contains(" ")); // true

        // contains metodu kaç tane oldupuna değil sadece var olup olmadığına bakar.

    }
}
