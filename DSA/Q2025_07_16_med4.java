public class Q2025_07_16_med4 {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,11,5,6,9,8,7};
        System.out.println(findPeakElement(arr));
    }
    public static int findPeakElement(int[] arr) {
        if(arr[0] > arr[1]) return 0;
        if(arr[arr.length - 1] > arr[arr.length - 2]) return arr.length - 1;
        int start = 1;
        int end = arr.length - 2;
        while(start <= end) {
            int mid = start + (end - start) / 2;
            if(arr[mid] > arr[mid+1] && arr[mid] > arr[mid-1]) return mid;
            else if(arr[mid] > arr[mid-1]) start = mid + 1;
            else end = mid - 1;
        }
        return -1;
    }
}
