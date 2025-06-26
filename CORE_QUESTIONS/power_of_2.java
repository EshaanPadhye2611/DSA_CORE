class Solution {
    public boolean isPowerOfTwo(int n) {
        if( n < 1) return false;
        if(n == 1) return true;
        return checkPower(n, 2);
        
    }
    static boolean checkPower(int n , long ans){
        if( ans == n) return true;
        else if(ans > n) return false;
        
        return  checkPower(n,ans * 2);

    }
}