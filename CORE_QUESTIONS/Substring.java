class Solution {
    public int divisorSubstrings(int num, int k) {
         String s = "" + num;
         if(s.length() == 1 && k > 1) return 0;
         if(s.length() == 1) return 1;
        
        int count  = 0;
        int left = 0;
        int right = k;
       
        while(right <= s.length()){
            String b = s.substring(left,right);
            int n = Integer.parseInt(b);
            if(n == 0) {
               continue;
            }
           else if( (num % n) == 0){
                count++;
              
            }
             left++;
                right++;
            
        }
        return count;
    }
}