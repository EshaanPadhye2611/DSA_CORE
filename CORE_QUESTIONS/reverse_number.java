public class reverse_number {
    public static void main(String[] args) {
        int result = helper(1234,0);
        System.out.println(result);
        
    }
//     static int reverseNumber(int n){
//    return helper(n,0);

static int helper(int n, int rev ){
    if(n == 0) return rev;
    int digit = n % 10;
    return helper(n/10, rev * 10 + digit);
}
}