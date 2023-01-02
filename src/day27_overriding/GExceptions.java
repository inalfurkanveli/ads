package day27_overriding;

public class GExceptions {
    public static void main(String[] args) {

        int a = 20;
        int b= 0 ;

        System.out.println("iki sayının bölümü : "+ a/b);

        // bolen sayının 0 olması bu kodda ongurulebilecek bir risk'dir.
        // ve kodumuzu yazarken bu riski cözecek sekilde kod yazabiliriz

        if(b!=0){
            System.out.println("iki sayının bölümü : "+ a/b);
        }else {
            System.out.println("Bolen sayı sifir olamaz");
        }



    }
}
