public class Q2025_07_24_hard {
    public static void main(String[] args) {
        int[] arr = {7,2,5,10,8};
        int k = 2;
        System.out.println(splitArrayLargestSum(arr, k));
    }
    public static int splitArrayLargestSum(int[] arr,int k) {
        int start = -1;
        int end = 0;
        for(int i = 0;i<arr.length;i++) {
            start = Math.max(start,arr[i]);
            end += arr[i];
        }
        int ans = 0;
        while(start <= end) {
            int mid = start + (end - start) / 2;
            int subArrayCount = check(arr, mid);
            if(subArrayCount > k) {
                start = mid + 1;
            } else {
                ans = mid;
                end = mid - 1;
            }
        }
        return ans;
    }

    public static int check(int[] arr,int mid) {
        int pieces = 0;
        int count = 0;
        for(int i = 0;i<arr.length;i++){
            if(pieces + arr[i] > mid) {
                count++;
                pieces=arr[i];
            } else {
                pieces+=arr[i];
            }
        }
        return count+1;
    }
}