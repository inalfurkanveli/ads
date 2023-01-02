package day27_overriding;

public class FChild extends EParent{
    @Override
    protected void method2() {
        super.method2();

        // eger overriding method ile birlikte overriden method'da calıssın istersek
        // overridding method içinden super.method2(); yazabilirz.
    }

    @Override
    protected void method1() {
        super.method1();
    }

    public void method3(){
        System.out.println("Child method");
        // Parent class'da aynı isimde method olmasına ragmen
        // override olarak görülmedi
        // sebep: parent daki method 3 private access modifier'a sahip oldugundan
        // onu ayrı bir method olarak görür override olarak görnez
    }
}
