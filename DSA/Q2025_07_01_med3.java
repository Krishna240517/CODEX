import java.util.HashMap;

public class Q2025_07_01_med3 {
    public static void main(String[] args){
        int[] arr = {10,0,0,5,2,7};
        int k = 5;
        System.out.println(countSubArrays(arr, k));
    }

    public static int countSubArrays(int[] arr,int k){
        HashMap<Integer,Integer> map = new HashMap<>();
        int sum = 0;
        int count = 0;
        map.put(0,1);
        for(int i = 0;i<arr.length;i++){
            sum+=arr[i];
            int check = sum - k;
            count+=map.getOrDefault(check,0);
            map.put(sum,map.getOrDefault(sum,0)+1);
        }
        return count;
    }
}
