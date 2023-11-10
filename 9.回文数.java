/*
 * @lc app=leetcode.cn id=9 lang=java
 *
 * [9] 回文数
 */

// @lc code=start
class Solution {
    public boolean isPalindrome(int x) {
        // check if x is negative
        if (x < 0) return false;

        // reverse x
        int rev = 0;
        int temp = x;
        while (temp!= 0){
            //last digit
            int pop = temp % 10;
            temp /= 10;
            rev = rev * 10 + pop;
        }
        return x == rev;
    }
}
// @lc code=end

