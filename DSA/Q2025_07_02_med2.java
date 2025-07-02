/*
    Given an array nums with n objects colored red, white, or blue, sort them in-place so that objects of the same color are adjacent, with the colors in the order red, white, and blue.

    We will use the integers 0, 1, and 2 to represent the color red, white, and blue, respectively.

    Input: nums = [2,0,2,1,1,0]
    Output: [0,0,1,1,2,2]
 */
import java.util.Arrays;
public class Q2025_07_02_med2 {
    public static void main(String[] args){
        int[] arr = {0,1,1,2,2,2,1,1,0,0,1};
        sortColors(arr);
        System.out.println(Arrays.toString(arr));
    }
    public static void sortColors(int[] arr) {
        int low = 0;
        int high = arr.length - 1;
        int mid = 0;
        while(mid <= high){
            if(arr[mid] == 0){
                int temp = arr[mid];
                arr[mid] = arr[low];
                arr[low] = temp;
                mid++;
                low++;
            }
            else if(arr[mid] == 1){
                mid++;
            }
            else{
                int temp = arr[mid];
                arr[mid] = arr[high];
                arr[high] = temp;
                high--;
            }
        }
    }
}
