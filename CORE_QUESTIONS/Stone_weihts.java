class Solution {
    public int lastStoneWeight(int[] stones) {
        if(stones.length == 1){
            return stones[0];
        }
        PriorityQueue<Integer> pq = new PriorityQueue<>((a, b) -> b - a);

        for(int x: stones){
            pq.offer(x);
        }

        while(pq.size() > 1){
            int top = pq.poll();
            int second = pq.poll();

            if(top != second){
                pq.offer(top - second);
            }
        }
        if(pq.size() == 1){
            return pq.peek();
        }
        return 0;
        
    }
}