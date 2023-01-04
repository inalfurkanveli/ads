package day29_final_abstractClasses;

public  class EChild extends DParent {

     /*
     Klasik inheritance ile parent child iliskisi olusturdugumuzda
     Parent class'daki tüm özellikleri otomatik olarak kazanırız
     Ancak methodları override etme MECBURİYETİ YOKTUR
     İster override edip kendimize özelleştiririzç
    İstersek de parent class'daki haliyle kullanırız.
      */


        @Override
        public void method1() {
            System.out.println("parent class'daki mecburi override edilecek method1'i override ettik");
        }

        @Override
        public void method2() {
            System.out.println("parent class'daki mecburi override edilecek method2'i override ettik");


        }

        public static void main(String[] args) {

            // DParent obj1=new DParent();
            // 'DParent' is abstract: cannot be instantiated
            // Abstract class'lari constructorlari vardır ama OBJE ÜRETİLEMEZ.

            EChild chld1 = new EChild();
            chld1.method1(); // parent class'daki mecburi override edilecek method1'i override ettik
            chld1.method2(); // parent class'daki mecburi override edilecek method1'i override ettik
            chld1.method3(); // Parent class'daki method 3 calisti
            DParent chld2 = new EChild();
            chld2.method1();
            chld2.method2();
            chld2.method3();


        }

    }



