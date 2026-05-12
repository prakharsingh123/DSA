class Solution {
    public int searchInsert(int[] arr, int target) {
         int start = 0;
         int end = arr.length-1;

         while(start<=end){
            int m = start+(end-start)/2;

            if(arr[m]==target){
                return m;
            }
            else if(arr[m]<target ){
                start = m+1;

            }else{
                end = m-1;
            }
         }
         return start;
    }
}