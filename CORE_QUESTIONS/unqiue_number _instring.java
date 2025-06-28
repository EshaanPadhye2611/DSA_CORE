class Solution {
    public char kthCharacter(int k) {

        StringBuilder sb = new StringBuilder();
        return lastCharacter('a',k);

        
    }
    static char lastCharacter( StringBuilder sb,int k){
      if(sb.length() > k){
        return sb.charAt(k-1);
      }
      int org = sb.length();
      for(int i =0;i<org;i++){
        if(sb.charAt(i) == 'z') sb.append('a');
        else {
            sb.append((char)(sb.charAt(i) +  1));
        }
      }
      return lastCharacter(sb,k);

    }
}