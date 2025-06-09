class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        HashMap<Integer,Integer> map = new HashMap<>();
        ArrayList<Integer> list = new ArrayList<>();
       
        for(int x:nums1){
            map.put(x,map.getOrDefault(x,0) + 1);
        }
        for(int num:nums2){
            if(map.containsKey(num) && map.get(num) > 0){
                list.add(num);
                map.put(num,map.get(num) - 1);
            }
        }
         int[] arr = new int[list.size()];
         int index = 0;
        for(int x:list){
            arr[index++] = x;

        }
        return arr;

        
    }
}