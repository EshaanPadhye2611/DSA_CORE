class Solution {
    public int majorityElement(int[] nums) {
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int x:nums){
            map.put(x,map.getOrDefault(x,0) + 1);
        }
        int maxF = 0;
        int max = 0;
         for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if(entry.getValue() > maxF){
                maxF= entry.getValue();
                max = entry.getKey();
            }

         }
         return max;
    }
}