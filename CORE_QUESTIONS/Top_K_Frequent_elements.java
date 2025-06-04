class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        if(nums.length < 2){
            return nums;
        }
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int x:nums){
            map.put(x,map.getOrDefault(x,0) + 1);
        }
         PriorityQueue<Map.Entry<Integer, Integer>> pq =
            new PriorityQueue<>((a, b) -> a.getValue() - b.getValue());

            for(Map.Entry<Integer,Integer> entry:map.entrySet()){
                pq.offer(entry);

                if(pq.size() > k){
                    pq.poll();
                }

            }
            int[] arr = new int[pq.size()];
            int index = 0;
            while(!pq.isEmpty()){
                arr[index++] = pq.poll().getKey();
            }
      
         return arr;
       }
       

      }
    
