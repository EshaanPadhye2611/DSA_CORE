class Solution {
    public boolean canJump(int[] nums) {
        if (nums.length == 1) {
            return true; 
        }

        int end = nums.length - 1;

        for(int i = nums.length-2;i>=0;i--){
            if(i + nums[i] >= end){
                end = i;
            }
        }
        if(end == 0)
        return true;

        return false;
    }
}
