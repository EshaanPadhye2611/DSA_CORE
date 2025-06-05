class Solution {
    public int fillCups(int[] amount) {
        int count  = 0;
      
      PriorityQueue<Integer> pq = new PriorityQueue<>((a,b) -> b - a);
      for(int x:amount){
        if(x > 0)
        pq.offer(x);
      }

      while(!pq.isEmpty()){
        int first = pq.poll();

        if(pq.isEmpty()){
            count = count + first;
            break;
        }


        int second  = pq.poll();
        first--;
        second--;
        count++;

        if(first > 0) pq.offer(first);
        if(second > 0) pq.offer(second);
      }
      return count;
    }
}