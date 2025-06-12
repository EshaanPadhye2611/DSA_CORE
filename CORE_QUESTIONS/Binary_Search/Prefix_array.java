class Solution {
    public int[] answerQueries(int[] nums, int[] queries) {
        Arrays.sort(nums);
        int[] prefix = new int[nums.length];
        int[] arr = new int[queries.length];
        prefix[0] = nums[0];
        for(int i =1;i<=nums.length-1;i++){
            prefix[i] = prefix[i-1] + nums[i];
        }
        
       for(int i = 0;i<queries.length;i++){
        int start = 0;
        int end = prefix.length - 1;
        int answer = 0;
        while(start <= end){
            int mid  = start + (end - start) / 2;
            if(prefix[mid] <= queries[i]){
                answer = mid + 1;
                start = mid + 1;   
            }else{
                end = mid - 1;
            }
        }
        arr[i] = answer;

        
       }
        
      return arr;
    }
}