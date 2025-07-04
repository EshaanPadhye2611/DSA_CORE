class Solution {
    public int countConsistentStrings(String allowed, String[] words) {
        StringBuilder sb = new StringBuilder(allowed);
        int result = 0;
        HashSet<Character> set = new HashSet<>();
        for(int i = 0;i<sb.length();i++){
            set.add(sb.charAt(i));
        }

        for(String s: words){
            for(char c: s.toCharArray()){
                if(!set.contains(c)){
                  result++;
                  break;
                }
            }
        }
        return words.length - result;
        
    }
}