package Sorting.MergeSort;

import util.UtilClass;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class AlgorithmTest {

    @Test
    public void test1(){
        int []arr = new UtilClass().generateRandomArray ();
        int [] arrSorted = new UtilClass ().sortArr (arr.clone ());

        assertArrayEquals (arrSorted, new Algorithm().start (arr));
    }
}