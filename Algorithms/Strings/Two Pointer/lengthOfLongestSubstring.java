/*
Given a string s, find the length of the longest substring without duplicate characters.

Example 1:

Input: s = "abcabcbb"
Output: 3
Explanation: The answer is "abc", with the length of 3.
Example 2:

Input: s = "bbbbb"
Output: 1
Explanation: The answer is "b", with the length of 1.
*/
import java.util.HashSet;

class Solution {
    public int lengthOfLongestSubstring(String s) {
        int start = 0, end = 0, max = 0;
        HashSet<Character> set = new HashSet<>();
        while (end < s.length()) {
            if (set.contains(s.charAt(end))) {
                set.remove(s.charAt(start));
                start++;
            } else {
                set.add(s.charAt(end));
                max = Math.max(max, end - start + 1);
                end++;
            }
        }
        return max;
    }
}
