/**
Given an integer x, return true if x is a palindrome, and false otherwise.

Example 1:

Input: x = 121
Output: true
Explanation: 121 reads as 121 from left to right and from right to left.
Example 2:

Input: x = -121
Output: false
Explanation: From left to right, it reads -121. From right to left, it becomes 121-. Therefore it is not a palindrome.
*/
class Solution {
    public boolean isPalindrome(int x) {
        int flippedNumber = x;
        int reversedNumber = 0, lastDigit = 0;
        if(flippedNumber<0){
            return false;
        }
        else{
            while(flippedNumber > 0){
                lastDigit = flippedNumber % 10;
                reversedNumber =  reversedNumber * 10 + lastDigit;
                flippedNumber = flippedNumber / 10;
            }
        }
        return reversedNumber == x;
    }
}