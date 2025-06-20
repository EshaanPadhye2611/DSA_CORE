class Solution {
    public int characterReplacement(String s, int k) {
        if(s.length() == 1 && k ==1) return 1;
        if(s.length() == 1 && k == 0) return 1;
        
         int maxf = 0;
        char[] arr = s.toCharArray();
        int left = 0;
        int right  = 0;
        int result = 0;
        while(left <= right && right < arr.length){
            if(arr[left] ==  arr[right]){
                maxf++;
                result = Math.max(result,right- left + 1);
                
            }else if(k != 0){
                if((right - left + 1) - maxf > k) break;
                result = Math.max(result,right- left + 1);
                    
                
            }
           
            right++;

        }
        return result;
         
    }
}