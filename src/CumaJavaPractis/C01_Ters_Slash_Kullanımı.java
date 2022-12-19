package CumaJavaPractis;

public class C01_Ters_Slash_Kullanımı {
    public static void main(String[] args) {
        /*
          \n (or \r)  : Starts from a new line : Metni bir alt satırdan itibaren yazdırır.
	          \t  : Horizontal tab         : Metni yatayda 1 tab miktarı kaydırır.
	          \\  : Prints a back slash    : \  Ters slash yazdırır
	          \'  : Prints single quote    : '  Tek tırnak yazdırır.
	          \"  : Prints double quote    : "  Çift tırnak yazdırır.



	            "Hello "\
                / 'World'"
                yazdırın.


                **************************************
		"ATM'ye Hoşgeldiniz"
	1- Bakiye Sorgulama
	2- Para Yatırma
	3- Para Çekme
	4- Menu'den Çıkış
**************************************


yazdırınız.


         */

        System.out.println("\" Hello \"\\\n" +
                "/ \'World\'\"");


        System.out.println("*****************************\n" +
                "\" ATM\'ye Hoşgeldiniz\"\n" +
                "1-Bakiye Sorgulama\n" +
                "2-Para Yatırma\n" +
                "3-Para Çekme\n" +
                "4-Menu'den Çıkış\n" +
                "********************************************");
    }
}
