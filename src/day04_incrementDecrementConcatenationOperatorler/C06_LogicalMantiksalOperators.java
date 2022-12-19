package day04_incrementDecrementConcatenationOperatorler;

public class C06_LogicalMantiksalOperators {
    public static void main(String[] args) {

        /*
        1- And (ve) operatörü &&//&

        Mantıktaki AND operatörünün Java'da 2 tane karsılığı vardir. İslevleri ayni olmakla
        birlikte iç isleyisi ve hız acisindan aralarında küçük fark vardir.

        && operatörü birlestirdiği 2 boolean ifadenin ikiside true ise sonucu true yapar,
        bunun dışındakki tüm durumlarda sonucu false yapar ( && operatörü mükemmelliyetçidir)

        && ile & ' in farkı
        -----------------------------
        && operatoru birbirine bağlı mantıksal ifadeleri incelerken ilk false değeri ile karşılaştığında,
        sonucun false olacağini algılar ve geriye kalan mantiksal ifadeleri incelemeden hemen sonucu false
        olarak atar.

        & operatörü ise birbirine bağlı mantıksal ifadeleri incelereken, herbir mantiksal ifadenin sonucuna göre
        karar vermez,islemin sonucuna kadar gider. Tüm işlem bittikten sonra sonuca atama yapar.

        && operatörü tüm mantıksal ifadeleri kontrol etmeden sonuca gidebildiği için daha hızlıdır.

        int a=10;
        int b=15;

        System.out.println(a<b && b<10 && b>=a &&a<0);
        System.out.println(a<b & b<10 & b>=a & a<0);

        2-- OR operatörü   ||
        Mantiktaki OR operatörü ile ayni sekilde kullanılir.

        || operatörü birleştirdiği iki mantiksal ifadenin ikikside false ise sonucu false yapar.
        Ancak bunun dışında ki tüm durumlarda sonucu true yapar. ( OR operatörü iyimserdir.)


         */
    }
}
