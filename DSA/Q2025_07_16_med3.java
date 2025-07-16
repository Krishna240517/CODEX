/*
 * given an array of integers where every number appear exactly twice except for one number. Our task is to find that unique number
 */
public class Q2025_07_16_med3 {
    public static void main(String[] args){
        int[] arr = {1,1,2,2,3,3,4,4,5,5,6,6};
        System.out.println(findSingleNumber(arr));
    }
    public static int findSingleNumber(int[] arr) {
        int start = 0;
        int end = arr.length - 1;
        if(arr[start] == arr[start+1]) start++;
        if(arr[end] == arr[end-1]) end--;
        while(start <= end) {
            int mid = start + (end - start) / 2;
            if(arr[mid] != arr[mid-1] && arr[mid] != arr[mid + 1]) return arr[mid];
            else if((mid % 2 != 0 && arr[mid-1] == arr[mid]) || (mid % 2 == 0 && arr[mid+1] == arr[mid])) start = mid + 1;
            else end = mid - 1;
        }
        return -1;
    }
}