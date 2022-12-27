package day24_StringBuilder;

public class D {

    private  String isim="Mustafa";

    // static olmadığından , static main method içinden direk
    // kullanılmaz

    public static void main(String[] args) {

        D obj1=new D();
        System.out.println(obj1.isim); // mustafa

        staticMethod(); // furkan
        System.out.println(obj1.isim); // mustafa
    }

    private void staticOlmayanMethod(){
        isim="Hüseyin";
        System.out.println(isim);
    }
    private static void staticMethod(){
        D obj1 = new D();

        obj1.isim="Furkan";
        System.out.println(obj1.isim);
    }
}
