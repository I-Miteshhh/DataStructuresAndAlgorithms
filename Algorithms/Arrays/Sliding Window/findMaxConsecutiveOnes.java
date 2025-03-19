/**
Given a binary array nums, return the maximum number of consecutive 1's in the array.

Example 1:

Input: nums = [1,1,0,1,1,1]
Output: 3
Explanation: The first two digits or the last three digits are consecutive 1s. The maximum number of consecutive 1s is 3.
*/
class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int max = 0;
        int start = 0; 
        for (int end = 0; end < nums.length; end++) {
            if (nums[end] == 1) {
            } 
            else {
                start = end + 1;
            }
            max = Math.max(max, end - start + 1);
        }
        return max;
    }
}
