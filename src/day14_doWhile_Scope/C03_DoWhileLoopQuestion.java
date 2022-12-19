package day14_doWhile_Scope;

public class C03_DoWhileLoopQuestion {
    public static void main(String[] args) {
        // verilen baslangic ve bitis karakterlerini dahil
        // aradaki tüm karakterleri yazdırın

        char baslangic = 'd';
        char bitis = 'm';

        do {
            System.out.print(baslangic + " ");
            baslangic = (char) (baslangic + 1);
        } while (baslangic <= bitis);
    }
}

