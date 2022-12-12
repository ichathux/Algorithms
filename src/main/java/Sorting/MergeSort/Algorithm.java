package Sorting.MergeSort;

import java.util.Arrays;

public class Algorithm {

    public int[] start(int []nums){
        System.out.println ("Original : "+Arrays.toString (nums));
        mergeSort (nums);
        System.out.println (Arrays.toString (nums));
        return nums;
    }
    public void mergeSort(int []nums){
        int length = nums.length;
        if (length < 2){
            return;
        }
        int mid = length/2;
        int[] l = new int[mid];
        int[] r = new int[length-mid];

        for (int i = 0; i < mid ; i++){
            l[i] = nums[i];
        }
        for (int i = mid ; i < length ; i++){
            r[i -mid] = nums[i];
        }
        mergeSort (l);
        mergeSort (r);
        merge (nums,l,r);
    }

    public void merge(int []a, int []l, int []r){
        int left = l.length;
        int right = r.length;

        int i = 0, j=0, k=0;
        while (i < left && j < right){
            if (l[i] <= r[j]){
                a[k++] = l[i++];
            }else {
                a[k++] = r[j++];
            }
        }
        while (i < left){
            a[k++] = l[i++];
        }
        while (j < right){
            a[k++] = r[j++];
        }
    }
}
