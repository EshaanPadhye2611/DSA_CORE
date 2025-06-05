class Solution {
    public int maxProduct(int[] nums) {
        PriorityQueue<Integer> pq = new PriorityQueue<>((a,b) -> b - a);

        for(int x:nums){
            pq.offer(x);
        }
        int top = pq.poll();
        int second = pq.peek();

        return (top- 1) * (second-1);
        
    }
}