/**
You are given a large integer represented as an integer array digits, where each digits[i] is the ith digit of the integer. The digits are ordered from most significant to least significant in left-to-right order. The large integer does not contain any leading 0's.

Increment the large integer by one and return the resulting array of digits.

Example 1:

Input: digits = [1,2,3]
Output: [1,2,4]
Explanation: The array represents the integer 123.
Incrementing by one gives 123 + 1 = 124.
Thus, the result should be [1,2,4].

Example 2:

Input: digits = [9]
Output: [1,0]
Explanation: The array represents the integer 9.
Incrementing by one gives 9 + 1 = 10.
Thus, the result should be [1,0].
 */
class Solution {
    public int[] plusOne(int[] digits) {
        int lastIndex = digits.length - 1;
            while(lastIndex >= 0){
                if(digits[lastIndex] == 9){
                    digits[lastIndex] = 0;
                }
                else{
                    digits[lastIndex] = digits[lastIndex] + 1;
                    return digits;
                }
                lastIndex--;
            }
            int[] newDigits = new int[digits.length + 1];
            newDigits[0] = 1;
            return newDigits;
    }
}