/**
You are climbing a staircase. It takes n steps to reach the top.

Each time you can either climb 1 or 2 steps. In how many distinct ways can you climb to the top?

Example 1:

Input: n = 2
Output: 2
Explanation: There are two ways to climb to the top.
1. 1 step + 1 step
2. 2 steps
 */
class Solution {
    public int climbStairs(int n) {
        if(n==1){
            return 1;
        }
        int prev1 = 1;
        int prev2 = 2;
        int current = 0;
        for(int i=3; i<=n; i++){
            current = prev1+prev2;
            prev1 = prev2;
            prev2 = current;
        }
        return prev2;
    }
}