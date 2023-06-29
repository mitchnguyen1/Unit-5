package org.example;

import java.util.Arrays;

public class MissingNumber {
    public static void main(String[] args){
        int[] array = {2, 1, 4, 3, 8, 5, 7, 6, 9};
        System.out.println(MissingNumSum(array,10));
    }

    /**
     * nums start at 1 and end at max num
     * one number is missing
     * return missing num, if none, return 0
     *
     *
     * @param nums - an array from 1 to max number with a missing number
     * @param max - the max number the array is counting to
     */
    public static int MissingNumSum(int[] nums, int max){
        /**
         * handle edge cases for no missing num
         *
         * sum method:
         *  add the current sum of the array and compare with expected sum
         *
         * expectedsum 55 = (nums.length * max / 2 )+max
         * currsum += i
         */
        if(nums.length == max){
            return 0;
        }
        int expectedSum = (nums.length * max / 2) + max;
        int currSum = 0;
        for(int i : nums){
            currSum += i;
        }
        return expectedSum - currSum;
    }




    /**
     *
     * always start at 1 and go to max_num
     * function that take in a list of nums and max_num and return missing number
     * params: list, max_num
     * return: int
     *
     *
     */
    //sort the list and iterate through and if i + 1 != i++, return i + 1.
    //start at the beginning of list and stop at max_num
    public static int missingNumber(int[] nums, int max){
        if(nums.length == max){
            return 0;
        }
        Arrays.sort(nums);
        int start = nums[0]-1;
        for(int n : nums){

            if(n != (start+1)){
                return start+1;
            }
            start++;
        }
        return 0;
    }

}
