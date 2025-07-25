class Solution {
    public int[] findErrorNums(int[] nums) {
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
                return new int[]{nums[i], i+1};
            }
        }
        return nums;
    }
}