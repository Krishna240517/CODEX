
/*
    Given an unsorted array of integers nums, return the length of the longest consecutive elements sequence.
    Input: nums = [100,4,200,1,3,2]
    Output: 4
    Explanation: The longest consecutive elements sequence is [1, 2, 3, 4]. Therefore its length is 4. 
 */
import java.util.HashSet;

public class Q2025_07_06_med {
    public static void main(String[] args) {
        int[] arr = { 1, 0, 1, 2 };
        System.out.println(longestConsecutive(arr));
    }

    public static int longestConsecutive(int[] arr) {
        if (arr.length == 0)
            return 0;
        HashSet<Integer> set = new HashSet<>();
        for (int i = 0; i < arr.length; i++) {
            set.add(arr[i]);
        }
        int maxCount = 0;

        for (int num : arr) {
            if (!set.contains(num - 1)) {
                int currentNum = num;
                int count = 1;

                while (set.contains(currentNum + 1)) {
                    currentNum++;
                    count++;
                }
                maxCount = Math.max(maxCount, count);
            }
        }
        return maxCount;
    }
}