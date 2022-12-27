package day24_StringBuilder;

public class C04_AccessModifier {
    String str;
    // Access modifier'i gözlerimizle göremiyorsak
    // default access modifier var demektir.

    // bu class'da default consturactor var
    // str'in değeri null ( default deger)
    // str'in access modifier'i default access modifier


    public static void main(String[] args) {

        D obj1 = new D();
        System.out.println(obj1.isimDefault); // Furkan
        obj1.defaultStaticOlmayanMethod();// default access modifier'li static olmayan method çalıştı.

        // baska class'lardaki class üyelerine erisimde
        // access modifier ve static keyword 'u dikkate alınmalidir.
        // static class üyelerini obje üzerinden kullanmaya gerek yoktur.
        // ille de obje üzerinden kullanmak isterseniz
        // class üyesinin ismini yazmaniz gerekir.

        System.out.println(obj1.isimDefaultStatic); // Sevilay
        System.out.println(D.isimDefaultStatic); // Sevilay

        obj1.defaultStaticMethod();
        D.defaultStaticMethod();

    }
}
