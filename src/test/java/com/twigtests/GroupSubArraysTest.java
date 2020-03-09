package com.twigtests;

import org.junit.Test;

import static org.junit.Assert.assertEquals;


public class GroupSubArraysTest {

    //class under test
    GroupSubArrays groupSubArrays = new GroupSubArrays();

    //case 1 happy path when inputs are valid
    @Test
    public void testGivenSomeFiniteArray_whenCreateSubArraysInvoked_shouldReturnSubArrays() {
        int[] sampleArr = {1, 2, 3, 4, 5, 5, 6, 8, 9, 100, 0};
        int[][] subArrays = groupSubArrays.createSubArrays(sampleArr, 2);
        assertEquals(6, subArrays.length);

        int[][] subArrays2 = groupSubArrays.createSubArrays(sampleArr, 3);
        assertEquals(4, subArrays2.length);

    }


    //case2 when input array is empty
    @Test
    public void testGivenEmptyArray_whenCreateSubArraysInvoked_shouldReturnNothing() {

        int[] sampleArr = {};
        int[][] subArrays = groupSubArrays.createSubArrays(sampleArr, 2);
        assertEquals(0, subArrays.length);
    }


    //case 3 when subarray length is zero
    @Test
    public void testGivenSomeFiniteArrayAndSubArrayLengthAsZero_whenCreateSubArraysInvoked_shouldReturnNothing() {

        int[] sampleArr = {1, 2, 3, 4, 5, 5, 6, 8, 9, 100, 0};
        int[][] subArrays = groupSubArrays.createSubArrays(sampleArr, 0);
        assertEquals(0, subArrays.length);
    }


}