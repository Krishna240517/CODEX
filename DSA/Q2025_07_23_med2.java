import java.util.Arrays;
public class Q2025_07_23_med2 {

    public static void main(String[] args) {
        int[] arr = {0,3,4,7,10,9};
        int k = 4;
        System.out.println(returnMinMaxDistance(arr, k));
    }
    public static int returnMinMaxDistance(int[] arr, int k) {
        Arrays.sort(arr);
        int start = 1;
        int end = arr[arr.length - 1] - arr[0];
        while(start <= end) {
            int mid = start + (end - start) / 2;
            boolean res = canWePlace(arr,k,mid);
            if(res) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return end;
    }
    public static boolean canWePlace(int[] arr,int k,int dist) {
        int countCows = 1;
        int last = arr[0];
        for(int i = 1;i<arr.length;i++) {
            if(arr[i] - last >= dist) {
                countCows+=1;
                last = arr[i];
            }
            if(countCows >= k) return true;
        }
        return false;
    }
}
