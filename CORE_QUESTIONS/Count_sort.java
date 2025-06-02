class Solution {
    public void sortColors(int[] nums) {
        int max = nums[0];
        for(int x:nums){
            if(x > max){
                max = x;
            }
        }
        int[] count = new int[max + 1];
        for(int x:nums){
            count[x]++;
        }
        int idx = 0;
        for(int i = 0;i<count.length;i++){
            while(count[i] > 0){
                nums[idx++] = i;
                count[i]--;
            }
        }
    }
}