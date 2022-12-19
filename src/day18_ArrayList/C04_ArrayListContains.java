package day18_ArrayList;

import java.util.ArrayList;
import java.util.List;

public class C04_ArrayListContains {
    public static void main(String[] args) {
        int[] arr={1,2,3,2,4,3,1,1,2,4,5,56,6,7,8,9,0,11,12};

        List<Integer> sayilar=new ArrayList<>();

        for (int i = 0; i <arr.length ; i++) {
            sayilar.add(arr[i]);

        }

        System.out.println(sayilar.contains(5));
        System.out.println(sayilar);

        sayilar.contains(13);
    }
}
