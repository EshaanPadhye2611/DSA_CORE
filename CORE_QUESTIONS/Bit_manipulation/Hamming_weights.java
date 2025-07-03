class Solution {
    public int hammingDistance(int x, int y) {
        int count  = 0;
        int result = Math.max(x,y);
        String binary = Integer.toBinaryString(result);
        int i =0;
        while(i < binary.length()){
            if((x & 1) != (y & 1)) count ++;

            x = x >> 1;
            y = y >> 1;
            i ++;
        }
        return count;
    }
}