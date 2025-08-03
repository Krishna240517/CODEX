/*  Given two sorted arrays nums1 and nums2 of size m and n respectively, return the median of the two sorted arrays.
    Input: nums1 = [1,3], nums2 = [2]
    Output: 2.00000
    Explanation: merged array = [1,2,3] and median is 2.
 */


public class  Q2025_08_03_hard {
    public static void main(String[] args) {
        int[] nums1 = {1,3};
        int[] nums2 = {2};
        System.out.println(findMedianSortedArrays(nums1, nums2));
    }
    public static double findMedianSortedArrays(int[] nums1, int[] nums2) {
        //merge
        int i = 0;
        int j = 0;
        int[] res = new int[nums1.length+nums2.length];
        int k = 0;
        while(i < nums1.length && j < nums2.length) {
            if(nums1[i] < nums2[j]) {
                res[k++]= nums1[i++];
            } else {
                res[k++] = nums2[j++];
            }
        }

        while(i < nums1.length) {
            res[k++] = nums1[i++];
        }
        while(j < nums2.length) {
            res[k++] = nums2[j++];
        }

        int val = res.length / 2;
        if(res.length % 2 == 0){
            
            return ((double)res[val] + res[val - 1]) / 2;
        } else {
            return (double)res[val];
        }
    }
}