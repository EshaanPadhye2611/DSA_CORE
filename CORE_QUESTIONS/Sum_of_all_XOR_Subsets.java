class Solution {
    public int subsetXORSum(int[] nums) {
        int total = 0;
        int n = nums.length;
        int count  = 1 << n;
        for(int mask = 0;mask<count;mask++){
            int ans = 0;
            for(int i = 0;i<n;i++){
                if((mask & (1 << i)) != 0){
                    ans = ans ^ nums[i];
                }
            }
            total += ans;
        }
        return total;
    }
}