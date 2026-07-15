class Solution {
    public int smallestDivisor(int[] nums, int threshold) {
        int max = 0;
        for (int num : nums) {
            max = Math.max(max, num);
        }

        int low = 1;
        int high = max;
        int ans = max;

        while (low <= high) {
            int mid = low + (high - low) / 2;
            
            if (check(nums, mid) <= threshold) { 
                ans = mid;
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return ans;
    }

    private int check(int[] nums, int divisor) {
        int sum = 0;
        for (int num : nums) {
            sum += (num + divisor - 1) / divisor;
        }
        return sum; 
    }
}
