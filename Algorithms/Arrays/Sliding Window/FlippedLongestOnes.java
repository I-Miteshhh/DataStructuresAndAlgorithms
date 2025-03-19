/**
Given a binary array nums and an integer k, return the maximum number of consecutive 1's in the array if you can flip at most k 0's.

Example 1:

Input: nums = [1,1,1,0,0,0,1,1,1,1,0], k = 2
Output: 6
Explanation: [1,1,1,0,0,1,1,1,1,1,1]
*/
class Solution {
    public int flippedlongestOnes(int[] nums, int k) {
        int max = 0; 
        int start = 0; 
        int zerosCount = 0; 
        for (int end = 0; end < nums.length; end++) {
            if (nums[end] == 0) {
                zerosCount++;
            }
            while (zerosCount > k) {
                if (nums[start] == 0) {
                    zerosCount--; 
                }
                start++;
            }
            max = Math.max(max, end - start + 1);
        }
        return max;
    }
}
