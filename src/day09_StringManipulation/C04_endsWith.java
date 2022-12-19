package day09_StringManipulation;

import java.util.Scanner;

public class C04_endsWith {
    public static void main(String[] args) {

        /*
        String str= "Java ogrenen issiz kalmaz";

        System.out.println(str.endsWith("kalmaz")); // true

        System.out.println(str.endsWith("Java ogrenen issiz kalmaz")); //true

        System.out.println(str.endsWith(""));// true

         */
/*
        kullanicidan bir mail alin
        - mail @ icermiyorsa "gecersiz mail"
                - mail @gmail.com icermiyorsa, "mail gmail olmali"
                - mail @gmail.com ile bitmiyorsa, "mailde yazim hatasi var"

 */

        Scanner scan= new Scanner(System.in);
        System.out.println("Lütfen bir mail giriniz.");
        String mail=scan.nextLine();

        if(!mail.contains("@")){
            System.out.println("Girilen mail gecersiz.");

        }
        else if(!mail.contains("@gmail.com")){
            System.out.println("Girilen mail gmail olmalidir.");
        }
        else if(!mail.endsWith("@gmail.com")){
            System.out.println("Girilen mailde yazım hatası var");
        }
    }
}
