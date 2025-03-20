/**
Given two binary strings a and b, return their sum as a binary string.

Example 1:

Input: a = "11", b = "1"
Output: "100"
Example 2:

Input: a = "1010", b = "1011"
Output: "10101"

 */
class Solution {
    public String addBinary(String a, String b) {
        StringBuilder result = new StringBuilder();
        int carry = 0;
        int i = a.length() - 1;
        int j = b.length() - 1;
        while (i >= 0 || j >= 0 || carry > 0) {
            int bitA = (i >= 0) ? a.charAt(i) - '0' : 0; 
            int bitB = (j >= 0) ? b.charAt(j) - '0' : 0; 
            int sum = bitA + bitB + carry;
            switch (sum) {
                case 0:
                    result.append('0'); 
                    carry = 0; 
                    break;
                case 1:
                    result.append('1');
                    carry = 0;
                    break;
                case 2:
                    result.append('0');
                    carry = 1;
                    break;
                case 3:
                    result.append('1');
                    carry = 1;
                    break;
            }
            i--; 
            j--; 
        }
        return result.reverse().toString();
    }
}
