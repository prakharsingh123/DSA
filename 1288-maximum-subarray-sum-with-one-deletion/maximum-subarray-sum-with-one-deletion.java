class Solution {
    public int maximumSum(int[] arr) {
        int onedelete = 0;
        int nodelete = arr[0];
        int res = arr[0];

        for(int i=1;i<arr.length;i++){
            
            int prevDelete = onedelete;
            int prevNoDelete = nodelete;

            nodelete = Math.max(prevNoDelete+arr[i], arr[i]);

            onedelete = Math.max(prevNoDelete, prevDelete +arr[i]);
        
          
         res = Math.max(res, Math.max(onedelete,nodelete));

        }

        return res;
    }
}