class Solution {
    public int removeDuplicates(int[] arr) {
         
         int duplicate = arr[0];
         int k =1 ;

         for(int i=1;i<arr.length;i++){
            if(arr[i]!=duplicate){
                duplicate = arr[i];
                arr[k]=arr[i];
                k++;
            }
         }
        return k;
    }
}