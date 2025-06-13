class Solution {
    public int minDays(int[] bloomDay, int m, int k) {
        if( m * k > bloomDay.length) return -1;
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        for(int x: bloomDay){
            if(x < min){
                min  = x;
            }
        }
        for(int x: bloomDay){
            if(x > max){
                max  = x;
            }
        }
        int start = min;
        int end = max;
        int cc = -1;
       
       
       
        while(start <= end){
             int mid = start + (end - start) / 2;
              int count  = 0;
            
             int bb = 0;

            
            for(int i = 0;i<bloomDay.length;i++){
           
            if(mid >= bloomDay[i]){
                count ++;
            }else{
                bb += count / k;
                count = 0;
               
                
            }
            
            }
             bb += count / k;
           
            if(bb < m){
                start  = mid + 1;
            }
            else{
                  end = mid - 1;
                  cc = mid;


            }
            

        }
        if(cc != -1){
            return cc;
        }
        return -1;
        
    }
}