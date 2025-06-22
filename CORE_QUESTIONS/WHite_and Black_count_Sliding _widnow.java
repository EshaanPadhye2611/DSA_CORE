class Solution {
    public int minimumRecolors(String blocks, int k) {
        if(blocks.length() == 1 && k > 1) return -1;
        if(blocks.length() == 1){
            if(blocks.charAt(0) == 'W') return 1;
            else return 0;
        }
        int count  = 0;
        for(int i = 0;i<k;i++){
            if(blocks.charAt(i) == 'W') count++;
        }
        int result = count;
        for(int i = k;i<blocks.length();i++){
            if(blocks.charAt(i - k) == 'W') count--;
            if(blocks.charAt(i) == 'W') count++;
            result = Math.min(result,count);
        }
        return result;
    }
}