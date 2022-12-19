package day21_staticKeyword;

public class C04_PassByValue {
    public static void main(String[] args) {

        int fiyat=100;
        System.out.println(indirimYap10(fiyat));
        System.out.println(indirimYap20(fiyat));
        System.out.println(indirimYap30(fiyat));



    }
    public static int indirimYap10(int fiyat){

        fiyat=fiyat*90/100;

        return fiyat;
    }
    public static int indirimYap20(int fiyat){

        fiyat=fiyat*80/100;

        return fiyat;
    }
    public static int indirimYap30(int fiyat){

        fiyat=fiyat*70/100;

        return fiyat;
    }
}
