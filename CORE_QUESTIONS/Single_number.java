class Solution {
    public int singleNumber(int[] nums) {
        if(nums.length == 1){
            return nums[nums.length-1];
        }
        
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int x:nums){
            map.put(x,map.getOrDefault(x,0) + 1);
        }
        for(int x:map.keySet()){
            if(map.get(x) == 1){
                return x;
            }
        }
        return -1;
    }
}