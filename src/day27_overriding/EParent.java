package day27_overriding;

public class EParent extends DGrandParent{


    @Override
    protected void method1() {
        System.out.println("P method1");

        // @override notasyonu overriden method ile overriding methodu ilişiklendirir
        // eger overriden method'ta bu ilişkiyi bozacak bir degisiklik yapılırsa @override notasyonu
        // CTE verir
    }
    protected  void method2(){
        System.out.println("P method2");
    }

    private  void method3(){
        System.out.println("P method3");
    }


}
