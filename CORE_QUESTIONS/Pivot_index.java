class Solution {
    public int pivotIndex(int[] nums) {
        int totalSum = 0;
        int leftSum = 0;
        for(int x:nums){
            totalSum += x;
        }
        for(int i = 0;i<nums.length;i++){
            if(totalSum == leftSum + nums[i] + leftSum){
                return i;
            }
            leftSum += nums[i];
        }

       
      return -1;
    }
}