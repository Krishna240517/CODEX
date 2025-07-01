import java.util.HashSet;
import java.util.HashMap;
import java.util.Arrays;
public class Q2025_07_01_med2 {
    public static void main(String[] args){
        int[] arr = {2,8,2,6,-6,3,2};
        int k = 5;
        System.out.println(findLongestSubarrayLength(arr, k));
    }
    //does subarray with sum K exists
    public static boolean subarrayExists(int[] arr,int k){
        HashSet<Integer> set = new HashSet<>();
        set.add(0);
        int sum = 0;
        for(int i = 0;i<arr.length;i++){
            sum+=arr[i];
            int check = sum - k;
            if(set.contains(check)) return true;
            else{
                set.add(sum);
            }
        }
        return false;
    }

    //find the starting and ending indexes if the subarray with sum K is found
    public static int[] returnIndices(int[] arr,int k){
        HashMap<Integer,Integer> map = new HashMap<>();
        int sum = 0;
        map.put(0,-1);
        for(int i = 0;i<arr.length;i++){
            sum+=arr[i];
            int check = sum - k;
            if(map.containsKey(check)){
                return new int[]{map.get(check)+1,i};
            } else {
                map.put(sum,i);
            }
        }
        return new int[]{-1,-1};
    }

    //return the length of the longest subarray with sum K
    public static int findLongestSubarrayLength(int[] arr,int k){
        int maxLen = 0;
        int sum = 0;
        HashMap<Integer,Integer> map = new HashMap<>();
        map.put(0,-1);
        for(int i = 0;i<arr.length;i++){
            sum+=arr[i];
            int check = sum - k;
            if(map.containsKey(check)){
                int len = i - map.get(check);
                maxLen = Math.max(maxLen,len);
            }
            if(!map.containsKey(sum)){
                map.put(sum,i);
            }
        }
        return maxLen;
    }
}
