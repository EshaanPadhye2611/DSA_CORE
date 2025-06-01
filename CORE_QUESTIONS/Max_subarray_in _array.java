class Solution {
    public int longestSubarray(int[] nums, int k) {
        Arrays.sort(nums);
        int left = 0;
        int right = 1;
        int result  = 0;
        while(left < right && right < nums.length){
            int sum = 0;
            
            for(int i = left;i<=right;i++){
                sum = sum + nums[i];

            }
            if(sum == k){
                result = Math.max(result, right - left + 1);
                left++;
            }

            else if(sum < k){
                right ++;
            }
            else{
                left++;
            }

            
           
           
        }
        return result;

    
       
    }
}