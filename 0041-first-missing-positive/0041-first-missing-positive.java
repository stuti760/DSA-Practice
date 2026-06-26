class Solution {
    public int firstMissingPositive(int[] nums) {
        int n = nums.length;

        int greatest = 0;
        HashSet<Integer> set = new HashSet<>();

        for(int i =0;i<n;i++){
            greatest = Math.max(greatest,nums[i]);
            set.add(nums[i]);
        }

        for(int i = 1;i<= greatest;i++){
            if(!set.contains(i)) return i;
        }
        return (greatest + 1);
    }
}

// find greatest & add all in set 
// loop for 1 to greatest in not in set that's ans else greatest + 1 is the answers.