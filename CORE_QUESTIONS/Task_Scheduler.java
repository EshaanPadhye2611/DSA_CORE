class Solution {
    public int leastInterval(char[] tasks, int n) {
        int[] freq = new int[26];
        int time = 0;
        for(char task:tasks){
            freq[task - 'A']++;
        }

        PriorityQueue<Integer> pq = new PriorityQueue<>((a,b) -> b - a);
        for(int x:freq){
            if(x>0)
            pq.offer(x);
        }
        while(!pq.isEmpty()){
            ArrayList<Integer> list = new ArrayList<>();
            int cycle = n + 1;
            for(int i=0;i<cycle;i++){
           
            if(!pq.isEmpty()){
                int top = pq.poll();
                top--;
                if(top > 0){
                    list.add(top);
                }

            }
            time++;
            if(pq.isEmpty() && list.isEmpty()) break;
            }

            for(int x:list){
                pq.offer(x);
            }

        }
        return time;

        
    }
}