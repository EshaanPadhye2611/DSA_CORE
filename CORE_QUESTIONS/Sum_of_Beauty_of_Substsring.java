class Solution {
    public int beautySum(String s) {
        int result = 0;
        
        for(int i = 0;i<s.length();i++){
            HashMap<Character,Integer> map = new HashMap<>();
            for(int j = i;j<s.length();j++){
                char c = s.charAt(j);
                map.put(c,map.getOrDefault(c,0)+1);
                int maxF = Integer.MIN_VALUE;
                int minF = Integer.MAX_VALUE;
                for(int value:map.values()){
                   
                     maxF = Math.max(maxF,value);
                     minF = Math.min(minF,value);
                   
                }
                 result = result + (maxF-minF);
            }
         

        }
        return result;
        
    }
}