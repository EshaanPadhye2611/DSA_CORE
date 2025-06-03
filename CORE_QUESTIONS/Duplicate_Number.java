class Solution {
    public int findDuplicate(int[] nums) {
        int correct = 0;
        for(int i =0;i<nums.length;i++){
            while(nums[i] != nums[nums[i] - 1]){
            correct = nums[i] - 1;
            int temp = nums[i];
            nums[i] = nums[correct];
            nums[correct] = temp;
            }
        }
        for(int i =0;i<nums.length;i++){
            if(i + 1 != nums[i]){
                return nums[i];
            }
        }
        return -1;
        
    }
}