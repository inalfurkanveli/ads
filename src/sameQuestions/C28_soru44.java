package sameQuestions;


import java.util.Scanner;

public class C28_soru44 {
    public static void main(String[] args) {

        String firstName="Ahmet ";
        int age=38;
        String job="Müzisyen";
        String lastName="Kaya ";


        ChangeName(firstName,age,job,lastName);
        LastNameChange(lastName);

    }

    private static void ChangeName(String firstName, int age, String job, String lastName) {
        firstName="Müslüm ";
        age=40;
        job="Arabesk";
        lastName="Gürses";

        System.out.println("First Name : "+ firstName +"\n"+
                "Age : "+ age +"\n"+
                " Job : "+ job+"\n"+
                "Last Name: "+ lastName);

    }
    public static String LastNameChange(String lastName){
        Scanner scanner=new Scanner(System.in);
        System.out.println("Please enter the last name ");
        String newLastName = scanner.next();

        System.out.println(newLastName);
         return newLastName;


    }

}
