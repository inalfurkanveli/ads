package sameQuestions;

public class C19_soru34 {
    public static void main(String[] args) {
/*
        Bir String'i parametre olarak kabul eden ve verilen dizede Stringde bulunan rakamların toplamını yazdıran bir Method yazın.
​
        Örnek
        String str : ade1r4d3
        Int toplam : 8
        İpucu :      Character.isDigit() kullanarak Digitleri alabilir sonra bunları Arraye atabilirsiniz.
                Ardından loop yardımı ile Integer.valueOf() kullanarak toplama yapabilirsiniz

 */
        String str= "acfgfl23asd21";
        int total=0;

        for (int i = 0; i <str.length() ; i++) {
            if(Character.isDigit(str.charAt(i)))
                total+= Integer.valueOf(String.valueOf(str.charAt(i)));
        }
        System.out.println("Girilen Stringde'ki sayıların toplamı : "+ total);

    }
}
