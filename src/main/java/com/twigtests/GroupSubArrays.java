package com.twigtests;


/*
this is the class containing the method createSubArrays
 */
class GroupSubArrays {


    /*
    this method takes 2 arguements, one is the input array, and second is the subarray length
    returns array of sub arrays
     */
    int[][] createSubArrays(int[] array, int subArrayLength) {
        int arrLength = array.length;

        if (arrLength < 1) {
            return new int[0][0];
        }

        if (subArrayLength == 0) {
            return new int[0][0];
        }

        int noOfSubArrays = (int) Math.ceil((double) arrLength / subArrayLength);
        int[][] subArrays = new int[noOfSubArrays][];

        for (int i = 0; i < noOfSubArrays; i++) {
            int start = i * subArrayLength;
            int length = Math.min(arrLength - start, subArrayLength);

            int[] tempArray = new int[length];
            System.arraycopy(array, start, tempArray, 0, length);
            subArrays[i] = tempArray;
        }

        return subArrays;
    }
}
