class Solution {
    public int removeDuplicates(int[] arr) {
       
     int slow= 2;

     for(int fast = 2; fast<arr.length; fast++){
        if(arr[fast]!= arr[slow-2]){
           arr[slow]= arr[fast];
           slow++;
        }
        
     }

      return slow;
    }
}