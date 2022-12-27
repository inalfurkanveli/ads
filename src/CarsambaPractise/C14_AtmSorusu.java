package CarsambaPractise;

import java.util.Scanner;

public class C14_AtmSorusu {
    /*
      ATM
        Kullanicidan giriş için kart numarasi ve şifresini isteyin,
        eger herhangi birini yanlis girerse tekrar isteyin.
        Kart numarasi aralarda boşluk ile girerse de eger doğruysa kabul edin.
        Kart numarasi ve sifre dogrulanirsa kullanicinin yapabileceği işlemleri ekrana yazdirin,
        Menu listesinde Bakiye sorgula, para yatirma, para çekme, para gönderme, sifre değiştirme
        ve cikis islemleri olacaktır.
        Para çekme ve para gonderme işleminde mevcut bakiyeden buyuk para çekilemez,
        Para gönderme işleminde istenen iban TR ile baslamali ve toplam 26 karakterli olmali,
        eger değilse menü ekraninageri donsun.
        Sifre değiştirme işleminde mevcut şifreyi teyit ettikten sonra, sifre değişiklik işlemini yapmali,
     */

    static  String kartNo="12345";
    static int sifre=1234;
    static double bakiye=1200;
    static Scanner scanner =new Scanner(System.in);


    public static void main(String[] args) {

        int userPassword=0;
        String userCardNo="";
        System.out.println("***** Welcome to MyBank *****");

        do {

            System.out.println("Please enter the card no");
            String cardNo = scanner.nextLine();
            System.out.println("Please enter the password");
            userPassword= scanner.nextInt();

            userCardNo = cardNo.replaceAll(" ", "");
        } while (userPassword != sifre && ! userCardNo.equalsIgnoreCase(kartNo)) ;

        atmMenu();

    }

    private static void atmMenu() {

        System.out.println("Password correct!");
        int islem;
        do {

            System.out.println("\n" + "******* Lutfen islem seciniz *******\n" +
                    "\n\t\t1-> Bakiye sorgula\n\t\t2-> Para yatirma\n\t\t3-> Para cekme\n\t\t4-> Para gonderme"
                    + "\n\t\t5-> Sifre degistirme \n\t\t6-> Cikis\n");

             islem=scanner.nextInt();

            switch (islem){
                case 1:
                    bakiyeSorgulama();
                    break;


            case 2:
                paraYatirma();
                break;
                case 3:
                    paraCekme();
                    break;
                case 4:
                    paraGonderme();
                    break;
                case 5:
                    sifreDegistirme();
                    break;
                case 6:
                    cikis();
                    break;
                default:
                    System.out.println("Yanlış giriş yaptınız:");
            }
        } while (islem != 6);

        }
        public static void cikis(){
            System.out.println("Cikis yapıldı.");

        }
        public static void sifreDegistirme(){
            System.out.println("Mevcut Sifrenizi Giriniz ");
            int yeniSifre=scanner.nextInt();
            if (sifre==yeniSifre){

                System.out.println("\n Sifreniz onaylandı! Lütfen yeni sifrenizi giriniz : \n");
                int sifreYeni=scanner.nextInt();

                sifre=sifreYeni;
                System.out.println("Islem Tamamlandı! \n");

            }else {
                System.out.println("İslem basarısız! \n Sifreler eslesmiyor.");
            }


        }

    private static void paraGonderme() {
        System.out.println("Toplam Bakiyeniz: "+ bakiye);

        String ibanNumber="";

        do {
            System.out.println("Lütfen IBAN numarası giriniz: ");
            ibanNumber=scanner.nextLine();

            if (!ibanNumber.startsWith("TR")){
                System.out.println("IBAN TR ile başlamalıdır.");
            }
            scanner.nextLine();

            if(ibanNumber.length()!=26){
                System.out.println("Yanlış giriş yaptınız. Iban No 26 karakterden oluşmaktadır.");
            }
        }while (!ibanNumber.startsWith("TR") && ibanNumber.length()!=26);

        double gonderilecekTutar;

        do {
            System.out.println("Lutfen Gondermek istediginiz tutarı giriniz: ");
            gonderilecekTutar=scanner.nextInt();

            if (bakiye<gonderilecekTutar){
                System.out.println("Bakiye Yetersiz.");
            }
        }while(bakiye>gonderilecekTutar);
        System.out.println("İsleminiz Gerçekleştirildi.\n Yeni Bakiyeniz: "+ bakiye);

    }

    public static void paraCekme() {
            System.out.println("Toplam Bakiyeniz: " + bakiye);
            double cekilenTutar =0;
            do {
                System.out.println("Lütfen cekmek istediginiz miktarı giriniz: ");
                double cekilentutar = scanner.nextDouble();
                if (cekilentutar > bakiye) {
                    System.out.println("Bakiye Yetersiz.");
                }

            } while (bakiye < cekilenTutar);
            bakiye -= cekilenTutar;
            System.out.println("Yeni Bakiyeniz: " + bakiye);
        }


    public static void paraYatirma() {
        System.out.println("Toplam Bakiyeniz: " +bakiye);
        System.out.println("Lütfen yatırmak istediğiniz tutarı giriniz: ");
        double yatırılanTutar= scanner.nextDouble();
        bakiye+=yatırılanTutar;
    }

    public static void bakiyeSorgulama() {
        System.out.println("Toplam Bakiyeniz: " + bakiye);

    }


}



