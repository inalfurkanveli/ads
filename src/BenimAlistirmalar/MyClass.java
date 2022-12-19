public class MyClass {

    int x = 1;

    static int y;

    MyClass(int i){

        x = x + i;

        y = y + i;

    }

    public static void main(String[] args) {

        MyClass obj1 = new MyClass(5);

        System.out.println(obj1.x + ", " + obj1.y);

        MyClass obj2 = new MyClass(7);

        System.out.println(obj2.x + ", " + obj2.y);

    }

}