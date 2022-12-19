package day14_doWhile_Scope;

public class C04_DoWhileQuestion2 {
    public static void main(String[] args) {

        /*
        Kullanıcıdan bir pozitif sayi alınız
        sayının tam kare olup olmadığını bulunuz.
        tamkare ise true değilse false
         */

        int input=49;
        int karekok=1;
        boolean sonuc=false;


        while(karekok*karekok<= input){

            if(karekok*karekok==input){
                System.out.println("Girilen sayinin karekoku = " + karekok);
                sonuc=true;
                break;
            }else {
                karekok++;
            }
        }
        System.out.println(sonuc);

        // do while ile yapalım

        input=144;
        karekok=1;
        sonuc=false;

        do {
            if(karekok*karekok==input){
                System.out.println("Girilen sayinin karekoku = " + karekok);
                sonuc=true;
                break;
            }else {
                karekok++;
            }

        }while(karekok*karekok<=input);
        System.out.println(sonuc);

    }
}
