class Solution {
    public void sortColors(int[] nums) {
      int low= 0;
      int mid = 0;
      int high = nums.length-1;


      while(mid<=high){
        if(nums[mid]==2){
           swap(nums,mid,high);
           high--;
        }
        else if(nums[mid]==1){
            mid++;
        }
        else{
            swap(nums, mid,low);
            low++;
            mid++;
        }

      }


    }
       public void swap(int nums[], int a, int b){
        int temp = nums[a];
        nums[a] =nums[b];
        nums[b]= temp;
      }
}