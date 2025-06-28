class Solution {
    public int totalNumbers(int[] digits) {
        Set<Integer> set = new HashSet<>();
        int n = digits.length;

        for(int i = 0;i<n;i++){
            if(digits[i] == 0) continue;
            for(int j = 0;j<n;j++){
                if(i == j) continue;
            for(int k =0;k<n;k++){
                if( i == j || i == k || j == k) continue;
                int num  = 100 * digits[i] + 10 * digits[j] + digits[k];
                if(num % 2 == 0) set.add(num);
            }
            }
        }
        return set.size();
        
    }
}