class Solution {
    public void rotateArrayByOne(int[] nums) {
        int[] arr = new int[nums.length];

        for(int i = nums.length-1;i>0;i--){
            arr[(i-1) % nums.length] = nums[i];

        }
        arr[nums.length-1] = nums[0];

        for(int i = 0;i<arr.length;i++){
            nums[i] = arr[i];
        }
        
    }
}