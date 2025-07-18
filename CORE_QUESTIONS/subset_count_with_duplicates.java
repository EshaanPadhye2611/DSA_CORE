class Solution {
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        Arrays.sort(nums);
        int  n = nums.length;
        int count = 1 << n;
       Set<List<Integer>> set = new HashSet<>();
        for(int i = 0;i<count;i++){
            ArrayList<Integer> list1 = new ArrayList<>();
            for(int j = 0;j<n;j++){
                if((i & (1 << j)) != 0){
                    list1.add(nums[j]);
                    
                }
            }
            set.add(new ArrayList<>(list1));
        }
        return new ArrayList<>(set);
    }
}