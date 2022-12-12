package Sorting.SelectionSort;

import util.UtilClass;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AlgorithmTest {

    @Test
    public void test1(){
        int []arr = new UtilClass ().generateRandomArray ();
        int[] sortedArr = new UtilClass().sortArr (arr.clone ());
        assertArrayEquals (sortedArr, new Algorithm().selectionSort (arr));
    }

}