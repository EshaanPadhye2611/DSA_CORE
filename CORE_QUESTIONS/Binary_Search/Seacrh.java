class Solution {
    public int maximumCount(int[] nums) {
        if(nums[0] > 0 && nums[nums.length - 1] > 0){
            return nums.length;
        }else if(nums[0] < 0 && nums[nums.length - 1] < 0){
            return nums.length;
        }
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for(int x:nums) pq.offer(x);
        int n = 0;
        int p = 0;
        int max = 0;
        while(!pq.isEmpty()){
            int top = pq.poll();
            if(top < 0){
                n++;
                
            }else if(top > 0){
                p++;
            }
        }
        
        max = Math.max(n,p);
        return max;
    }
}