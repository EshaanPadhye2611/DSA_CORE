class Solution {
    public int maxFrequency(int[] nums, int k) {
        int left = 0;
        int right = 0;
        long total = 0;
       int result = 0;
        Arrays.sort(nums);
        while(right < nums.length){
            total = total + nums[right];
            while((long)nums[right] * (right - left + 1) > total + k){
                
                total = total - nums[left];
                left++;
            }
            result = Math.max(result, (right - left + 1));
            right++;
        }
        return result;
        
    }
}