package CarsambaPractise;

public class C01_100den0a13eTamBolunme {
    public static void main(String[] args) {


        // 100 den 0 a dogru 13e tam bölünenleri ve toplamını gösteren program


        int toplam=0;
        for (int i = 100; i >0 ; i--) {

            if(i%13==0){
                System.out.println(i);
                toplam+=i;

            }

        }
        System.out.println("13'e bölünen sayıların toplamı : "+ toplam);
    }
}
