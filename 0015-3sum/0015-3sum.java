import java.util.*;

class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        
        Arrays.sort(nums);  
        
        for (int i = 0; i < nums.length - 2; i++) {
            
            if (i > 0 && nums[i] == nums[i - 1]) {
                continue;
            }
            
            int left = i + 1;
            int k = nums.length - 1;
            
            while (left < k) {
                int sum = nums[i] + nums[left] + nums[k];
                
                if (sum == 0) {
                    result.add(Arrays.asList(nums[i], nums[left], nums[k]));
                    
                   
                    while (left < k && nums[left] == nums[left + 1]) {
                        left++;
                    }
                    
                   
                    while (left < k && nums[k] == nums[k - 1]) {
                        k--;
                    }
                    
                    left++;
                    k--;
                    
                } else if (sum < 0) {
                    left++; 
                } else {
                    k--; 
                }
            }
        }
        
        return result;
    }
}       