class Solution {
    public int[] runningSum(int[] nums) {
        int sum = 0;
        int[] prefix = new int[nums.length];
        int index = 0;
        for(int x:nums){
            sum += x;
            prefix[index++] = sum;

        }
        return prefix;
        
    }
}