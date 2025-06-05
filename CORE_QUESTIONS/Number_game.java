class Solution {
    public int[] numberGame(int[] nums) {
        int[] arr = new int[nums.length];
        PriorityQueue<Integer> pq = new PriorityQueue<>((a,b) -> a - b);

        for(int x: nums){
            pq.offer(x);
        }
        int i=0;
        while(pq.size() > 1)
        {
            int top = pq.poll();
            int second = pq.peek();
            arr[i] = second;
            i++;
            arr[i] = top;
            second = pq.poll();
            i++;
        }
        return arr;
        
    }
}