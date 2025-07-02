/*
    Given an array nums of size n, return the majority element.

    The majority element is the element that appears more than ⌊n / 2⌋ times. You may assume that the majority element always exists in the array.

    Input: nums = [2,2,1,1,1,2,2]
    Output: 2
 */
public class Q2025_07_02_easy {
    public static void main(String[] args){

    }
    public static int majorityElement(int[] arr){
        int count = 0;
        int ele = Integer.MIN_VALUE;
        for(int i = 0;i<arr.length;i++){
            if(count == 0){
                ele = arr[i];
                count = 1;
            }
            else if(arr[i] == ele){
                count++;
            } else {
                count--;
            }
        }
        //check if the element is occuring more than [n/2] times
        int elCount = 0;
        for(int i = 0;i<arr.length;i++){
            if(arr[i] == ele){
                elCount++;
            }
        }
        if(elCount > (int)(arr.length / 2)){
            return ele;
        } 
        return -1;
    }
}
