/*
    Given an arr[] containing n integers and a positive integer k, he problem is to find the longest subarray's length with the sum of the elements divisible by k.

    Example: 
    Input: arr[] = [2, 7, 6, 1, 4, 5], k = 3
    Output: 4
    Explanation: The subarray [7, 6, 1, 4] has sum = 18, which is divisible by 3.
 */
import java.util.HashMap;
public class Q2025_07_02_med {
    public static void main(String[] args) {
        int[] arr = {2,7,6,1,4,5};
        int k = 3;
        System.out.println(returnLongestDivisibleLength(arr, k));
    }
    public static int returnLongestDivisibleLength(int[] arr,int k){
        HashMap<Integer,Integer> map = new HashMap<>();
        int sum = 0;
        int maxLen = Integer.MIN_VALUE;
        map.put(0,-1);
        for(int i = 0;i<arr.length;i++){
            sum+=arr[i];
            int check = ((sum % k) + k) % k;
            if(map.containsKey(check)){
                int len = i - map.get(check);
                maxLen = Math.max(len,maxLen);
            } else {
                map.put(check,i);
            }
        }
        return Math.max(maxLen,0);
    }
}
