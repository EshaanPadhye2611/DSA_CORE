class Solution {
    public List<Integer> subsetSums(int[] nums) {
       int  n = nums.length;
        int count = 1 << n;
       List<List<Integer>> list = new ArrayList<>();
       List<Integer> result = new ArrayList<>();
        for(int i = 0;i<count;i++){
            ArrayList<Integer> list1 = new ArrayList<>();
            for(int j = 0;j<n;j++){
                if((i & (1 << j)) != 0){
                    list1.add(nums[j]);
                    
                }
            }
            list.add(new ArrayList<>(list1));
    }

    for(List<Integer> m : list){
        int sum = 0;
        for(int x:m){
          sum += x;
        }
        result.add(sum);
    }
    return result;
}
}