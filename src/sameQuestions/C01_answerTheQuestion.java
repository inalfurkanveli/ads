package sameQuestions;


import java.sql.SQLOutput;
import java.util.Scanner;

public class C01_answerTheQuestion {
    public static void main(String[] args) {

        //------------SORU 1 ------------------//

        int yariCap=7;
        double piSayisi=3.14;

        double daireninCevresi=yariCap*2*piSayisi;
        double daireninAlan=piSayisi*yariCap*yariCap;

        System.out.println("Dairenin Alanı : "+ daireninAlan);
        System.out.println("Dairenin Cevresi: "+yariCap);

        //------------SORU2-------------------------//


        int kisaKenar=7;
        int uzunKenar=15;

        int dikdörtgenCevre=(kisaKenar+uzunKenar)*2;
        int dikdörtgenAlan=kisaKenar*uzunKenar;

        System.out.println("Dikdörtgen Alanı : "+ dikdörtgenAlan);
        System.out.println("Dikdötgenin Cevresi "+dikdörtgenCevre);

        //------------SORU 3 --------------------------//

        Scanner scanner=new Scanner(System.in);
        System.out.println("Lütfen ortalamasının hesaplanmasını istediğiniz sayiları giriniz: ");
        int sayi1=scanner.nextInt();
        int sayi2=scanner.nextInt();
        int sayi3=scanner.nextInt();
        int sayi4=scanner.nextInt();
        int sayi5=scanner.nextInt();

        int ortalama=(sayi1+sayi2+sayi3+sayi4+sayi5)/5;

        System.out.println("Sayiların ortalaması : "+ortalama+ " dır.");

        //-------------------SORU 4 --------------------------//

        System.out.println("Lütfen bir sayı giriniz ");
        int a=scanner.nextInt();

        int küpünYarisi=(a*a*a)/2;

        System.out.println(küpünYarisi);

        // -------------SORU 5 -----------------------------//

        System.out.println(" Lütfen Karenin bir kenar uzunluğunu giriniz : ");
        int kareninKenari=scanner.nextInt();



        int kareninAlanı= kareninKenari*kareninKenari;
        int kareninCevresi= kareninKenari*4;

        System.out.println("Karenin Alanı : "+ kareninAlanı);
        System.out.println("Karenin Cevresi : "+ kareninCevresi);

        //-------------SORU 6 ----------------------------------//

        System.out.println("Günde kac bardak cay ictiginizi ve kac adet seker kullangınızı giriniz : ");
        int cayAdedi=scanner.nextInt();
        int sekerAdedi=scanner.nextInt();

        int yillikCayAdedi= cayAdedi*365;
        double yillikSekerGrami=(sekerAdedi*365)*1.5;

        System.out.println("Yılda tükettiginiz cay adedi : "+ yillikCayAdedi);
        System.out.println("Yılda tükettiginiz seker kilosu:  "+(yillikSekerGrami)/1000);

        //-------------------- SORU 7 --------------------------------//

        System.out.println("Lütfen double türünde bir deger giriniz : ");
        double deger=scanner.nextDouble();

        int yeniDeger= (int) deger;

        System.out.println(yeniDeger);
        //---------------------SORU 8 ----------------------//

        System.out.println("Lütfen 3 basamaklı bir sayi giriniz : ");
        int ücBasamakliSayi=scanner.nextInt();

        int birlerBasamagi=0;
        int rakamlarToplami=0;

        birlerBasamagi=ücBasamakliSayi%10;
        rakamlarToplami=rakamlarToplami+birlerBasamagi;
        ücBasamakliSayi=ücBasamakliSayi/10;

        birlerBasamagi=ücBasamakliSayi%10;
        rakamlarToplami=rakamlarToplami+birlerBasamagi;
        ücBasamakliSayi=ücBasamakliSayi/10;

        birlerBasamagi=ücBasamakliSayi%10;
        rakamlarToplami=rakamlarToplami+birlerBasamagi;
        ücBasamakliSayi=ücBasamakliSayi/10;

        System.out.println("Girilen sayinin rakamlar toplamı : "+ rakamlarToplami);

        //--------------------SORU 9 -----------------//

        System.out.println("Lütfen  saat in kaç olduğunu giriniz . ");
        int saat=scanner.nextInt();
        System.out.println("Lütfen dakikayi giriniz ");
        int dakika=scanner.nextInt();
        System.out.println("Lütfen saniyeyi giriniz ");
        int saniye= scanner.nextInt();

        int hepsiSaniye=(saat*60*60)+(dakika*60)+saniye;


        System.out.println("Giridiginiz degerlerin saniye cinsinden degeri : "+ hepsiSaniye);

        //-------------SORU 10 --------------------------//

        System.out.println("Lütfen boy ve kilonuzu giriniz : ");
        int kilo= scanner.nextInt();
        int boy =scanner.nextInt();


        double vücutIndex=kilo/(boy*boy);

        if (vücutIndex<18.5){
            System.out.println(vücutIndex +" Vücut Index'sinize göre zayıfsınız . ");
        } else if (vücutIndex>=18.5 && vücutIndex <25) {
            System.out.println(vücutIndex+" Vücut Index'sinize göre kilonuz ideal. ");
        } else if (vücutIndex>25 && vücutIndex<30) {
            System.out.println(vücutIndex +"Vücut Index'sinize göre şişmansınız. ");
        } else if (vücutIndex>30) {
            System.out.println(vücutIndex +"Vücut Index'sinize göre obezsiniz. ");
        }
        //------------------SORU 11 ------------------//

        System.out.println("Lütfen Adinizin Basharfini  ve Soyadınızın basharfini giriniz. ");
        String isimBasHarf=scanner.nextLine();
        String soyIsımBasHarf=scanner.nextLine();
        System.out.println("Lütfen kredi kartı numaranızı giriniz.");
        String kreditCardNumber=scanner.nextLine();

        if(kreditCardNumber.length()==16){
            System.out.println(" İsim :  "+ isimBasHarf.toUpperCase().substring(0,1)
                    +isimBasHarf.substring(1).replaceAll("\\w", "*"));
            System.out.println("Soyisim : " + soyIsımBasHarf.toUpperCase().substring(0,1)
                    +soyIsımBasHarf.substring(1).replaceAll("\\w","*"));
        }
        else {
            System.out.println("Lütfen gecerli bir kart numarasi giriniz.");
        }

    }
}
