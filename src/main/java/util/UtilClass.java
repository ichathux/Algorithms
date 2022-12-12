package util;

import java.util.Arrays;
import java.util.Random;

public class UtilClass {
    public int[] generateRandomArray(){
        int size = new Random ().nextInt (20);
        int[] arr = new int[size];
        for (int i = 0; i < arr.length; i++){
            arr[i] = new Random ().nextInt (20);
        }
        return arr;
    }

    public int[] sortArr(int[] arr1){
        Arrays.sort (arr1);
        return arr1;
    }
}
