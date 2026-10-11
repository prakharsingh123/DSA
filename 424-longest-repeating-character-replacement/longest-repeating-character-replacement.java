class Solution {
    public int characterReplacement(String s, int k) {
        
      int low = 0;
      int res= Integer.MIN_VALUE;
      int arr[] = new int[256];
      int maxFreq = 0;

      for(int high = 0;high<s.length();high++){
            char ch = s.charAt(high);
        arr[ch]++;

    maxFreq = Math.max(maxFreq, arr[ch]);
    int len = high-low+1;
    int diff = len-maxFreq;

            while(diff>k){
               char left = s.charAt(low);
               arr[left]--;
                low++;
             len = high-low+1;
             diff = len-maxFreq;
             
               
            }

            res = Math.max(res,len);

      }
           return res;
    }
}