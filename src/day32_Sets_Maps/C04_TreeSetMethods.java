package day32_Sets_Maps;

import java.util.Set;
import java.util.TreeSet;

public class C04_TreeSetMethods {
    public static void main(String[] args) {
        Set<Integer> treeSet = new TreeSet<>();

        treeSet.add(12);
        treeSet.add(32);
        treeSet.add(1);
        treeSet.add(3);
        treeSet.add(25);

        System.out.println(treeSet); // [1, 3, 12, 25, 32]


    }
}
