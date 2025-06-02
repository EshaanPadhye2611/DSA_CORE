class Solution {
    static int maxElement(int[] nums, int start, int end){
        int max = start;
        for(int i = start;i<=end;i++){
            if(nums[max] < nums[i]){
                max = i;
            }
        }
        return max;
    }

    static void swapElement(int[] nums, int x, int  y ){
        int temp = nums[x];
        nums[x] = nums[y];
        nums[y] = temp;
    }
    public int[] selectionSort(int[] nums) {
        for(int i = 0;i<nums.length;i++){
        int last = nums.length - i - 1;
        int maxIndex = maxElement(nums,0,last);
        swapElement(nums,maxIndex, last);
        }
        
  return nums;
    }
  
}