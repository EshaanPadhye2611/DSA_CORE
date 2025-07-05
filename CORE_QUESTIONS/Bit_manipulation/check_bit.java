class Solution {
    public int minBitFlips(int start, int goal) {
        int num = Math.max(start,goal);
        String s = Integer.toBinaryString(num);
        int i =0;
        int count = 0;

        while(i < s.length()){
            if((start & 1) != (goal & 1)){
                count++;
            }
            start = start >> 1;
            goal = goal >> 1;
            i++;
        }
        return count;
    }
}