package CumaJavaPractis;

import java.util.Scanner;

public class C02_JavaPracticeDers2 {
    public static void main(String[] args) {
        /*
        Kullanicidan uc adet sayi alarak bu sayilarin
        bir dik ucgenin kenar uzunluklari olup olmadigini hesaplatan bir kod yaziniz
        NOT:
        Bir ucgenin dik oldugunu anlamak icin a2+b2=c2 pisagor
        denkleminden yararlanabilirsiniz.
        -----Ornek Ekran Ciktisi-----
                ilk kenari giriniz: 2
        ikinci kenari giriniz 15
        üçüncü kenari giriniz: 7
        Bu bir dik ucgen degildir.
                Bu bir dik ucgendir.

         */

        Scanner scanner=new Scanner(System.in);
        System.out.println("Lütfen ücgenin bir kenarını yazınız");
        int kenar1=scanner.nextInt();
        System.out.println("Ücgenin ikinci kenarını giriniz.");
        int kenar2=scanner.nextInt();
        System.out.println("Ücgenin ücüncü kenarını giriniz.");
        int kenar3=scanner.nextInt();

        if(((kenar1*kenar1)+(kenar2*kenar2))==kenar3*kenar3){
            System.out.println("Bu ücgen dik ücgendir.");

        } else if ((kenar3*kenar3)+(kenar1*kenar1)==(kenar2*kenar2)) {
            System.out.println("bu bir dik ücgendir.");

        }
        else if ((kenar3*kenar3)+(kenar2*kenar2)==(kenar1*kenar1)) {
            System.out.println("bu bir dik ücgendir.");
        }
        else {
            System.out.println("Bu ücgen dik ücgen degildir.");
        }

        System.out.println("====================== 2. Çözüm =========================");

        if( (kenar1*kenar1)+ (kenar2*kenar2) == (kenar3*kenar3) || (kenar2*kenar2)+(kenar3*kenar3)==(kenar1*kenar1) ||
                (kenar1*kenar1)+(kenar3*kenar3)==(kenar2*kenar2))
            System.out.println("Bu bir dik ücgendir.");
        else
            System.out.println("Bu bir dik ücgen degildir.");





    }
}
