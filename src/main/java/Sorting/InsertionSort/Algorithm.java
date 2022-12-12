package Sorting.InsertionSort;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class Algorithm {
    public int[] insertionSort(int []arr){
        Queue<Integer> list = new LinkedList<> ();
        System.out.println ("Inserted Array : "+ Arrays.toString (arr));
        for (var i = 1; i < arr.length; i++){
            var current = arr[i];
            var j = i -1;
            while (j >= 0 && arr[j] > current){
                arr[j+1] = arr[j];
                j--;
            }
            arr [j+1] = current;
            System.out.println (Arrays.toString (arr));
        }
        System.out.println ("Sorted Array : "+Arrays.toString (arr));
        return arr;
    }
}
