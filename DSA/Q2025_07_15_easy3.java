/*To find the first and last occurence of a given number in a sorted array */

import java.util.Arrays;
public class Q2025_07_15_easy3 {
    public static void main(String[] args) {
        int[] arr = {1,2,2,2,2,5,6,7};
        int target = 2;
        int[] ans = {-1,-1};
        ans[0]= findFirstAndLastOccurence(arr, target, true);
        ans[1] = findFirstAndLastOccurence(arr, target, false);
        int occurences = ans[1] - ans[0] + 1;
        System.out.println(occurences);
        System.out.println(Arrays.toString(ans));
    }
    public static int findFirstAndLastOccurence(int[] arr,int target,boolean firstOccurence){
        int start = 0;
        int end = arr.length - 1;
        int ans = Integer.MIN_VALUE;
        while(start <= end){
            int mid = start + (end - start) / 2;
            if(arr[mid] < target) start = mid + 1;
            else if(arr[mid] > target) end = mid - 1;
            else{
                ans = mid;
                if (firstOccurence) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            }
        }
        return ans;
    }
}
