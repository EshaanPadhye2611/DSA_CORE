class Solution {
    public int longestSubarray(int[] nums) {
        if(nums.length == 1) return 0;
        int count = 0;
        int delete = 0;
        int left = 0;
        int k = 1;
        int result = 0;
        int one = 0;
        for(int right = 0;right<nums.length;right++){
            if(nums[right] == 0){
                count++;
                delete++;
            }
            if(nums[right] == 1)one++;
            
            while(count > k){
                if(nums[left] == 0){
                    count--;
                    delete--;
                }
                left++;
            }
            if(delete != 0){
                result = Math.max(result,((right - left + 1) - count));
            }
            
        }
        if(one == nums.length) return nums.length - 1;
        
        if(count == nums.length) return 0;

        return result;
    }
}