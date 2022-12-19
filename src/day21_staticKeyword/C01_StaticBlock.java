package day21_staticKeyword;

public class C01_StaticBlock {

    C01_StaticBlock(){
        System.out.println("Constructor calisti");

    }

    public static void main(String[] args) {
        System.out.println("Main method calisti.");
    }

    static {

        // static block'lar class'taki tüm yapılardan hatta main method'tan bile
        // önce çalışır.
        // Static block'ta istedigimiz bir veriable'a başlangıç degerinin atanması,kullanıcıdan yetki sorgulaması
        // gibi işlemler yapılabilir.
        // method'ların sıralaması java açısından önemli değildir.
        // ancak birden fazla static block , kendi aralarında önce üstteki çalışır.
        System.out.println("Yukarıdaki  Static block calisti");

    }
    static {

        System.out.println("Alttaki Static block calisti");

    }
}
