public class Palindrome {
    public static void main(String[] args) {
        boolean answer =  isPalindrome("eshaan");
        System.out.println(answer);

    }
      static boolean isPalindrome( String s){
            return checkPalindrome(0,s.length()-1,s);
        }
  static  boolean checkPalindrome(int left, int right, String s){
            if(s.charAt(left) != s.charAt(right)){
                return false;
            }else if(s.charAt(left) == s.charAt(right) && left ==  right){
                return true;

            }else {
                return checkPalindrome(left + 1, right - 1,s);
            }
        }
}
