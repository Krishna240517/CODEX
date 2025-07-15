
/*
  In a sorted array, the flooring of a number 'x' is defined as the greatest element in the array that is smaller than or equal to 'x'

  example:
    INPUT: arr[] = [3,8,9,10,12,13,14,17,23]; x = 11
    OUTPUT: 3
    EXPLANATION: 3 is the greatest index that is smaller than or equal to x
 */
public class Q2025_07_15_easy {
    public static void main(String[] args){
        int[] arr = {3,8,9,10,12,13,14,17,23};
        int target =11;
        System.out.println(returnFlooring(arr, target));
    }
    public static int returnFlooring(int[] arr,int target){
        int start = 0;
        int end = arr.length - 1;
        while(start <= end){
            int mid = start + (end - start) / 2;
            if(arr[mid] <= target) start = mid + 1;
            else end = mid - 1;
        }
        return end;
    }
}
