/*
Given two sorted arrays nums1 and nums2 of size m and n respectively, return the median of the two sorted arrays.

The overall run time complexity should be O(log (m+n)).

Example 1:

Input: nums1 = [1,3], nums2 = [2]
Output: 2.00000
Explanation: merged array = [1,2,3] and median is 2.
*/
class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int combinedLength = nums1.length + nums2.length;
        int medianIndex1 = (combinedLength - 1) / 2; 
        int medianIndex2 = combinedLength / 2; 
        int i = 0, j = 0, counter = 0;
        int median1 = 0, median2 = 0;
        while (counter <= medianIndex2) {
            int value;
            if (i < nums1.length && (j >= nums2.length || nums1[i] <= nums2[j])) {
                value = nums1[i++];
            } else {
                value = nums2[j++];
            }

            if (counter == medianIndex1) {
                median1 = value;
            }
            if (counter == medianIndex2) {
                median2 = value;
            }
            counter++;
        }
        return combinedLength % 2 == 0 ? (median1 + median2) / 2.0 : median2;
    }
}
