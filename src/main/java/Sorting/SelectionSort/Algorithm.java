package Sorting.SelectionSort;

import java.util.Arrays;

public class Algorithm {

    public int[] selectionSort(int []nums){
        System.out.println ("Original Array : "+ Arrays.toString (nums));
        for (int i = 0 ; i < nums.length ; i++){
            int min = i;
            for (int j = i+1; j < nums.length; j++){
                if ( nums[min] > nums[j]){
                    min = j;
                }
            }
            System.out.println (Arrays.toString (nums));
            swap (nums,i,min);
        }
        System.out.println ("Sorted Array : "+Arrays.toString (nums));
        return nums;
    }

    private void swap(int[] a, int i, int j) {
        int temp = a[i];
        a[i] = a[j];
        a[j] = temp;
    }

}
