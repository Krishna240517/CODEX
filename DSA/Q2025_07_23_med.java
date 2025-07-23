/*
    You are the owner of a Shipment company. You use conveyor belts to ship packages from one port to another. The packages must be shipped within 'd' days.
    The weights of the packages are given in an array 'of weights'. The packages are loaded on the conveyor belts every day in the same order as they appear in the array. The loaded weights must not exceed the maximum weight capacity of the ship.
    Find out the least-weight capacity so that you can ship all the packages within 'd' days.





    Input Format: N = 5, weights[] = {5,4,5,2,3,4,5,6}, d = 5
    Result: 9
    Explanation: If the ship capacity is 9, the shipment will be done in the following manner:
    Day         Weights            Total
    1        -       5, 4          -        9
    2        -       5, 2          -        7
    3        -       3, 4          -        7
    4        -       5             -        5
    5        -       6             -        6
    So, the least capacity should be 9.
 */

public class Q2025_07_23_med {
    public static void main(String[] args) {
        int[] arr = {5,4,5,2,3,4,5,6};
        int d = 5;
        System.out.println(leastWeightCapacity(arr, d));
    }
    public static int leastWeightCapacity(int[] arr,int d) {
        int start = -1;
        int  end = 0;
        for(int num : arr) {
            start = Math.max(start,num);
            end+=num;
        }

        while(start <= end) {
            int mid = start + (end - start) / 2;
            int val = findDays(arr, mid);
            if(val > d) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return start;
    }
    public static int findDays(int[] arr,int mid) {
        int loads = 0;
        int dayscount = 1;
        for(int i=0;i<arr.length;i++) {
            if(loads+arr[i] > mid) {
                dayscount+=1;
                loads=arr[i];
            } else {
                loads+=arr[i];
            }
        }
        return dayscount;
    }
}
