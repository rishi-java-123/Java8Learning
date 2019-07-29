package com.array.practice;

import org.junit.Assert;
import org.junit.Test;

public class RemoveDuplicationTest {

    @Test
    public void testRemoveDuplicationFromSortedArray(){
    RemoveDuplicationWithSort removeDuplicationWithSort = new RemoveDuplicationWithSort();
    RemoveDuplicatesUnsorted removeDuplicatesUnsorted = new RemoveDuplicatesUnsorted();
        int[] numbersWithDuplicates = new int[]{5, 2, 2, 3, 5};
        int[] expected =  new int[]{2, 3, 5};
        Assert.assertArrayEquals(expected,removeDuplicationWithSort.removeDuplicates(numbersWithDuplicates));

        numbersWithDuplicates= new int[]{1, 1, 1, 1, 1, 1, 1};
        expected =  new int[]{1};
        Assert.assertArrayEquals(expected, removeDuplicationWithSort.removeDuplicates(numbersWithDuplicates));

        numbersWithDuplicates= new int[]{1, 2, 3, 4, 5, 6, 7};
        expected =  new int[]{1, 2, 3, 4, 5, 6, 7};
        Assert.assertArrayEquals(expected, removeDuplicationWithSort.removeDuplicates(numbersWithDuplicates));

        numbersWithDuplicates= new int[]{1, 2, 1, 1, 1, 1, 1};
        expected =  new int[]{1, 2};
        Assert.assertArrayEquals(expected, removeDuplicationWithSort.removeDuplicates(numbersWithDuplicates));

        numbersWithDuplicates= new int[]{7, 7, 1, 6, 5, 5, 9,9};
        expected =  new int[]{1, 5, 6, 7, 9};
        //expected =  new int[]{7, 1, 6, 5, 9};
        Assert.assertArrayEquals(expected, removeDuplicationWithSort.removeDuplicates(numbersWithDuplicates));

        numbersWithDuplicates= new int[]{0, 2, 1, 1, 1, 1, 1};
       expected =  new int[]{0,1,2};
        Assert.assertArrayEquals(expected, removeDuplicationWithSort.removeDuplicates(numbersWithDuplicates));

        numbersWithDuplicates= new int[]{7, 7, 1, 6, 5, 5, 9,9};
        expected =  new int[]{7, 1, 6, 5, 9};
        Assert.assertArrayEquals(expected, removeDuplicatesUnsorted.removeDuplicates(numbersWithDuplicates));

    }
}
