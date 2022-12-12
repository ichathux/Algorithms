package Sorting.BubleSort;

import util.UtilClass;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AlgorithmTest {

    private final Algorithm algorithm = new Algorithm ();

    @Test
    public void test1BubbleSort(){
        int []arr = new UtilClass().generateRandomArray ();
        int[] sortedArr = new UtilClass().sortArr (arr.clone ());
        assertArrayEquals (sortedArr, algorithm.bubleSort (arr));
    }

}