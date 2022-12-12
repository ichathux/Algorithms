package Sorting.InsertionSort;

import org.junit.jupiter.api.Test;
import util.UtilClass;

import static org.junit.jupiter.api.Assertions.*;

class AlgorithmTest {

    @Test
    public void test1(){
        int []arr = new UtilClass ().generateRandomArray ();
        int[] sortedArr = new UtilClass().sortArr (arr.clone ());
        assertArrayEquals (sortedArr,new Algorithm().insertionSort (arr));
    }
    @Test
    public void test2(){
        int []arr = new int[]{31, 41, 59, 26, 41, 58};
        int[] sortedArr = new UtilClass().sortArr (arr.clone ());
        assertArrayEquals (sortedArr,new Algorithm().insertionSort (arr));
    }

}