class Solution {
    public int maxAbsoluteSum(int[] arr) {
         
         int minSum = 0;
         int maxSum = 0;
         int res = arr[0];

         for(int i = 0;i<arr.length;i++){
            
            int v1 = minSum+arr[i];
            int v2 = maxSum +arr[i];
            int v3 = arr[i];

            minSum = Math.min(v1,v3);
            maxSum = Math.max(v2,v3);

            res = Math.max(res, Math.max(Math.abs(minSum),Math.abs(maxSum)));


         }

         return res;

    }
}