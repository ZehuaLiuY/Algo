/*
 * @lc app=leetcode.cn id=11 lang=java
 *
 * [11] 盛最多水的容器
 */

// @lc code=start
class Solution {
    public int maxArea(int[] height) {
        //  res是最大面积
        int res = 0;
        //  left是左边界，right是右边界
        int left = 0, right = height.length-1;
        while (left < right){
            // area是当前面积
            int area = Math.min(height[left], height[right]) * (right - left);
            res = Math.max(res, area);
            if (height[left] < height[right]){
                left++;
            }else{
                right--;
            }
        }
        return res;
    }
}
// @lc code=end

