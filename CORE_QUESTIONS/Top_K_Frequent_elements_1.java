class Solution {
    public List<String> topKFrequent(String[] words, int k) {
        HashMap<String,Integer> map = new HashMap<>();
        ArrayList<String> list = new ArrayList<>();
        int count =0;
        for(int i=0;i<words.length;i++){
            map.put(words[i],map.getOrDefault(words[i],0) + 1);
        }
        PriorityQueue<Map.Entry<String,Integer>> pq = new PriorityQueue<>((a,b) ->{
            if(a.getValue().equals(b.getValue())){
                return a.getKey().compareTo(b.getKey());
            }else{
                return b.getValue() - a.getValue();
            }
        });

            for(Map.Entry<String,Integer> entry:map.entrySet()){
                String key = entry.getKey();
                int value = entry.getValue();
                pq.offer(entry);

            }
        while(count < k){
             Map.Entry<String, Integer> top = pq.poll(); 
            String key = top.getKey();
            int value = top.getValue();
            list.add(key);
            count++;

            }
           
        return list;
    }
}