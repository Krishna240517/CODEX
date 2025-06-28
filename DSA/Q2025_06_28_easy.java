//Write a Java Program to calculate Second Largest Number in a given array
/*ex: arr[] = {1,3,5,6,7,8,112,4,9};
      output: 9
      explanation: 9 is the second largest number in the array
*/


public class Q2025_06_28_easy {
    public static void main(String[] args) {
        int[] arr = {1,3,5,6,7,8,112,4,9};
        int ans = returnSecondLargest(arr);
        System.out.println(ans);
    }

    public static int returnSecondLargest(int[] arr){
        int max = Integer.MIN_VALUE;
        int smax = -1;
        for(int i = 0;i<arr.length;i++){
            if(arr[i] > max){
                smax = max;
                max = arr[i];
            } else if(arr[i] < max && arr[i] > smax){
                smax = arr[i];
            }
        }
        return smax;
    }
}
