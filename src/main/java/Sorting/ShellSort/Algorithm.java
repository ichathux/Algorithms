package Sorting.ShellSort;

import java.util.Arrays;

public class Algorithm {

    public int[] shellSort(int []a){

        System.out.println ("Original Array : "+Arrays.toString (a));
        int n = a.length;
        for (int gap = n / 3; gap > 0; gap /= 3) {
            System.out.println ("gap : "+gap);
            for (int i = gap; i < n; i++) {
                int key = a[i];
                int j = i;
                while (j >= gap && a[j - gap] > key) {
                    a[j] = a[j - gap];
                    j -= gap;
                    System.out.println ("Key : "+key);
                    System.out.println ("a[j] : "+a[j]);
                    System.out.println (Arrays.toString (a));
                }

                a[j] = key;
                System.out.println (Arrays.toString (a));
            }
        }
        return a;
    }
}
