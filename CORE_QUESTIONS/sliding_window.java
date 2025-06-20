class Solution {
    public int countKConstraintSubstrings(String s, int k) {
        int left = 0;
        int result = 0;
        int[] freq = new int[2];
        for(int right = 0;right<s.length();right++){
            freq[s.charAt(right) - '0']++;
            while(freq[0] > k && freq[1] > k){
                
                freq[s.charAt(left) - '0']--;
                left++;
            }
            result += right- left + 1;
        }
        return result;
    }
}