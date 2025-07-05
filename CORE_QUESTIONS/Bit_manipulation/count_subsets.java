class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
       
        int n  = nums.length;
        int count = 1 << n;
        for(int i = 0;i<count;i++){
            List<Integer> list = new ArrayList<>();
            for(int j = 0;j<n;j++){
                if((i & (1 << j)) != 0){
                    list.add(nums[j]);
                    
                }
            }
            result.add(new ArrayList<>(list));
        }
        return result;
    }
}