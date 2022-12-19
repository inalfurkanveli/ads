package day18_ArrayList;

import java.util.ArrayList;
import java.util.List;

public class C03_ArrayListSize {
    public static void main(String[] args) {
        List<String> yeniList=new ArrayList<>();
        yeniList.add("F");
        yeniList.add("G");
        yeniList.add("T");


        System.out.println(yeniList.size()); // 3


        yeniList.clear(); // listedeki tüm eleemntleri siler.

        System.out.println(yeniList.size()); // 0
        System.out.println(yeniList); // []

    }
}
