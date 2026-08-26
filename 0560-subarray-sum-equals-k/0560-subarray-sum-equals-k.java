import java.util.HashMap;
import java.util.Map;

class Solution {
    public int subarraySum(int[] nums, int k) {
        Map<Integer, Integer> map = new HashMap<>();
        
        // Base case: a prefix sum of 0 has occurred 1 time (handles subarrays starting at index 0)
        map.put(0, 1);
        
        int curr = 0;
        int res = 0;
        
        for (int i = 0; i < nums.length; i++) {
            curr += nums[i];
            
            
            res += map.getOrDefault(curr - k, 0);
            
            
            map.put(curr, map.getOrDefault(curr, 0) + 1);
        }
        
        return res;
    }
}