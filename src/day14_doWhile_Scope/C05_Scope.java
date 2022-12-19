package day14_doWhile_Scope;

public class C05_Scope {
    int sayi= 14;
    static int number;
    public static void main(String[] args) {

        String mainStr="Java";
        number=10;

        for (int i = 0; i <10 ; i++) {
            int toplam=i;
        }
      //  System.out.println(toplam);
      //  System.out.println(i);
    }

public static  void method1(){
        String method1Str="güzeldir";
        number=15;
}
public void method2(){
        String method2Str="candır";

        number=20;
}
}
