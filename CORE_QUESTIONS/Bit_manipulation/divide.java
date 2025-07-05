class Solution {
    public int divide(int dividend, int divisor) {

        if( dividend == Integer.MIN_VALUE && divisor == -1) return Integer.MAX_VALUE;
       
       
        
        int sum  = 0;
        long n = Math.abs((long)dividend);
        long d = Math.abs((long)divisor);
       while(n >= d){
        int count = 0;
        while( n >= (d << (count + 1))){
            count++;
        }
        sum += (1 << count);
        n = n - (d << count);
       }
       
      return (dividend < 0) ^ (divisor < 0) ? -sum : sum;

    }
}