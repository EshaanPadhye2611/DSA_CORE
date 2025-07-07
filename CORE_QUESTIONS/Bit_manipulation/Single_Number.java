class Solution {
    public int[] singleNumber(int[] nums) {
        TreeMap<Integer,Integer> map = new TreeMap<>();
        int[] arr = new int[2];
        int index = 0;
        for(int x:nums){
            map.put(x,map.getOrDefault(x,0) + 1);
        }
        for (Map.Entry<Integer, Integer> entry : map.entrySet()){
            if(entry.getValue() == 1){
                arr[index++] = entry.getKey();
            }
        }
        return arr;
    }
}