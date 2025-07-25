/*
    You are given a 0-indexed integer array nums and an integer pivot. Rearrange nums such that the following conditions are satisfied:

    Every element less than pivot appears before every element greater than pivot.
    Every element equal to pivot appears in between the elements less than and greater than pivot.
    The relative order of the elements less than pivot and the elements greater than pivot is maintained.

    Input: nums = [9,12,5,10,14,3,10], pivot = 10
    Output: [9,5,3,10,10,12,14]
    Explanation: 
    The elements 9, 5, and 3 are less than the pivot so they are on the left side of the array.
    The elements 12 and 14 are greater than the pivot so they are on the right side of the array.
    The relative ordering of the elements less than and greater than pivot is also maintained. [9, 5, 3] and [12, 14] are the respective orderings.
    */

import java.util.Arrays;
public class Q2025_07_09_med {
    public static void main(String[] args){
        int[] arr = {9,12,5,10,14,3,10};
        int pivot = 10;
        System.out.println(Arrays.toString(pivotArray(arr, pivot)));
    }
    public static int[] pivotArray(int[] nums, int pivot) {
        int[] ans = new int[nums.length];
        int lcount = 0;
        int gcount = 0;
        for(int num : nums){
            if(num > pivot) gcount++;
            else if(num < pivot) lcount++; 
        }
        int pcount = nums.length - (lcount + gcount);

        int less = 0;
        int greater = lcount + pcount;
        int equal = lcount;
        for(int num : nums){
            if(num < pivot) ans[less++] = num;
            else if(num == pivot) ans[equal++] = num;
            else ans[greater++] = num; 
        }
        return ans;
    }
}
