class Solution {
    public int maxSum(int[] arr) {
        
        int min = Integer.MIN_VALUE;
        int ans  = 0;
        HashSet<Integer> set = new HashSet();
        int sum =0;


        for(int i= 0;i<arr.length;i++){
              
              if(arr[i]>0){
                set.add(arr[i]);
              }
              else{
                min = Math.max(min,arr[i]);
              }
                

        }

       for (int num : set) {
             sum += num;
        }
        
        if(set.size()==0){
            return min;
        }
          
          return sum;

    }
}