/*

    Suppose an array of length n sorted in ascending order is rotated between 1 and n times. For example, the array nums = [0,1,2,4,5,6,7] might become:
    [4,5,6,7,0,1,2] if it was rotated 4 times.
    [0,1,2,4,5,6,7] if it was rotated 7 times.
    Notice that rotating an array [a[0], a[1], a[2], ..., a[n-1]] 1 time results in the array [a[n-1], a[0], a[1], a[2], ..., a[n-2]].
    Given the sorted rotated array nums of unique elements, return the minimum element of this array.

    Input: nums = [3,4,5,1,2]
    Output: 1
    Explanation: The original array was [1,2,3,4,5] rotated 3 times.
 */

public class Q2025_07_16_med2 {
    public static void main(String[] args) {
        int[] arr = {3,4,5,1,2};
        System.out.println(findMinimum(arr));
    }

    public static int findMinimum(int[] arr){
        int start = 0;
        int end = arr.length - 1;
        int min = Integer.MAX_VALUE;
        while(start <= end){
            int mid = start + (end - start) / 2;
            if(arr[start] <= arr[mid]){
                //left half is sorted
                min = Math.min(min,arr[start]);
                start = mid + 1;
            } else {
                //right half is sorted
                min = Math.min(min,arr[mid]);
                end = mid - 1;
            }
        }
        return min;
    }
}
