package day10__stringManipullations;

public class C05_soru5 {
    public static void main(String[] args) {

        /* // Soru 1 : Kullanicidan bir cumle alin
    // - cumlede ev geciyorsa, "home home sweet home" yazdirin
    // - cumlede is geciyorsa, "calismak guzeldir"
    // - ikisini de iceriyorsa "Hem ev lazim hem is"
    // - hicbirini icermiyorsa "cok calisman lazim" yazdirin

         */

        String cumle="ev de is cok guzel.";

        String yeniCumle=cumle.toLowerCase();
        if (yeniCumle.contains("is")&&yeniCumle.contains("ev")) {
            System.out.println("Hem ev lazim hem is");
        }
            else if (yeniCumle.contains("ev")){
            System.out.println("home home sweet home");
        } else if (yeniCumle.contains("is")) {
            System.out.println("calismak güzeldir.");
        }
          else {
            System.out.println("cok calismak lazım.");
        }
        }

    }

