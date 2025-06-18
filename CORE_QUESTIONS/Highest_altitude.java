class Solution {
    public int largestAltitude(int[] gain) {
        int sum  = 0;
        int[] prefix = new int[gain.length + 1];
        int max = Integer.MIN_VALUE;
        int index = 0;
        for(int x:gain){
            sum += x;
            prefix[index++] = sum;
        }
        for(int x:prefix){
            if(max < x){
                max = x;
            }
        }
        
        return max;
    }
}