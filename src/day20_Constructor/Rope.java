package day20_Constructor;

public class Rope {

        public static void swing() {
            System.out.print("swing ");
        }
        public void climb() {
            System.out.print("climb ");
        }
        public static void play(){
            swing();
           // climb();
        }
        public static void main(String[] args) {
            Rope rope = new Rope();
            rope.play();
            Rope rope2 = null;  // instance variable yok, instance variable olsaydı ve rope 2 üzerinden
            rope2.play();      // instance üzerinden işlem yapsaydık NullPointerException verirdir.

        }
    }

