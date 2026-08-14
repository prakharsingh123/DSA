class Solution {
    public boolean isHappy(int n) {

        // n==1 jb tk nhi hai tb tk loop chlega 
        // set me agar mai add krdu number chlega 
        // fir unke indivduals ka sum 
       

       HashSet<Integer>set = new HashSet<>();


        while(n!=1){

         if(set.contains(n)){
            return false;
          }
            set.add(n);

          int sum = 0;

          while (n > 0) {
            int digit = n % 10;
             sum += digit * digit;
             n = n / 10;
        }
        n= sum;
        }
        return true;
        
    }
}