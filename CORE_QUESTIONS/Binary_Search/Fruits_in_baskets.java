class Solution {
    public int numOfUnplacedFruits(int[] fruits, int[] baskets) {
        int count =fruits.length;
       Queue<Integer> pq = new LinkedList<>();
       ArrayList<Integer> list = new ArrayList<>();
       for(int x:baskets) list.add(x);

        for(int x: fruits){
            pq.offer(x);
        }
        
        while(!pq.isEmpty()){
            int top = pq.poll();
            for(int i = 0;i<list.size();i++){
            if(top <= list.get(i)){
                count--;
                list.remove(i);
                break;
            }
            
        }

        }
        return count;
    }
}