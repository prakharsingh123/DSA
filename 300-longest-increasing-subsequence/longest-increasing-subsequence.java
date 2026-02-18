class Solution {

    Integer[][] dp;

    public int solve(int[] nums, int i, int prevIndex) {

        if (i == nums.length) {
            return 0;
        }

        if (dp[i][prevIndex + 1] != null) {
            return dp[i][prevIndex + 1];
        }

        // Skip current element
        int skip = solve(nums, i + 1, prevIndex);

        // Take current element (only if valid)
        int take = 0;
        if (prevIndex == -1 || nums[i] > nums[prevIndex]) {
            take = 1 + solve(nums, i + 1, i);
        }

        return dp[i][prevIndex + 1] = Math.max(take, skip);
    }

    public int lengthOfLIS(int[] nums) {

        dp = new Integer[nums.length][nums.length + 1];

        return solve(nums, 0, -1);
    }
}
