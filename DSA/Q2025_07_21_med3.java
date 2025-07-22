public class Q2025_07_21_med3 {
    public static void main(String[] args) {
        int[] arr = {3,6,7,11};
        int hours = 8;
        System.out.println(findHours(arr, hours));
    }   
    public static int findHours(int[] arr,int hours) {
        int start = 1;
        int end = Integer.MIN_VALUE;
        for(int num : arr){
            end = Math.max(end,num);
        }
        while(start <= end) {
            int mid = start + (end - start) / 2;
            int val = check(arr, mid);
            if(val <= hours) end = mid - 1;
            else if(val > hours) start = mid + 1; 
        }
        return start;
    }
    public static int check(int[] arr,int mid) {
        int sum = 0;
        for(int num : arr) {
            sum += (int)Math.ceil((double)num / (double)mid);
        }
        return sum;
    }
}
