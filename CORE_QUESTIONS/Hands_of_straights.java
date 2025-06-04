class Solution {
    public boolean isNStraightHand(int[] hand, int groupSize) {
        if(hand.length % groupSize != 0){
            return false;
        }
       TreeMap<Integer,Integer> map = new TreeMap<>();
       for(int x:hand){
        map.put(x,map.getOrDefault(x,0) + 1);
       }
       while(!map.isEmpty()){
        int curr = map.firstKey();
        for(int i = 0;i<groupSize;i++){
            int first  = curr + i;
            if(!map.containsKey(first)){
                return false;

            } 

            map.put(first,map.get(first) - 1);
            if(map.get(first) == 0){
                map.remove(first);
            }
        }
       }
       return true;
        
    }
}