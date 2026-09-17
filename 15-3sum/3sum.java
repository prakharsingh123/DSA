class Solution {
    public List<List<Integer>> threeSum(int[] nums) {

        Arrays.sort(nums);

        List<List<Integer>> ans = new ArrayList<>();

        for (int i = 0; i < nums.length - 2; i++) {

            if (i > 0 && nums[i - 1] == nums[i]) {
                continue;
            }

            HashSet<Integer> set = new HashSet<>();

            for (int j = i + 1; j < nums.length; j++) {

                int third = -(nums[i] + nums[j]);

                if (set.contains(third)) {

                    ans.add(Arrays.asList(
                        nums[i],
                        third,
                        nums[j]
                    ));

                    // Skip duplicate third elements
                    while (j + 1 < nums.length &&
                           nums[j] == nums[j + 1]) {
                        j++;
                    }
                }

                set.add(nums[j]);
            }
        }

        return ans;
    }
}