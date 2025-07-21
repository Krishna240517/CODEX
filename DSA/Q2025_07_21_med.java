/*
    You are given an array of intervals, where intervals[i] = [starti, endi] and each starti is unique.

    The right interval for an interval i is an interval j such that startj >= endi and startj is minimized. Note that i may equal j.

    Return an array of right interval indices for each interval i. If no right interval exists for interval i, then put -1 at index i.

    Input: intervals = [[3,4],[2,3],[1,2]]
    Output: [-1,0,1]
    Explanation: There is no right interval for [3,4].
    The right interval for [2,3] is [3,4] since start0 = 3 is the smallest start that is >= end1 = 3.
    The right interval for [1,2] is [2,3] since start1 = 2 is the smallest start that is >= end2 = 2.
 */

import java.util.Arrays;
import java.util.HashMap;
public class Q2025_07_21_med{
    public static void main(String[] args) {
        int[][] intervals = {{3,4},{2,3},{1,2}};
        System.out.println(Arrays.toString(findRightInterval(intervals)));
    }
    public static int[] findRightInterval(int[][] intervals) {
        int[] ans = new int[intervals.length];
        int[] starts = new int[intervals.length];
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i = 0;i<starts.length;i++){
            starts[i] = intervals[i][0];
            map.put(starts[i],i);
        }
        Arrays.sort(starts);
        for(int i = 0;i<intervals.length;i++) {
            int val = binarySearch(starts,intervals[i][1]);
            if(val == -1) {
                ans[i] = -1;
            } else {ans[i] = map.get(val);}
               
        }
        return ans;
    }
    public static int binarySearch(int[] starts,int target) {
        int ans = -1;
        int low = 0;
        int high = starts.length - 1;
        while(low <= high) {
            int mid = low + (high - low) / 2;
            if(starts[mid] >= target) {
                ans = mid;
                high = mid -1;
            } 
            else low = mid + 1;
        }
        return ans == -1 ? -1 : starts[ans];
    }
}