public class Binary_subarray {
    
}
class Solution {
    public int numSubarraysWithSum(int[] nums, int goal) {
        int left = 0;
        int count  = 0;
        while(left < nums.length){
            int right  = left;
            int sum  = 0;
            while(right < nums.length){
                sum += nums[right];
                if(sum == goal) count++;
                right++;

            }
            left++;
            
        }
        return count;
    }
}