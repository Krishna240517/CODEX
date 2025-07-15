/*
  In a sorted array, the ceiling of a number 'x' is defined as the smallest element in the array that is greater than or equal to 'x'

  example:
    INPUT: arr[] = [1,2,2,3]; x = 2
    OUTPUT: 1
    EXPLANATION: 1 is the smallest index that is greater than or equal to x
 */

public class Q2025_07_14_easy2 {
    public static void main(String[] args){
        int[] arr = {1,2,2,3};
        int target = 2;
        System.out.println(returnCeiling(arr, target));
    }

    public static int returnCeiling(int[] arr,int target){
        int start = 0;
        int end = arr.length - 1;

        while(start <= end){
            int mid = start + (end - start) /  2;
            if(arr[mid] >= target) end  = mid - 1;
            else start = mid + 1;
        }
        return start;
    }
}
