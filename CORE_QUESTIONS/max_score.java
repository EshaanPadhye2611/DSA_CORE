class Solution {
    public int maxScore(String s) {
        char[] arr = s.toCharArray();
        int total = 0;
        int zeroCount = 0;
        int result = 0;
        
        for(char c:arr){
            if(c == '1'){
                total++;
            }
        }
        for(char c = 0;c < arr.length - 1;c++){
            
            int sum  = 0;
            if(arr[c] == '0'){
             zeroCount++;
            }else if(arr[c] == '1'){
                total--;
            }
            sum = zeroCount + total;
          result = Math.max(result,sum);
        }
        return result;
    }
}