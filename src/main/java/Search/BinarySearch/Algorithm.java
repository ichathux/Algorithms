package Search.BinarySearch;

import java.util.Arrays;

public class Algorithm {
    public int binarySearch(int []arr, int value){
        System.out.println ("Array : "+ Arrays.toString (arr));
        System.out.println ("Value : "+value);
        int start = 0;
        int end = arr.length-1;
        int result = -1;
        while (start <= end){
            int middle = (start+end)/2;
            if (arr[middle] < value){
                start = middle+1;
            }else if (arr[middle] > value){
                end = middle-1;
            }else {
                result = middle;
                start = end+1;
            }
        }
        return result;
    }
}
