class Solution {
    public int trap(int[] height) {
        int[] left = new int[height.length];
        int[] right = new int[height.length];
        left[0] = height[0];
        for(int i = 1;i<height.length;i++){
            left[i] = Math.max(left[i-1], height[i]);
        }
        
         right[right.length - 1] = height[height.length - 1];
        for(int i = height.length - 2;i>=0;i--){
            right[i] = Math.max(right[i+1], height[i]);
        }
        
        int total = 0;
        for(int i = 0;i<height.length;i++){
            int l = left[i];
            int r = right[i];
            if(height[i] < l && height[i] < r){
                total += Math.min(left[i], right[i]) - height[i];
            }
        }
        return total;
    }
}