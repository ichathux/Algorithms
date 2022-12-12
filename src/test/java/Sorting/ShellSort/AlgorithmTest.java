package Sorting.ShellSort;

import Sorting.ShellSort.Algorithm;
import org.junit.jupiter.api.Test;
import util.UtilClass;

import static org.junit.jupiter.api.Assertions.*;

class AlgorithmTest {
    @Test
    public void test1(){
        int []arr = new UtilClass ().generateRandomArray ();
        int[] sortedArr = new UtilClass().sortArr (arr.clone ());
        assertArrayEquals (sortedArr,new Algorithm ().shellSort (arr));
    }

}