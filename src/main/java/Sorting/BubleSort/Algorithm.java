package Sorting.BubleSort;

import java.util.Arrays;

public class Algorithm {
    public int[] bubleSort(int arr[]){

        System.out.println ("Original Array -: "+Arrays.toString (arr));
        for (int i = arr.length -1; i > 1 ; i--){
            System.out.println ();
            for (int j = 0; j < i; j++){
                System.out.println ("arr[j] "+arr[j]+" arr[j+1] "+arr[j+1]);
                if (arr[j] > arr[j+1]){
                    System.out.println ("arr[j] "+arr[j]+" > "+arr[j+1]+" arr[j+1]");
                    arr = swapValues(arr,j,j+1);
                    System.out.println (Arrays.toString (arr));
                }
            }
        }
        return arr;
    }
    private int[] swapValues(int[] arr , int indexOne , int indexTwo) {
        int temp = arr[indexOne];
        arr[indexOne] = arr[indexTwo];
        arr[indexTwo] = temp;
        return arr;
    }

}
