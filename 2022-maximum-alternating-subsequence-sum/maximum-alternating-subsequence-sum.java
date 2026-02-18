class Solution {

    Long[][] dp;

    public long solve(int[] nums, int i, boolean flag) {

        if (i >= nums.length) {
            return 0;
        }

        int f = flag ? 1 : 0;

        if (dp[i][f] != null) {
            return dp[i][f];
        }

        // Skip current element
        long skip = solve(nums, i + 1, flag);

        // Take current element
        long val = flag ? nums[i] : -nums[i];
        long take = val + solve(nums, i + 1, !flag);

        return dp[i][f] = Math.max(skip, take);
    }

    public long maxAlternatingSum(int[] nums) {

        dp = new Long[nums.length][2];

        return solve(nums, 0, true);
    }
}
