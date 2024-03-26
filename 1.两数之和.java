/*
 * @lc app=leetcode.cn id=1 lang=java
 *
 * [1] 两数之和
 */

// @lc code=start

import java.util.Map;

class Solution {
    public int[] twoSum(int[] nums, int target) {
        // using hashmap to store the value and index
        HashMap<Integer, Integer> map = new HashMap<>();
        // loop the array
        for (int i = 0; i < nums.length; i++) {
            // calculate the need value
            int need = target - nums[i];
            // check if the need value is in the map
            if (map.containsKey(need)) {
                // if it is in the map, return the index
                return new int[]{map.get(need), i};
            }
            // put the value and index into the map
            map.put(nums[i], i);
        }
        // if no result, return null
        return null;
    }
}
// @lc code=end

