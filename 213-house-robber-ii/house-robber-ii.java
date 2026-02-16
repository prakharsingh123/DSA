class Solution {

    int[] dp;

    public int solve(int nums[], int start, int end){
        if(start > end){
            return 0;
        }

        if(dp[start] != -1){
            return dp[start];
        }

        int steal = nums[start] + solve(nums, start + 2, end);
        int skip = solve(nums, start + 1, end);

        return dp[start] = Math.max(steal, skip);
    }

    public int rob(int[] nums) {

        if(nums.length == 1) return nums[0];

        dp = new int[nums.length];
        Arrays.fill(dp, -1);
        int case1 = solve(nums, 0, nums.length - 2);

        dp = new int[nums.length];
        Arrays.fill(dp, -1);
        int case2 = solve(nums, 1, nums.length - 1);

        return Math.max(case1, case2);
    }
}
