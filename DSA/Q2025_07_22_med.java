/*
    You are given 'N’ roses and you are also given an array 'arr'  where 'arr[i]'  denotes that the 'ith' rose will bloom on the 'arr[i]th' day.
    You can only pick already bloomed roses that are adjacent to make a bouquet. You are also told that you require exactly 'k' adjacent bloomed roses to make a single bouquet.
    Find the minimum number of days required to make at least ‘m' bouquets each containing 'k' roses. Return -1 if it is not possible.

    
    Input Format: N = 8, arr[] = {7, 7, 7, 7, 13, 11, 12, 7}, m = 2, k = 3
    Result: 12
    Explanation: On the 12th the first 4 flowers and the last 3 flowers would have already bloomed. So, we can easily make 2 bouquets, one with the first 3 and another with the last 3 flowers.
 */



public class Q2025_07_22_med {
    public static void main(String[] args) {
        int[] arr = {7,7,7,7,13,11,12,7};
        int m = 2;
        int k = 3;
        System.out.println(roseGarden(arr, k, m));
    }
    public static int roseGarden(int[] arr,int k, int m) {
        int start = -1, end = -1;
        for(int num : arr) {
            start = Math.min(start,num);
            end = Math.max(end,num);
        }

        while(start <= end) {
            int mid = start + (end - start) / 2;
            if(possible(arr, k, m, mid)) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return start;
    }

    public static boolean possible(int[] arr,int k,int m,int mid) {
        int flowerCount = 0;
        int bouquetCount = 0;
        for(int i = 0;i<arr.length;i++){
            if(arr[i] <= mid) {
                flowerCount++;
            } else {
                bouquetCount += flowerCount / k;
                flowerCount = 0;
            }
        }
        bouquetCount+=flowerCount/k;
        return bouquetCount >= m;
    } 
}
