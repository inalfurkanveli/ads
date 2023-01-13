package CumaJavaPractis;

import java.util.ArrayList;
import java.util.List;

public class C11_FibonacciNumbers {
    /*
     * Write a method which accepts an integer as parameter
     * and returns “true” if it is a Fibonacci number
     *
     * Then check the result and print
     * “Fibonacci series contain your number” or
     * “Fibonacci series contain that numbers : X and Y”
     * (X and Y should be the closest Fibonacci numbers to given number X<num<Y)
     */
    static boolean fibo ;
    static int x;
    static int y;

    public static void main(String[] args) {

        int input=123;

        if (fibo) System.out.println("Fibonacci series contain your number :"+ input);
        else System.out.println("Fibonacci series contain that numbers : "+x +" and "+ y + " .");
        fibonacciNumbersCheck(124);



    }

    public static boolean fibonacciNumbersCheck(int input){


        if(input<0){
            System.out.println("Fibonacci sayisi 0'dan küçük olamaz");

        }

        List<Integer> fibonacci = new ArrayList<>();

        fibonacci.add(0);
        fibonacci.add(1);
        for (int i = 2; i <input ; i++) {
            fibonacci.add(fibonacci.get(i-1)+ fibonacci.get(i-2));

            if (fibonacci.get(i)>=input){
                break;
            }
            
        }

        System.out.println(fibonacci);
        if (fibonacci.get(fibonacci.size()-1)==input)
            fibo=true;
        else fibo=false;

         y= fibonacci.get(fibonacci.size()-1);
         x= fibonacci.get(fibonacci.size()-2);



        return  fibo;
    }
}
