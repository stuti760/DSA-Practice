import java.util.Collections;
import java.util.List;

class Solution {
    public int countPairs(List<Integer> nums, int target) {
        Collections.sort(nums);
        int count = 0;
        int n = nums.size();
         for (int i = 0; i < n; i++) {
          int sec = target - nums.get(i);
          int lb = lowerBound(nums, sec);
             count += Math.min(i, lb);
        }
        
        return count;
    }

    private int lowerBound(List<Integer> nums, int val) {
        int low = 0;
        int high = nums.size() - 1;
        int ans = nums.size(); 
        
        while (low <= high) {
            int mid = low + (high - low) / 2;
            
            if (nums.get(mid) >= val) {
                ans = mid;      
                high = mid - 1;
            } else {
                low = mid + 1;   
            }
        }
        
        return ans;
    }
}