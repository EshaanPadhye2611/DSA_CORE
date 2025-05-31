class Solution {
    public void moveZeroes(int[] nums) {
         if (nums.length < 2) return;

        int start = 0;
        int end = 1;
        while(end < nums.length){
            
            if(nums[start] == 0 && nums[end] != 0){
                int temp = nums[start];
                nums[start] = nums[end];
                nums[end] = temp; 
                start ++;
                end++;
            }
            else if(nums[start] == 0 && nums[end] == 0)
            end++;

            else{
                start ++;
                end++;
            }
            
            
        }
        
        
    }
}