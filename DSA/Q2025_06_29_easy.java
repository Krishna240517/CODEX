import java.util.Arrays;
import java.util.HashMap;

//Write a Java Program to
/*
 * VARIETY 1: To check whether a Two Sum exists or not
 * example: arr[] = {1,3,5,11}
 *          target = 6
 *          output: true
 *          explanation: a sum of 6 is present in the array by the two numbers 1 and 5
 * 
 * VARIETY 2: To return the indices of the Elements that contain the two sum
 * example: arr[] = {1,3,5,11}
 *          target = 6
 *          output: [0,2]
 *          explanation: (arr[0] = 1) + (arr[2] = 5) = 6
 */

public class Q2025_06_29_easy {
    public static void main(String[] args) {
        int[] arr = {1,3,5,11};
        int target = 6;
        boolean ansVariety1 = variety1(arr,target);
        int[] ans = variety2(arr,target);
        System.out.println(ansVariety1+" "+Arrays.toString(ans));
    }
    public static boolean variety1(int[] arr,int target){
        Arrays.sort(arr);
        int i = 0;
        int j = arr.length - 1;
        while(i <= j){
            int sum = arr[i] + arr[j];
            if(sum > target){
                j--;
            } else if(sum < target){
                i++;
            } else {
                return true;
            }
        }
        return false;
    }

    public static int[] variety2(int[] arr,int target){
        int[] res = new int[2];
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i = 0;i<arr.length;i++){
            int rem = target - arr[i];
            if(!map.containsKey(rem)){
                map.put(arr[i],i);
            } else {
                res[0] = map.get(rem);
                res[1] = i;
                return res;
            }
        }
        return new int[] {-1,-1};
    }
}
