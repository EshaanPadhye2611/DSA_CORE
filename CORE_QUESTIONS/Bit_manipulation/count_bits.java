class Solution {
    public int[] countBits(int n) {
        int[] arr = new int[n+1];
        arr[0] = 0;
        for(int i = 1;i<=n;i++){
            int count = 0;
            int ans = i;
            while( ans > 0){
                if((ans & 1) == 1) count++;
                ans = ans >> 1;
            }
            arr[i] = count;
            
        }
        return arr;
    }
}