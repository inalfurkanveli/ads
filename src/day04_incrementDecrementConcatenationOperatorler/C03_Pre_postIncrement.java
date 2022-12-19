package day04_incrementDecrementConcatenationOperatorler;

public class C03_Pre_postIncrement {
    public static void main(String[] args) {

        int a= 10;

        int b=a++;

        int c =++a;

        System.out.println(a+","+b+","+c);


        int x=20;
        int y =++x;
        int z=y++;

        System.out.println(x+","+y+","+z);
    }
}
