class Solution {
    public char nextGreatestLetter(char[] letters, char target) {
        int start = 0;
        int end = letters.length -1;
        char curr = '\0';
        while(start <= end){
            int mid  = start + (end - start) / 2;
            if(letters[mid] > target){
                  curr = letters[mid];
                  end = mid - 1;
            }else if(letters[mid] <  target){
                start = mid + 1;
            }else{
                start = mid  + 1;
            }
        }
        if(curr != '\0'){
            return curr;
        }
        return letters[0];
        
    }
}