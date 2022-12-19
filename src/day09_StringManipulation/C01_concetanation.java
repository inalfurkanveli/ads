package day09_StringManipulation;

public class C01_concetanation {
    public static void main(String[] args) {


        String str1 = "java";
        String str2 = "candır";

        System.out.println(str1+ " "+ str2);

        System.out.println(str1.concat(str2));// java candır

        System.out.println(str1.concat(" ".concat(str2)));
        
    }
}
