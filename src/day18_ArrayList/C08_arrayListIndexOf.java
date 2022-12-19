package day18_ArrayList;

import java.util.ArrayList;
import java.util.List;

public class C08_arrayListIndexOf {
    public static void main(String[] args) {

        List<String> harfler=new ArrayList<>();

        harfler.add("A");
        harfler.add("Z");
        harfler.add("M");

        harfler.indexOf("A");
        System.out.println(harfler.indexOf("A"));

        harfler.add("A");
        harfler.add("A");

        System.out.println(harfler.lastIndexOf("A"));
    }
}
