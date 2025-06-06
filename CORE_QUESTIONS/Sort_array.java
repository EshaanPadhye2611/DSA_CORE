class Solution {
    public int[] sortArray(int[] nums) {
        if(nums.length == 1){
            return nums;
        }
     PriorityQueue<Integer> pq = new PriorityQueue<>();
     for(int x: nums){
        pq.offer(x);
     }
     int[] arr = new int[nums.length];
     int index = 0;
     while(!pq.isEmpty()){
        int top = pq.poll();
        arr[index++] = top;

     }
        return arr;
    }
}