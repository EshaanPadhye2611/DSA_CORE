class Solution {
    public int[] maxSubsequence(int[] nums, int k) {
        if(nums.length == k){
            return nums;
        }
        int j = 0;
        PriorityQueue<int[]> pq = new PriorityQueue<>((a,b) -> a[0] - b[0]);
       
        for (int i = 0; i < nums.length; i++) {
            pq.offer(new int[]{nums[i], i});
            if (pq.size() > k) {
                pq.poll();
            }
        }
        int[] arr =new int[k];
        TreeMap<Integer,Integer> map = new TreeMap<>(); 
        while(!pq.isEmpty()){
            int[] top = pq.poll();

            map.put(top[1], top[0]);

         }
         for(int x: map.values()){
            arr[j++] = x;
         }
         return arr;
        
    }
}