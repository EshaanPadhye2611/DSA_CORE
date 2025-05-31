class Solution {
    public int missingNumber(int[] nums) {
        int result = 0;
        Arrays.sort(nums);
        if(nums[nums.length-1] != nums.length){
                return nums.length;
        }
        for(int i = 1;i<nums.length;i++){
            if(nums[i] == nums[i-1] + 1){
                continue;
            }else{
                return result = nums[i] - 1;
            }
            
        }
        return result;
    }
}