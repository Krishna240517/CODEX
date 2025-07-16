/*
    There is an integer array nums sorted in non-decreasing order (not necessarily with distinct values).

    Before being passed to your function, nums is rotated at an unknown pivot index k (0 <= k < nums.length) such that the resulting array is [nums[k], nums[k+1], ..., nums[n-1], nums[0], nums[1], ..., nums[k-1]] (0-indexed). For example, [0,1,2,4,4,4,5,6,6,7] might be rotated at pivot index 5 and become [4,5,6,6,7,0,1,2,4,4].

    Given the array nums after the rotation and an integer target, return true if target is in nums, or false if it is not in nums.

    Input: nums = [2,5,6,0,0,1,2], target = 0
    Output: true
 */

public class Q2025_07_16_med {
    public static void main(String[] args) {
        int[] arr = {4,5,6,6,7,0,1,2,4,4};
        int target = 0;
        System.out.println(search(arr, target));
    }

    public static boolean search(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;
        while(start <= end){
            int mid = start + (end - start) / 2;
            if(arr[mid] == target) return true;
            if(arr[start] == arr[mid] && arr[mid] == arr[end]){
                start = start + 1;
                end = end  - 1;
                continue;
            }
            if(arr[start] <= arr[mid]){
                if(target >= arr[start] && target <= arr[mid]){
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            } else {
                if(target >= arr[mid] && target <= arr[end]){
                    start = mid + 1;
                } else {
                    end = mid - 1;
                }
            }
        }
        return false;
    }
}
