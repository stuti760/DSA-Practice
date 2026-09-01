import java.util.HashMap;

class Solution {
    public int numSubarraysWithSum(int[] nums, int goal) {

        HashMap<Integer, Integer> map = new HashMap<>();

        
        map.put(0, 1);
        int prefix = 0;
        int count = 0;

        for (int num : nums) {

            prefix += num;

            int target = prefix - goal;

            count += map.getOrDefault(target, 0);

            map.put(prefix, map.getOrDefault(prefix, 0) + 1);
        }

        return count;
    }
}