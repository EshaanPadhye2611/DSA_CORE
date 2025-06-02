class Solution {
    static void swapElement(int[] nums, int x ,int y ){
        int temp = nums[x];
        nums[x] = nums[y];
        nums[y] = temp;
    }
    public int[] insertionSort(int[] nums) {
        for(int i = 0;i<nums.length-1;i++){
            for(int j = i + 1;j>0;j--){
                if(nums[j] < nums[j-1]){
                    swapElement(nums,j,j-1);

                }
                else{
                    break;
                }
            }
        }
        return nums;

    }
}