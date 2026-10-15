class Solution {
    public int maxSubArray(int[] arr) {
        int bestending  = arr[0];
        int ans = arr[0];

        for(int i = 1;i<arr.length;i++){
            int v1 = arr[i];
             int v2 = bestending + arr[i];
            bestending = Math.max(v1,v2  );
         ans = Math.max(ans,bestending);
        }
        return ans;
    }
}
