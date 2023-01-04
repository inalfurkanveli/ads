package day29_final_abstractClasses;

public abstract class DParent {


    public abstract void  method1();

        //Child Class'ların tamamında method1 ve
        // method2'nin mutlaka olmasını istiyoruz

        /*
        Java parent class'daki istenen methodları child class'ların override etmek
        ZORUNDA KALMASI için absstract class'ini olusturmustur.

        Bir class'i abstract yapmak istersek class deklarasyonnuna abstract yazmamız yeterlidir.

        Bir abstract class'in icinde child class'ların override etmesi
        MECBURİ olan method'lar olabilecegi gibi MECBURİ olmayan methodlarda olabilir.

         Child class'larin mutlaka override edilecegi methodların kod bodysine ihtiyac yoktur.

        abstract yapılan tüm methodlar child class'larin tamaminda override edileceginden
        parent class'daki abstract methodun body'e ihtiyacı olmaz.

       Java'da abstract methodların body'si olmasına izin vermez.

      Abstract class'larda abstract methodlar bulundugu için abstract class'lardan obje oluşturamayız.
         */

    public  abstract void method2();


    public void method3(){
        System.out.println("Parent class'daki method3 çalştı.");
    }
}
