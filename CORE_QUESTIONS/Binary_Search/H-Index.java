class Solution {
    public int hIndex(int[] citations) {
         if(citations.length == 1 && citations[0] != 0) return 1;
         if(citations.length == 1 && citations[0] == 0) return 0;
        int start = 0;
        int end = citations.length;
        int result = 0;
        while(start<=end){
            int mid  = start + (end -  start) / 2;
            int count = 0;
            for(int i = 0;i<citations.length;i++){
                if(mid <= citations[i]){
                    count++;
                }
            }
            if(count >= mid){
                result = mid;
                start = mid + 1;
            }else{
                end = mid  - 1;
            }
        }
        return result;
    }
}