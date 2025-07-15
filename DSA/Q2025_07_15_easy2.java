

public class Q2025_07_15_easy2 {
    public static void main(String[] args) {
        int[] arr = {1,2,4,7};
        int target = 6;
        System.out.println(searchInsertPosition(arr, target));
    }

    public static int searchInsertPosition(int[] arr,int target){
        //basically to find the flooring of the target
        int start = 0;
        int end = arr.length - 1;
        while(start <= end){
            int mid = start + (end - start) / 2;
            if(arr[mid] < target){
                start = mid + 1; 
            } else if(arr[mid] > target) {
                end = mid - 1;
            } else {
                return mid;
            }
        }
        return end+1;
    }
}
