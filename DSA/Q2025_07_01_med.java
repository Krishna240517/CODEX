/*
 Given an integer array nums, find the subarray with the largest sum, and return its sum.

 

Example : 

Input: nums = [-2,1,-3,4,-1,2,1,-5,4]
Output: 6
Explanation: The subarray [4,-1,2,1] has the largest sum 6.

for single element array return the element itself;

HINT: KADANE'S ALGORITHM
 */

public class Q2025_07_01_med {
    public static void main(String[] args){
        int[] arr = {-2,-3,-1};
        System.out.println(maxSubarraySum(arr));
    }

    public static int maxSubarraySum(int[] arr){
        if(arr.length == 1){
            if(arr[0] > 0){
                return arr[0];
            } else {
                return 0;
            }
        }
        int i = 0;
        int sum = 0;
        int max = Integer.MIN_VALUE;
        while(i < arr.length){
            sum+=arr[i];
            if(sum > max){
                max = sum;
            }
            if(sum < 0){
                sum = 0;
            }
            i++;
        }
        return max;
    } 


}
