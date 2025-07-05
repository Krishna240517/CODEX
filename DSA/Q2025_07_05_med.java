/*
  Given an array of intervals where intervals[i] = [starti, endi], merge all overlapping intervals, and return an array of the non-overlapping intervals that cover all the intervals in the input.

    Input: intervals = [[1,3],[2,6],[8,10],[15,18]]
    Output: [[1,6],[8,10],[15,18]]
    Explanation: Since intervals [1,3] and [2,6] overlap, merge them into [1,6]
 */
import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;
public class Q2025_07_05_med {
    public static void main(String[] args){
        int[][] arr = {{1,3},{2,6},{8,10},{15,18}};
        System.out.println(mergeOverLappingSubIntervals(arr));;
    }
    public static List<List<Integer>> mergeOverLappingSubIntervals(int[][] arr){
        List<List<Integer>> ans = new ArrayList<>();
        for(int i = 0;i<arr.length;i++){
            if(ans.isEmpty() || ans.get(ans.size()-1).get(1) < arr[i][0] ){
                ans.add(Arrays.asList(arr[i][0],arr[i][1]));
            } else {
               ans.get(ans.size()-1).set(1,Math.max(ans.get(ans.size()-1).get(1),arr[i][1]));
            }
        }
        return ans;
    }
}
