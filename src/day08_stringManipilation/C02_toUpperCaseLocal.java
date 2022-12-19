package day08_stringManipilation;

import java.util.Locale;

public class C02_toUpperCaseLocal {
    public static void main(String[] args) {
        String str="JAVA CANDIR";

        System.out.println(str.toLowerCase()); //java candir

        str=str.toLowerCase(Locale.forLanguageTag("Tr"));

        System.out.println(str);

        str="sevgi insanı hayata bağlar.";
        System.out.println(str.toUpperCase());
    }
}
