/*  
    Given an integer array nums of unique elements, return all possible subsets (the power set).
    Input: nums = [1,2,3]
    Output: [[],[1],[2],[1,2],[3],[1,3],[2,3],[1,2,3]]
 */


import java.util.List;
import java.util.ArrayList;

public class Q2025_08_05_med {
    public static void main(String[] args) {
        int[] nums = {1,2,3};
        List<List<Integer>> res = subsets(nums);
        System.out.println(res);
    }
    static List<List<Integer>> list = new ArrayList<>();
    public static List<List<Integer>> subsets(int[] arr) {
        subseq(arr,0,new ArrayList<>());
        return list;
    }
    

    public static void subseq(int[] arr,int index,List<Integer> temp){
        if(index == arr.length){
            list.add(new ArrayList<>(temp));
            return;
        }

        temp.add(arr[index]);
        subseq(arr,index+1,temp);
        temp.remove(temp.size()-1);
        subseq(arr,index+1,temp);
    }
}