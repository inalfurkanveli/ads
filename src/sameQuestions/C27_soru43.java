package sameQuestions;

public class C27_soru43 {
    String name="Furkan";
    int old=25;
    String gender = "Male";

    public C27_soru43(){
        System.out.println(this.name);
        System.out.println(this.old);
        System.out.println(this.gender);

    }

    public C27_soru43(String name,int old,String gender){

        System.out.println("Name : "+ name +"\n"+
                           "Old  : " + old +"\n"+
                            "Gender: "+ gender);

    }


    public static void main(String[] args) {
        /*
        Biri parametreli, diğeri parametresiz 2 constructor oluşturun.
Bu const. kullanarak en az 2 nesne oluşturun ve konsolda bu nesnelerin özellikleri yazdırın
Ipucu: Constructor konusunu pratik yapalım. Nesnelerin rengini adını sayısını gönderelim sonra cagırıp konsolda yazdıralım.
*/
        C27_soru43 obj1= new C27_soru43();
        C27_soru43 obj2= new C27_soru43("Veli",30,"Male");






    }
}





