class Solution {
    public long maximumSubarraySum(int[] arr, int k) {

        int i = 0;
        long sum = 0;
        long maxSum = 0;

        HashSet<Integer> set = new HashSet<>();

        for (int j = 0; j < arr.length; j++) {

            while (set.contains(arr[j])) {
                set.remove(arr[i]);
                sum -= arr[i];
                i++;
            }

            set.add(arr[j]);
            sum += arr[j];

            if (j - i + 1 == k) {
                maxSum = Math.max(maxSum, sum);

                set.remove(arr[i]);
                sum -= arr[i];
                i++;
            }
        }

        return maxSum;
    }
}
