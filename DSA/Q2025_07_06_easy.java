/*

    You are given a read-only array of N integers with values also in the range [1, N] both inclusive. Each integer appears exactly once except A which appears twice and B which is missing. The task is to find the repeating and missing numbers A and B where A repeats twice and B is missing.

    Input Format:  array[] = {3,1,2,5,3}
    Result: {3,4)
    Explanation: A = 3 , B = 4 
    Since 3 is appearing twice and 4 is missing
 */

import java.util.Arrays;
public class Q2025_07_06_easy {
    public static void main(String[] args){
        int[] arr = {3,1,2,5,4,6,7,5};
        System.out.println(Arrays.toString(missingAndRepeatingNumber(arr)));
    }
    public static int[] missingAndRepeatingNumber(int[] arr){
        int i = 0;
        while(i < arr.length){
            int correctIndex = arr[i] - 1;
            if(arr[i] != arr[correctIndex]){
                swap(arr,i,correctIndex);
            } else  {
                i++;
            }
        }
        int m = -1;
        int r = -1;
        boolean flag = true;
        for(int j = 0;j<arr.length;j++){
            if(j != arr[j] - 1){
                if(r==-1 && flag){
                    r = arr[j];
                    flag = false;
                }
                m = j+ 1;
            }
        }
        return new int[]{r,m};
    }
    public static void swap(int[] arr,int stIndex,int enIndex){
        int temp = arr[stIndex];
        arr[stIndex] = arr[enIndex];
        arr[enIndex] = temp;
    }
}
