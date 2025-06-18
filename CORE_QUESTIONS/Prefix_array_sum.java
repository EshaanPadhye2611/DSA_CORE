class Solution {
    public int numberOfSubarrays(int[] nums, int k) {
        int n = nums.length;
        int[] prefix = new int[n + 1]; 
        prefix[0] = 1;  

        int oddCount = 0;
        int result = 0;

        for (int num : nums) {
          
            if (num % 2 != 0) {
                oddCount++;
            }

           
            if (oddCount - k >= 0) {
                result += prefix[oddCount - k];
            }

           
            prefix[oddCount]++;
        }

        return result;
    }
}
