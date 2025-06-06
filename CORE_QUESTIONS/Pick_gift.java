class Solution {
    public long pickGifts(int[] gifts, int k) {
        PriorityQueue<Integer> pq = new PriorityQueue<>((a,b) -> b - a);
        int time =0;
        long sum  = 0;
        for(int x:gifts){
            pq.offer(x);
        }
        while(time < k){
            int top = pq.poll();
            int pile = (int)Math.floor(Math.sqrt(top));  
            pq.offer(pile);
            time++;
        }
        while(!pq.isEmpty()){
            int top = pq.poll();
            sum = sum + top;
        }
        return sum;
    }
}